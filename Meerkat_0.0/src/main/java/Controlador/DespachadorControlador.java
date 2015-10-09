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

@WebServlet("/despachador")
public class DespachadorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DespachadorControlador() {
        super();
    }
    
    public static PedidosFacade pedidosFacade = new PedidosFacade();
    public static DespachadoresFacade despachadoresFacade = new DespachadoresFacade();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        String pagina = null;
        if(Puerta.equalsIgnoreCase("Terminar")){
        	s = request.getSession(false);
        	s.invalidate();
        	pagina = "index.jsp";
        }
        if(Puerta.equalsIgnoreCase("ir_despachador")) pagina = "/despachadores/cocina.jsp";
        if(Puerta.equalsIgnoreCase("imprimir_pedidos_despachador")){
        	try { pedidosFacade.GenerarFactura("Despachado");; } catch (Exception e) { System.out.println("Error al leer las facturas desde la BD.");}
			s.setAttribute("pedidos_en_cola",pedidosFacade.getListafacturassindespachar());
        	pagina = "/despachadores/consultarpedidositems/tablaconsultarpedidos.jsp";
        }
        if(Puerta.equalsIgnoreCase("despachar_pedido")){
        	String pedido_id = request.getParameter("pedido");
        	try { despachadoresFacade.Consultar_despachador();
			} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
        	try { despachadoresFacade.despachador.despachar(pedido_id);
			} catch (NumberFormatException e1) {System.out.println("Error al ingresar el id del pedido");
			} catch (Exception e1) {System.out.println("Error al despechar el pedido en la base de datos");}
        	try { pedidosFacade.GenerarFactura("Despachado"); } catch (Exception e) { System.out.println("Error al leer las facturas desde la BD.");}
			s.setAttribute("pedidos_en_cola",pedidosFacade.getListafacturassindespachar());
        	pagina = "/despachadores/consultarpedidositems/tablaconsultarpedidos.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
