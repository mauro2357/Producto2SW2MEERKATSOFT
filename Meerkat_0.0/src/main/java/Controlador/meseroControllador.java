package Controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Negocio.geraciondefactura.*;
import Negocio.tomaynotificacionpedidos.*;
import Presentacion.*;

@WebServlet("/mesero")
public class meseroControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public meseroControllador() {
        super();
    }
    
    public static Pedido pedido=null;
    public static Mesero mesero=null;
    public static Factura factura=null;
    public static ArrayList<Producto> productos;
    public static ArrayList<Mesero> meseros;
    public static ArrayList<Factura> facturas;
    public static consultarproductosFacade productosFacade = new consultarproductosFacade();
    public static generaciondepedidoFacade pedidosFacade = new generaciondepedidoFacade();
    public static consultarmeserosFacade meserosFacade = new consultarmeserosFacade();
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
        	mesero = null;
        	pagina = "index.jsp";
        }
        if(Puerta.equalsIgnoreCase("imprimirmeseros")){ //Lo ejecuta controller
        	try {
				meseros = meserosFacade.main();
			} catch (Exception e) {
				e.printStackTrace();
			}
        	pagina = "/consultarmeserosvista/listameseros.jsp";
        	s.setAttribute("todos-los-meseros", meseros);
        }
        if(Puerta.equalsIgnoreCase("definirmesero")){ //Lo ejecuta mesero
        	String meseroi = request.getParameter("meseroi");
        	if(mesero==null){
	        	for(Mesero mesero: meseros){
	        		if(mesero.getId().contentEquals(meseroi)) meseroControllador.mesero = mesero;
	        	}
        	}
        	System.out.println("defini� mesero:" + mesero.getId());
        	pagina = "/consultarproductosvista/consultarproductos.jsp";
        	s.setAttribute("", 1);
        }
        if(Puerta.equalsIgnoreCase("botones")){ //Lo ejecuta mesero y controller
        	try {
				productos = mesero.consultarproductos();
				facturas = pedidosFacade.main();
			} catch (Exception e) {
				e.printStackTrace();
			}
			pagina = "/consultarproductosvista/consultarproductositems/botonproductos.jsp";
        	s.setAttribute("todos-los-productos", productos);
        }
        if(Puerta.equalsIgnoreCase("ingresarproducto")){ //Lo ejecuta Mesero
        	String id = request.getParameter("idp");
        	s.setAttribute("id-producto",id);
        	if(productosactual==null) productosactual = new ArrayList<Producto>();
        	Producto encontrado = null;
        	try {
				encontrado = mesero.consultarproductoinvididual(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	productosactual.add(encontrado);
        	s.setAttribute("productos-pedido", productosactual);
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        }
        if(Puerta.equalsIgnoreCase("listarpedidoactual")){ //Lo ejecuta controller
        	if(productosactual!=null) s.setAttribute("productos-pedido", productosactual);
        	pagina = "/consultarproductosvista/consultarproductositems/tablapedidos.jsp";
        	
        }
        if(Puerta.equalsIgnoreCase("Enviar pedido")){       //Lo ejecuta Mesero
        	String estado = request.getParameter("estado");
        	String cliente = request.getParameter("cliente");
        	String mesero = meseroControllador.mesero.getId();
        	String mesa = request.getParameter("mesa");
        	String cajero = request.getParameter("cajero");
        	meseroControllador.mesero = new Mesero();
        	pedido = new Pedido(productosactual);
        	Calendar x = Calendar.getInstance();
        	String fecha = x.get(Calendar.YEAR)+"-"+Integer.toString(x.get(Calendar.MONTH)+1)+"-"+x.get(Calendar.DATE);
        	try {
        		meseroControllador.mesero.enviar_pedido(pedido, estado, mesa, mesero, cliente, cajero, fecha);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	pagina = "/index.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
