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

import Negocio.pedido.*;
import Presentacion.*;

@WebServlet("/mesero")
public class MeseroControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MeseroControllador() {
        super();
    }
     
    public MeserosFacade meserosFacade;
    String pagina = null;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(meserosFacade==null) meserosFacade = new MeserosFacade();
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        switch (Puerta) {
	        case "Cancelar":
					cerrar_sesion(s, request);
					break;
	        case "imprimirmeseros":
	        	imprimir_meseros(s);
				break;
	        case "definirmesero":
	        	definir_mesero(s, request);
				break;
	        case "listar_mesas":
	        	listar_mesas(s);
				break;
	        case "listar_clientes":
	        	listar_clientes(s);
				break;
	        case "botones":
	        	listar_botones_productos(s);
				break;
	        case "ingresarproducto":
	        	ingresar_producto(s, request);
				break;
	        case "listarpedidoactual":
	        	listar_pedido_actual(s);
				break;
	        case "Enviar pedido":
	        	enviar_pedido(s, request);
				break;
	        case "crear_usuario":
	        	pagina = "/basedatosusuariosvista/Crearusuario.jsp";
				break;
	        case "datos_usuario":
	        	registrar_usuario(s, request);
				break;	
			default:
				pagina = "index.jsp";
				break;
		}
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	public void cerrar_sesion(HttpSession s, HttpServletRequest request){
    	meserosFacade.setMesero(null);
		s = request.getSession(false);
    	s.invalidate();
    	pagina = "index.jsp";
	}
	
	public void imprimir_meseros(HttpSession s){
		try { 
	        	pagina = "/consultarmeserosvista/listameseros.jsp";
	        	System.out.println(meserosFacade.getMesero());
	        	System.out.println(meserosFacade.Consultar_meseros());
	        	s.setAttribute("todos-los-meseros", meserosFacade.Consultar_meseros());
        } 
    	catch (Exception e) {
    		System.out.println("Error en base de datos al imprimir meseros.");
    		System.out.println(e);}
		
	}
	
	public void definir_mesero(HttpSession s, HttpServletRequest request){
		String meseroi = request.getParameter("meseroi"); 
    	meserosFacade.Definir_mesero(meseroi); 
    	pagina = "/consultarproductosvista/consultarproductos.jsp"; 
	}
	
	public void listar_mesas(HttpSession s){ //Falta ADICIONAR productos a un PEDIDO ya INSTANCIADO
		try {
    		if(meserosFacade.getMesero().getMesas_libres()==null) s.setAttribute("lista-mesas", meserosFacade.mesero.getMesas());
    		else s.setAttribute("lista-mesas", meserosFacade.getMesero().getMesas_libres());
    	}
    	catch (Exception e) {System.out.println("Error en base de datos al listar mesas.");}
    	pagina = "/consultarproductosvista/consultarproductositems/selectmesas.jsp"; 
	}
	
	public void listar_clientes(HttpSession s){
		try { s.setAttribute("lista-clientes", meserosFacade.getMesero().getClientes());} 
    	catch (Exception e) {System.out.println("Error en base de datos al listar clientes.");}
    	pagina = "/consultarproductosvista/consultarproductositems/selectclientes.jsp"; 
	}
	
	public void listar_botones_productos(HttpSession s){
		pagina = "/consultarproductosvista/consultarproductositems/botonproductos.jsp"; 
		s.setAttribute("todos-los-productos", meserosFacade.getMesero().getProductos());
	}
	
	public void ingresar_producto(HttpSession s, HttpServletRequest request){
		String id = request.getParameter("idp"); 
    	try { meserosFacade.getMesero().adicionarproducto(id);} 
    	catch (Exception e) {System.out.println("Error en base de datos al adicionar producto.");}
    	System.out.println(meserosFacade.getMesero().getPedido_sin_asignar().getCuerpo());
    	s.setAttribute("productos-pedido", meserosFacade.getMesero().getPedido_sin_asignar().getCuerpo()); 
    	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
	}
	
	public void listar_pedido_actual(HttpSession s){
		if(meserosFacade.getMesero().pedido_sin_asignar != null) s.setAttribute("productos-pedido", meserosFacade.getMesero().getPedido_sin_asignar().getCuerpo()); 
    	else s.setAttribute("productos-pedido",null);
    	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";	
	}
	
	public void enviar_pedido(HttpSession s, HttpServletRequest request){
		String cliente = request.getParameter("cliente");
    	String mesero = meserosFacade.getMesero().getId();
    	String mesa = request.getParameter("mesa");
    	Mesa mesam = null;
		try { mesam = meserosFacade.getMesero().Definir_Mesa(mesa);} 
		catch (Exception e1) {System.out.println("Error al consultar la ubicación en memoria de la mesa");}
    	String cajero = request.getParameter("cajero");
    	Pedido pedido = meserosFacade.getMesero().getPedido_sin_asignar();
    	Calendar x = Calendar.getInstance();
    	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
    	try { meserosFacade.getMesero().finiquitarpedido(pedido,cliente,mesero,mesam,cajero,fecha);} 
    	catch (Exception e) {System.out.println("Error en base de datos al enviar pedido.");}
    	meserosFacade.mesero.setPedido_sin_asignar(null);
    	try { meserosFacade.getMesero().Ocupar_Mesa(mesam);
		} catch (Exception e) {System.out.println("Error en la base de datos al ocupar la mesa"); }
    	pagina = "/index.jsp";
	}
	
	public void registrar_usuario(HttpSession s, HttpServletRequest request){
		String id = request.getParameter("id");
    	String nombre = request.getParameter("nombre");
    	String apellido = request.getParameter("apellido");
    	String sexo = request.getParameter("sexo");
    	int puntos = Integer.parseInt(request.getParameter("puntos"));
    	String musica = request.getParameter("musica");
    	String email = request.getParameter("email");
    	String telefono = request.getParameter("telefono");
    	try { meserosFacade.getMesero().Registrar_Cliente(id, nombre, apellido, sexo, puntos, musica, email, telefono);} 
    	catch (Exception e) { System.out.println("Error en base de datos al agregar datos del usuario.");}
    	pagina = "index.jsp";
	}

}
