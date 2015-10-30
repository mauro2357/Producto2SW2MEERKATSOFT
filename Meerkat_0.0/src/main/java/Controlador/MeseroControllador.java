package Controlador;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Negocio.pedido.Mesa;
import Negocio.pedido.Pedido;
import Presentacion.*;

@WebServlet("/mesero")
public class MeseroControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MeseroControllador() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
		if(s.getAttribute("FacadeMesero") == null){
			MeserosFacade meserosFacade = new MeserosFacade();
			s.setAttribute("FacadeMesero", meserosFacade);
		}
		String Puerta = null;
        String pagina = null;
        Puerta = request.getParameter("entrar");
        switch (Puerta) {
	        case "Cancelar":
				pagina = cerrar_sesion(s, request);
				break;
	        case "imprimirmeseros":
	        	pagina = imprimir_meseros(s);
				break;
	        case "definirmesero":
	        	pagina = definir_mesero(s, request);
				break;
	        case "listar_mesas":
	        	pagina = listar_mesas(s);
				break;
	        case "listar_clientes":
	        	pagina = listar_clientes(s);
				break;
	        case "botones":
	        	pagina = listar_botones_productos(s);
				break;
	        case "ingresarproducto":
	        	pagina = ingresar_producto(s, request);
				break;
	        case "quitarproducto":
	        	pagina = quitar_producto(s, request);
				break;
	        case "listarpedidoactual":
	        	pagina = listar_pedido_actual(s);
				break;
	        case "Enviar pedido":
	        	pagina = enviar_pedido(s, request);
				break;
	        case "crear_usuario":
	        	pagina = "/Clientes/CrearCliente.jsp";
				break;
	        case "datos_usuario":
	        	pagina = registrar_usuario(s, request);
				break;	
			default:
				pagina = "index.jsp";
				break;
		}
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	private String cerrar_sesion(HttpSession s, HttpServletRequest request){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		try {meserosFacade.mesero.Limpiar_pedido_temporal(meserosFacade.mesero);} 
		catch (Exception e) {System.out.println("Error al limpiar el pedido temporal");}
		meserosFacade = new MeserosFacade();
		s.setAttribute("FacadeMesero", meserosFacade);
		s = request.getSession(false);
    	s.invalidate();
    	return "index.jsp";
	}
	
	private String imprimir_meseros(HttpSession s){
		try {
			MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
        	s.setAttribute("todos-los-meseros", meserosFacade.Consultar_meseros());
        	return "/Meseros/ListaMeseros.jsp";
        } 
    	catch (Exception e) {System.out.println("Error en base de datos al imprimir meseros.");}
		return null;
	}
	
	private String definir_mesero(HttpSession s, HttpServletRequest request){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		String meseroi = request.getParameter("meseroi"); 
    	meserosFacade.Definir_mesero(meseroi); 
    	return "/Productos/Productos.jsp"; 
	}
	
	private String listar_mesas(HttpSession s){
		try {
			MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
			meserosFacade.Consultar_meseros();
    		if(meserosFacade.mesero.mesas_libres==null) s.setAttribute("lista-mesas", meserosFacade.mesero.mesas);
    		else s.setAttribute("lista-mesas", meserosFacade.mesero.mesas_libres);
    		return "/Productos/Items/Mesas.jsp"; 
    	}
    	catch (Exception e) {System.out.println("Error en base de datos al listar mesas.");}
		return null;
	}
	
	private String listar_clientes(HttpSession s){
		try { 
			MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
			meserosFacade.Consultar_meseros();
			s.setAttribute("lista-clientes", meserosFacade.mesero.clientes);
			return "/Productos/Items/Clientes.jsp"; } 
    	catch (Exception e) {System.out.println("Error en base de datos al listar clientes.");}
    	return null; 
	}
	
	private String listar_botones_productos(HttpSession s){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		try {meserosFacade.Consultar_meseros();} 
		catch (Exception e) {System.out.println("Error al consultar los meseros");}
		s.setAttribute("todos-los-productos", meserosFacade.mesero.productos);
		return "/Productos/Items/Producto.jsp";
	}
	
	private String ingresar_producto(HttpSession s, HttpServletRequest request){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		String id = request.getParameter("idp"); 
    	try { meserosFacade.mesero.adicionarproducto(id);} 
    	catch (Exception e) {System.out.println("Error en base de datos al adicionar producto.");}
    	s.setAttribute("productos-pedido", meserosFacade.mesero.pedido_sin_asignar.cuerpo); 
    	return "/Productos/Items/Pedido.jsp";
	}
	
	private String quitar_producto(HttpSession s, HttpServletRequest request){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		String id = request.getParameter("idp"); 
    	try { meserosFacade.mesero.quitarproducto(id);} 
    	catch (Exception e) {System.out.println("Error en base de datos al quitar producto.");}
    	s.setAttribute("productos-pedido", meserosFacade.mesero.pedido_sin_asignar.cuerpo); 
    	return "/Productos/Items/Pedido.jsp";
	}
	
	private String listar_pedido_actual(HttpSession s){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		try { s.setAttribute("productos-pedido",meserosFacade.mesero.Generar_pedido_temporal(meserosFacade.mesero).cuerpo);
		}catch (Exception e) {System.out.println("Error al generar el pedido temporal");}
    	return "/Productos/Items/Pedido.jsp";	
	}
	
	private String enviar_pedido(HttpSession s, HttpServletRequest request){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		String cliente = request.getParameter("cliente");
    	String mesero = meserosFacade.mesero.id;
    	String mesa = request.getParameter("mesa");
    	Mesa mesam = null;
		try { mesam = meserosFacade.mesero.Definir_Mesa(mesa);} 
		catch (Exception e1) {System.out.println("Error al consultar la ubicación en memoria de la mesa");}
    	String cajero = request.getParameter("cajero");
    	Pedido pedido = meserosFacade.mesero.pedido_sin_asignar;
    	Calendar x = Calendar.getInstance();
    	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
    	try { meserosFacade.mesero.finiquitarpedido(pedido,cliente,mesero,mesam,cajero,fecha);} 
    	catch (Exception e) {System.out.println("Error en base de datos al enviar pedido.");}
    	meserosFacade.mesero.pedido_sin_asignar = null;
    	try { meserosFacade.mesero.Ocupar_Mesa(mesam);
		} catch (Exception e) {System.out.println("Error en la base de datos al ocupar la mesa"); }
    	return "/index.jsp";
	}
	
	private String registrar_usuario(HttpSession s, HttpServletRequest request){
		MeserosFacade meserosFacade = (MeserosFacade) s.getAttribute("FacadeMesero");
		String id = request.getParameter("id");
    	String nombre = request.getParameter("nombre");
    	String apellido = request.getParameter("apellido");
    	String sexo = request.getParameter("sexo");
    	int puntos = Integer.parseInt(request.getParameter("puntos"));
    	String musica = request.getParameter("musica");
    	String email = request.getParameter("email");
    	String telefono = request.getParameter("telefono");
    	try { meserosFacade.mesero.Registrar_Cliente(id, nombre, apellido, sexo, puntos, musica, email, telefono);} 
    	catch (Exception e) { System.out.println("Error en base de datos al agregar datos del usuario.");}
    	return "index.jsp";
	}

}
