package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Presentacion.*;

@WebServlet("/administrador")
public class AdministradorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdministradorControlador() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
		if(s.getAttribute("FacadeAdministrador") == null){
			AdministradoresFacade administradoresFacade = new AdministradoresFacade();
			s.setAttribute("FacadeAdministrador", administradoresFacade);
		}
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        String pagina = "index.jsp";
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        switch (Puerta) {
	        case "Cancelar":
				pagina = cerrar_sesion(s, request);
				break;
	        case "consultar_inventario":
	        	pagina = Consultar_Inventario(s);
	        	break;
	        case "ingresar_insumo":
	        	pagina = "consultarinventariovista/ingresarinsumo.jsp";
	        	break;
	        case "consultar_clientes":
	        	pagina = Consultar_Clientes(s);
	        	break;
	        case "Pagarm":
	        	pagina = Pagar_Nomina();
	        	break;
	        case "consultar_totalVentas":
	        	pagina = Consultar_Total_Ventas(s);
	        	break;
	        case "ir_administrador":
	        	pagina = Entrar(s,request);
	        	break;
	        case "crear_despachador":
	        	pagina = "nominaempleadosvista/creardespachador.jsp";
	        	break;
	        case "crear_mesero":
	        	pagina = "nominaempleadosvista/crearmesero.jsp";
	        	break;
	        case "productos_masvendidos":
	        	pagina = Consultar_Productos_Mas_Vendidos(s);
	        	break;
	        case "datos_mesero":
	        	pagina = Contratar_Mesero(s,id,nombre,apellido,telefono);
	        	break;
	        case "datos_despachador":
	        	pagina = Contratar_Despachador(s,id,nombre,apellido,telefono);
	        	break;
	        case "datos_insumo":
	        	pagina = registrar_insumo(s, request);
	        	break;
	        default:
				pagina = "index.jsp";
				break;
        }  
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	public String cerrar_sesion(HttpSession s, HttpServletRequest request){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		administradoresFacade.setAdministrador(null);
		s = request.getSession(false);
    	s.invalidate();
    	return "index.jsp";
	}
	
	
	public String Consultar_Inventario(HttpSession s){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		try{ s.setAttribute("todos-los-insumos", administradoresFacade.getAdministrador().Consultar_Insumos());
		}catch (Exception e) { 
			System.out.println("Error en la base de datos al consultar el inventario.");
			s.setAttribute("ubicacion", "consultarinventario");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
		return "/consultarinventariovista/listainventario.jsp";
	}
	
	public String Consultar_Clientes(HttpSession s){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		try{s.setAttribute("todos-los-clientes", administradoresFacade.getAdministrador().Consultar_Clientes());
		}catch (Exception e) { 
			System.out.println("Error en la base de datos al consultar los clientes.");
			s.setAttribute("ubicacion", "consultar_clientes");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
		return "/basedatosusuariosvista/listaclientes.jsp";
	}

	public String Consultar_Total_Ventas(HttpSession s){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		try { s.setAttribute("todas-ventas", administradoresFacade.getAdministrador().Consultar_total_Ventas());
		}catch (Exception e){ 
			System.out.println("Error en la base de datos al consultar el total de las ventas.");
			s.setAttribute("ubicacion", "consultar_total_ventas");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
		return "/consultasgeneralesenlaBDvista/totalventas.jsp";
	}
	
	public String Entrar(HttpSession s, HttpServletRequest request) {
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {
			System.out.println("Error al consultar el administrador");
			s.setAttribute("ubicacion", "entrar, consultar administradores");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
		String claveaux = request.getParameter("pass");
    	if(!administradoresFacade.getAdministrador().getClave().equalsIgnoreCase(claveaux)) return "null";
    	return "/consultarinventariovista/funcionesadministrador.jsp";
	}
	

	public String Consultar_Productos_Mas_Vendidos(HttpSession s){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		try {s.setAttribute("productos-masvendidos", administradoresFacade.getAdministrador().Productos_mas_vendidos());
		} catch (Exception e) {
			System.out.println("Error en la base de datos al consultar los productos más vendidos");
			s.setAttribute("ubicacion", "consultar productos más vendidos");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
    	return "/consultasgeneralesenlaBDvista/productosmasvendidos.jsp";
	}

	public String Contratar_Mesero(HttpSession s, String id, String nombre, String apellido, String telefono){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		try {administradoresFacade.getAdministrador().Contratar_Mesero(id, nombre, apellido, telefono);
		}catch (Exception e) {
			System.out.println("Error en la base de datos al crear un mesero");
			s.setAttribute("ubicacion", "contratar mesero");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
		return "index.jsp";
	}
	
	public String Contratar_Despachador(HttpSession s, String id, String nombre, String apellido, String telefono){
		AdministradoresFacade administradoresFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");	
		try {administradoresFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		try {administradoresFacade.getAdministrador().Contratar_Despachador(id, nombre, apellido, telefono);
		}catch (Exception e) {
			System.out.println("Error en la base de datos al crear un despachador");
			s.setAttribute("ubicacion", "contratar despachador");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
		}
		return "index.jsp";
	}
	
	private String registrar_insumo(HttpSession s, HttpServletRequest request){
		AdministradoresFacade administradorFacade = (AdministradoresFacade) s.getAttribute("FacadeAdministrador");
		try {administradorFacade.Consultar_Administradores();} 
		catch (Exception e) {System.out.println("Error al consultar el administrador");}
		String id = request.getParameter("id");
    	String nombre = request.getParameter("nombre");
    	int valor = Integer.parseInt(request.getParameter("valor"));
    	try{ administradorFacade.getAdministrador().Agregar_insumo(id, nombre, valor);}
    	catch (Exception e) { 
    		System.out.println("Error en base de datos al agregar un nuevo insumo.");
    		s.setAttribute("ubicacion", "registrar insumo");
			s.setAttribute("error",e);
			return "/errores/error.jsp";
    	}   	
    	return "index.jsp";
	}
	
	public String Pagar_Nomina(){
		NominaFacade nominaFacade = new NominaFacade();
		try { nominaFacade.Pagar_Nomina();} 
		catch (Exception e) {
			System.out.println("Error al pagarle al los empleados");}
    	System.out.println("Pagados");
    	return "index.jsp";
	}

}




