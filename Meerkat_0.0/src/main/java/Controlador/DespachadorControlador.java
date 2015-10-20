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
    
    public DespachadoresFacade despachadoresFacade; //por ahora así
    String pagina = null;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(despachadoresFacade==null) despachadoresFacade = new DespachadoresFacade();
		HttpSession s = request.getSession();
		if(s.getAttribute("FacadeDespachador") == null){
			MeserosFacade meserosFacade = new MeserosFacade();
			s.setAttribute("FacadeDespachador", meserosFacade);
		}
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        
        switch (Puerta) {
	        case "Cancelar":
				cerrar_sesion(s, request);
				break;
	        case "ir_despachador":
				pagina = "/despachadores/cocina.jsp";
				break;
	        case "imprimir_pedidos_despachador":
	        	Imprimir_Pedidos_Despachador(s);
				break;
	        case "despachar_pedido":
	        	Despachar_Pedido(s, request);
	        	break;
			default:
				pagina = "index.jsp";
				break;
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	public void cerrar_sesion(HttpSession s, HttpServletRequest request){
    	despachadoresFacade.setDespachador(null);
		s = request.getSession(false);
    	s.invalidate();
    	pagina = "index.jsp";
	}
	
	public void Imprimir_Pedidos_Despachador(HttpSession s){
		try { despachadoresFacade.Consultar_despachador(); } catch (Exception e) { System.out.println("Error al leer las facturas desde la BD.");}
		s.setAttribute("pedidos_en_cola",despachadoresFacade.getDespachador().getListafacturassindespachar());
    	pagina = "/despachadores/consultarpedidositems/tablaconsultarpedidos.jsp";
	}
	
	public void Despachar_Pedido(HttpSession s, HttpServletRequest request){
		String pedido_id = request.getParameter("pedido");
    	
    	try { despachadoresFacade.Consultar_despachador();
		} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
    	
    	try { despachadoresFacade.getDespachador().despachar(pedido_id);
		} catch (NumberFormatException e1) {System.out.println("Error al ingresar el id del pedido");
		} catch (Exception e1) {System.out.println("Error al despechar el pedido en la base de datos");}
    	
    	try { despachadoresFacade.Consultar_despachador();
		} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
		
    	s.setAttribute("pedidos_en_cola", despachadoresFacade.getDespachador().getListafacturassindespachar());
    	pagina = "/despachadores/consultarpedidositems/tablaconsultarpedidos.jsp";
	}

}
