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
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s = request.getSession();
		if(s.getAttribute("FacadeDespachador") == null){
			DespachadoresFacade despachadoresFacade = new DespachadoresFacade();
			s.setAttribute("FacadeDespachador", despachadoresFacade);
		}
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        String pagina = "index.jsp";
        switch (Puerta) {
	        case "Cancelar":
				pagina = cerrar_sesion(s, request);
				break;
	        case "ir_despachador":
				pagina = "/Despachadores/Cocina.jsp";
				break;
	        case "imprimir_pedidos_despachador":
	        	pagina = Imprimir_Pedidos_Despachador(s);
				break;
	        case "despachar_pedido":
	        	pagina = Despachar_Pedido(s, request);
	        	break;
	        case "cancelar_pedido":
	        	pagina = Cancelar_Pedido(s, request);
	        	break;
			default:
				pagina = "index.jsp";
				break;
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	private String Cancelar_Pedido(HttpSession s, HttpServletRequest request) {
		DespachadoresFacade despachadoresFacade = (DespachadoresFacade) s.getAttribute("FacadeDespachador");
		String pedido_id = request.getParameter("pedido");
    	try { despachadoresFacade.Consultar_despachador();
		} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
    	
    	try { despachadoresFacade.despachador.cancelar(pedido_id);
		} catch (NumberFormatException e1) {System.out.println("Error al ingresar el id del pedido");
		} catch (Exception e1) {System.out.println("Error al despechar el pedido en la base de datos");}
    	
    	try { despachadoresFacade.Consultar_despachador();
		} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
		
    	s.setAttribute("pedidos_en_cola", despachadoresFacade.despachador.listafacturassindespachar);
    	return "/Despachadores/Items/Pedidos.jsp";
	}

	public String cerrar_sesion(HttpSession s, HttpServletRequest request){
		DespachadoresFacade despachadoresFacade = (DespachadoresFacade) s.getAttribute("FacadeDespachador");
		despachadoresFacade.despachador = null;
		s = request.getSession(false);
    	s.invalidate();
    	return "index.jsp";
	}
	
	public String Imprimir_Pedidos_Despachador(HttpSession s){
		DespachadoresFacade despachadoresFacade = (DespachadoresFacade) s.getAttribute("FacadeDespachador");
		try { despachadoresFacade.Consultar_despachador(); } catch (Exception e) { System.out.println("Error al leer las facturas desde la BD.");}
		s.setAttribute("pedidos_en_cola",despachadoresFacade.despachador.listafacturassindespachar);
    	return "/Despachadores/Items/Pedidos.jsp";
	}
	
	public String Despachar_Pedido(HttpSession s, HttpServletRequest request){
		DespachadoresFacade despachadoresFacade = (DespachadoresFacade) s.getAttribute("FacadeDespachador");
		String pedido_id = request.getParameter("pedido");
    	try { despachadoresFacade.Consultar_despachador();
		} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
    	
    	try { despachadoresFacade.despachador.despachar(pedido_id);
		} catch (NumberFormatException e1) {System.out.println("Error al ingresar el id del pedido");
		} catch (Exception e1) {System.out.println("Error al despechar el pedido en la base de datos");}
    	
    	try { despachadoresFacade.Consultar_despachador();
		} catch (Exception e2) {System.out.println("Error el consultar los despachadores en la base de datos.");}
		
    	s.setAttribute("pedidos_en_cola", despachadoresFacade.despachador.listafacturassindespachar);
    	return "/Despachadores/Items/Pedidos.jsp";
	}

}
