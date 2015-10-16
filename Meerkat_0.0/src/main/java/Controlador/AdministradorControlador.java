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
    
    public AdministradoresFacade administradoresFacade;
    
    String pagina = null;
    String id = null;
    String nombre = null;
    String apellido = null;
    String telefono = null;
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(administradoresFacade==null) administradoresFacade = new AdministradoresFacade();
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        id = request.getParameter("id");
    	nombre = request.getParameter("nombre");
    	apellido = request.getParameter("apellido");
    	telefono = request.getParameter("telefono");
        switch (Puerta) {
	        case "Cancelar":
				cerrar_sesion(s, request);
				break;
	        case "consultar_inventario":
	        	Consultar_Inventario(s);
	        	break;
	        case "consultar_clientes":
	        	Consultar_Clientes(s);
	        	break;
	        case "Pagarm":
	        	Pagar_Nomina();
	        	break;
	        case "consultar_totalVentas":
	        	Consultar_Total_Ventas(s);
	        	break;
	        case "ir_administrador":
	        	Entrar(s,request);
	        	break;
	        case "crear_despachador":
	        	pagina = "nominaempleadosvista/creardespachador.jsp";
	        	break;
	        case "crear_mesero":
	        	pagina = "nominaempleadosvista/crearmesero.jsp";
	        	break;
	        case "productos_masvendidos":
	        	Consultar_Productos_Mas_Vendidos(s);
	        	break;
	        case "datos_mesero":
	        	Contratar_Mesero(s);
	        	break;
	        case "datos_despachador":
	        	Contratar_Despachador(s);
	        	break;
	        default:
				pagina = "index.jsp";
				break;
        }  
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	public void cerrar_sesion(HttpSession s, HttpServletRequest request){
    	administradoresFacade.setAdministrador(null);
		s = request.getSession(false);
    	s.invalidate();
    	pagina = "index.jsp";
	}
	
	public void Consultar_Inventario(HttpSession s){
		try{ s.setAttribute("todos-los-insumos", administradoresFacade.getAdministrador().getLista_insumos());
        	pagina = "/consultarinventariovista/listainventario.jsp";
		}catch (Exception e) { System.out.println("Error en la base de datos al consultar el inventario.");}
	}
	
	public void Consultar_Clientes(HttpSession s){
		try{s.setAttribute("todos-los-clientes", administradoresFacade.getAdministrador().getLista_clientes());
		pagina = "/basedatosusuariosvista/listaclientes.jsp";
		}catch (Exception e) { System.out.println("Error en la base de datos al consultar los clientes.");}
	}

	public void Consultar_Total_Ventas(HttpSession s){
		try { s.setAttribute("todas-ventas", administradoresFacade.getAdministrador().getTotal_ventas());
			pagina = "/consultasgeneralesenlaBDvista/totalventas.jsp";
		}catch (Exception e){ System.out.println("Error en la base de datos al consultar el total de las ventas.");}
	}
	
	public void Entrar(HttpSession s, HttpServletRequest request) {
		try { administradoresFacade.Consultar_Administradores();
		} catch (Exception e1) { System.out.println("Error al leer los administradores desde la base de datos");}
		String claveaux = request.getParameter("pass");
    	if(!administradoresFacade.getAdministrador().getClave().equalsIgnoreCase(claveaux)) return;
    	pagina = "/consultarinventariovista/funcionesadministrador.jsp";
	}
	

	public void Consultar_Productos_Mas_Vendidos(HttpSession s){
		try {s.setAttribute("productos-masvendidos", administradoresFacade.getAdministrador().getProductos_mas_vendidos());
		} catch (Exception e) {System.out.println("Error en la base de datos al consultar los productos más vendidos");}
    	pagina = "/consultasgeneralesenlaBDvista/productosmasvendidos.jsp";
	}

	public void Contratar_Mesero(HttpSession s){
		try {administradoresFacade.getAdministrador().Contratar_Mesero(id, nombre, apellido, telefono);
		}catch (Exception e) {System.out.println("Error en la base de datos al crear un mesero");}
		pagina = "index.jsp";
	}
	
	public void Contratar_Despachador(HttpSession s){
		try {administradoresFacade.getAdministrador().Contratar_Despachador(id, nombre, apellido, telefono);
		}catch (Exception e) {System.out.println("Error en la base de datos al crear un mesero");}
		pagina = "index.jsp";
	}
	
	public void Pagar_Nomina(){
		NominaFacade nominaFacade = new NominaFacade();
		try {
			nominaFacade.Pagar_Nomina();
		} catch (Exception e) {
			System.out.println("Error al pagarle al los empleados");
		}
    	System.out.println("Pagados");
    	pagina = "index.jsp";
	}

}




