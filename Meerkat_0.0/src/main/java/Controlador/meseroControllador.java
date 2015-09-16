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
    public static MeserosFacade consultarmeserosFacade = new MeserosFacade(); //Cambiar nombre de Facade
    public static MesasFacade consultarmesasFacade = new MesasFacade(); //Cambiar nombre de Facade
    public static ClientesFacade crearcliente = new ClientesFacade(); //Cambiar nombre de Facade
    public static MesasFacade mesasFacade = new MesasFacade(); //Cambiar nombre de Facade
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        String pagina = null;
        if(Puerta.equalsIgnoreCase("Terminar"))
        {
        	s = request.getSession(false);
        	s.invalidate();
        	pagina = "index.jsp";
        }
        if(Puerta.equalsIgnoreCase("imprimirmeseros")){ //Lo ejecuta controller
        	try { //Try catch para intentar conectar a la BD
        		consultarmeserosFacade.main(); //Ejecuta el main del Facade, esto obtiene todos los meseros que están en la BD
			} catch (Exception e) {
				e.printStackTrace(); //Devuelve un error si no conectó correctamente a la BD
			}
        	pagina = "/consultarmeserosvista/listameseros.jsp"; //A esta página jsp se enviarán los atributos
        	s.setAttribute("todos-los-meseros", consultarmeserosFacade.listameseros); //Envíamos a la jsp anteriormente mencionada la lista de meseros con el nombre de "todos-los-meseros"
        }
        if(Puerta.equalsIgnoreCase("definirmesero")){ //Lo ejecuta mesero
        	String meseroi = request.getParameter("meseroi"); //Capturamos la id del mesero que está ejecutando
        	//el botón que se presionó desde Index.
        	consultarmeserosFacade.definirmesero(meseroi); //Lo enviamos para definir el mesero en el servidor.
        	try {
				s.setAttribute("lista-mesas", mesasFacade.main());
				s.setAttribute("lista-clientes", crearcliente.main());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	pagina = "/consultarproductosvista/consultarproductos.jsp"; //Rederigimos a consultarprodutos.
        }
        if(Puerta.equalsIgnoreCase("botones")){ //controller
			pagina = "/consultarproductosvista/consultarproductositems/botonproductos.jsp"; //Le vamos a mandar a esta jsp todos los productos.
        	s.setAttribute("todos-los-productos", consultarmeserosFacade.mesero.productos); //Le mandamos los productos a la jsp encargada de imprimirlos
        }
        if(Puerta.equalsIgnoreCase("ingresarproducto")){ //Lo ejecuta controller
        	String id = request.getParameter("idp"); //Este id lo recibimos del boton del producto que presionamos
        	//s.setAttribute("id-producto",id); //Lo colocamos como atributo 
        	try {
				consultarmeserosFacade.mesero.adicionarproducto(id); //Le decimos al mesero que busque cuál es el producto (en memoria del servidor) y lo agregue al pedido actual
			} catch (Exception e) {
				e.printStackTrace();
			}
        	s.setAttribute("productos-pedido", consultarmeserosFacade.mesero.pedido_sin_asignar.getCuerpo()); //enviamos los productos que lleva el pedido actual
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        }
        if(Puerta.equalsIgnoreCase("listarpedidoactual")){ //Lo ejecuta controller
        	if(consultarmeserosFacade.mesero.pedido_sin_asignar != null) s.setAttribute("productos-pedido", consultarmeserosFacade.mesero.pedido_sin_asignar.getCuerpo()); //Enviamos los productos que lleva el pedido (inicio)
        	else s.setAttribute("productos-pedido",null);
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";	
        }
        if(Puerta.equalsIgnoreCase("Enviar pedido")){       //Listo
        	String cliente = request.getParameter("cliente");
        	String mesero = consultarmeserosFacade.mesero.getId();
        	String mesa = request.getParameter("mesa");
        	String cajero = request.getParameter("cajero");
        	Pedido pedido = consultarmeserosFacade.mesero.pedido_sin_asignar;
        	Calendar x = Calendar.getInstance();
        	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
        	try {
				consultarmeserosFacade.mesero.finiquitarpedido(pedido,cliente,mesero,mesa,cajero,fecha);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	consultarmeserosFacade.mesero.pedido_sin_asignar = null;
        	pagina = "/index.jsp";
        }
        if(Puerta.equalsIgnoreCase("crear_usuario")){ //Lo ejecuta mesero
        	pagina = "/basedatosusuariosvista/crearusuario.jsp";
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
        	try {
        		crearcliente.Registrarcliente(id, nombre, apellido, sexo, puntos, musica, email, telefono);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
        	pagina = "index.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
