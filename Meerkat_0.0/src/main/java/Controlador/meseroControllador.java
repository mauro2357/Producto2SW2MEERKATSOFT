package Controlador;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Negocio.tomaynotificacionpedidos.*;
import Presentacion.*;

/**
 * Servlet implementation class Controlador
 */
@WebServlet("/mesero")
public class meseroControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public meseroControllador() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static Pedido pedido=null;
    public static Mesero mesero=null;
    public static ArrayList<Producto> productos;
    public static consultarproductosFacade productosFacade = new consultarproductosFacade();
    public static generaciondepedidoFacade pedidosFacade = new generaciondepedidoFacade();
    public static ArrayList<Producto> productosactual=null;
    
    
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
        	productosactual=null;
        	pagina = "index.jsp";
        }
        if(Puerta.equalsIgnoreCase("botones")){
        	try {
				productos = productosFacade.main();
			} catch (Exception e) {
				e.printStackTrace();
			}
			pagina = "/consultarproductosvista/consultarproductositems/botonproductos.jsp";
        	s.setAttribute("todos-los-productos", productos);
        }
        if(Puerta.equalsIgnoreCase("ingresarproducto")){
        	String id = request.getParameter("idp");
        	s.setAttribute("id-producto",id);
        	if(productosactual==null) productosactual = new ArrayList<Producto>();
        	Producto encontrado = null;
        	try {
				encontrado = productosFacade.consultarproductoindividual(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	productosactual.add(encontrado);
        	s.setAttribute("productos-pedido", productosactual);
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        }
        if(Puerta.equalsIgnoreCase("listarpedidoactual")){
        	if(productosactual!=null) s.setAttribute("productos-pedido", productosactual);
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        	
        }
        if(Puerta.equalsIgnoreCase("Enviar pedido")){
        	String estado = request.getParameter("estado");
        	String cliente = request.getParameter("cliente");
        	String mesero = request.getParameter("mesero");
        	String mesa = request.getParameter("mesa");
        	String cajero = request.getParameter("cajero");
        	Pedido pedido = new Pedido(productosactual);
        	Calendar x = Calendar.getInstance();
        	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
        	try {
				pedidosFacade.enviar_pedido("0", pedido, estado, mesa, mesero, cliente, cajero, fecha);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	pagina = "/consultarproductosvista/consultarproductos.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
