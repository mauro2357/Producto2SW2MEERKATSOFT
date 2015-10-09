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
    
    public static PedidosFacade pedidosFacade = new PedidosFacade(); 
    public static MeserosFacade meserosFacade = new MeserosFacade(); 
    public static MesasFacade mesasFacade = new MesasFacade(); 
    public static ClientesFacade clientesFacade = new ClientesFacade(); 
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        System.out.println(Puerta);
        String pagina = null;
        if(Puerta.equalsIgnoreCase("Cancelar")){
        	meserosFacade.mesero = null;
        	s = request.getSession(false);
        	s.invalidate();
        	pagina = "index.jsp";
        }
        if(Puerta.equalsIgnoreCase("imprimirmeseros")){ //Lo ejecuta controller
        	try { meserosFacade.Consultar_meseros(); } 
        	catch (Exception e) {System.out.println("Error en base de datos al imprimir meseros.");}
        	if(meserosFacade != null){
	        	pagina = "/consultarmeserosvista/listameseros.jsp"; //A esta página jsp se enviarán los atributos
	        	s.setAttribute("todos-los-meseros", meserosFacade.listameseros); //Envíamos a la jsp anteriormente mencionada la lista de meseros con el nombre de "todos-los-meseros"
	        }
        }
        	
        if(Puerta.equalsIgnoreCase("definirmesero")){ 
        	String meseroi = request.getParameter("meseroi"); 
        	meserosFacade.Definir_mesero(meseroi); 
        	pagina = "/consultarproductosvista/consultarproductos.jsp"; 
        }
        if(Puerta.equalsIgnoreCase("listar_mesas")){ 
        	try { s.setAttribute("lista-mesas", mesasFacade.Consultar_mesas());} 
        	catch (Exception e) {System.out.println("Error en base de datos al listar mesas.");}
        	pagina = "/consultarproductosvista/consultarproductositems/selectmesas.jsp"; 
        }
        if(Puerta.equalsIgnoreCase("listar_clientes")){ 
        	try { s.setAttribute("lista-clientes", clientesFacade.Consultar_clientes());} 
        	catch (Exception e) {System.out.println("Error en base de datos al listar clientes.");}
        	pagina = "/consultarproductosvista/consultarproductositems/selectclientes.jsp"; 
        }
        if(Puerta.equalsIgnoreCase("botones")){ //controller
			pagina = "/consultarproductosvista/consultarproductositems/botonproductos.jsp"; 
			s.setAttribute("todos-los-productos", meserosFacade.mesero.productos);
        }
        if(Puerta.equalsIgnoreCase("ingresarproducto")){ 
        	String id = request.getParameter("idp"); 
        	try { meserosFacade.mesero.adicionarproducto(id);} 
        	catch (Exception e) {System.out.println("Error en base de datos al adicionar producto.");}
        	System.out.println(meserosFacade.mesero.pedido_sin_asignar.getCuerpo());
        	s.setAttribute("productos-pedido", meserosFacade.mesero.pedido_sin_asignar.getCuerpo()); 
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        }
        if(Puerta.equalsIgnoreCase("listarpedidoactual")){ //Lo ejecuta controller
        	if(meserosFacade.mesero.pedido_sin_asignar != null) s.setAttribute("productos-pedido", meserosFacade.mesero.pedido_sin_asignar.getCuerpo()); 
        	else s.setAttribute("productos-pedido",null);
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";	
        }
        if(Puerta.equalsIgnoreCase("Enviar pedido")){       //Listo
        	String cliente = request.getParameter("cliente");
        	String mesero = meserosFacade.mesero.getId();
        	String mesa = request.getParameter("mesa");
        	Mesa mesam = null;
			try {
				mesam = mesasFacade.Buscar_Mesa(mesa);
			} catch (Exception e1) {
				System.out.println("Error al consultar la ubicación en memoria de la mesa");
			}
        	String cajero = request.getParameter("cajero");
        	Pedido pedido = meserosFacade.mesero.pedido_sin_asignar;
        	Calendar x = Calendar.getInstance();
        	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
        	try { meserosFacade.mesero.finiquitarpedido(pedido,cliente,mesero,mesam,cajero,fecha);} 
        	catch (Exception e) {System.out.println("Error en base de datos al enviar pedido.");}
        	meserosFacade.mesero.pedido_sin_asignar = null;
        	pagina = "/index.jsp";
        }
        if(Puerta.equalsIgnoreCase("crear_usuario")){ //Lo ejecuta mesero
        	pagina = "/basedatosusuariosvista/Crearusuario.jsp";
        }
        if(Puerta.equalsIgnoreCase("datos_usuario")){ //Lo ejecuta mesero
        	String id = request.getParameter("id");
        	String nombre = request.getParameter("nombre");
        	String apellido = request.getParameter("apellido");
        	String sexo = request.getParameter("sexo");
        	int puntos = Integer.parseInt(request.getParameter("puntos"));
        	String musica = request.getParameter("musica");
        	String email = request.getParameter("email");
        	String telefono = request.getParameter("telefono");
        	try { clientesFacade.Registrar_cliente(id, nombre, apellido, sexo, puntos, musica, email, telefono);} 
        	catch (Exception e) { System.out.println("Error en base de datos al agregar datos del usuario.");}
        	pagina = "index.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
