package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Negocio.cliente.Cliente;
//import Negocio.cliente.Cliente;
import Negocio.factura.Factura;
import Presentacion.*;

@WebServlet("/caja")
public class CajeroControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CajeroControlador() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
		if(s.getAttribute("FacadeCajero") == null){
			CajerosFacade cajeroFacade = new CajerosFacade();
			s.setAttribute("FacadeCajero", cajeroFacade);
		}
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        String pagina = null;
        String id = request.getParameter("id");
        String mesa = request.getParameter("mesa");
        String puntosusados = request.getParameter("puntosusados");
        switch (Puerta) {
		case "Terminar":
			cerrar_sesion(s, request);
			break;
		case "entrar_cajero":
			pagina = Entrar(s);
			break;
		case "devolver_precio_mesa":
			pagina = Costo_Mesa(s, request, id, mesa);
			break;
		case "pagar_mesa":
			pagina = Cobrar(s, request, id, mesa, puntosusados);
			break;
		case "lista_facturas_realizadas":
			pagina = Generar_Lista_Facturas_Realizadas(s);
			break;
		default:
			break;
		}
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

	private String Generar_Lista_Facturas_Realizadas(HttpSession s) {
		CajerosFacade cajerosFacade = (CajerosFacade) s.getAttribute("FacadeCajero");
		s.setAttribute("lista_facturas_realizadas", cajerosFacade.getCajero().listafacturasfinalizadas);
		return "cajero/cajeroitems/listafacturas.jsp";
	}

	public String cerrar_sesion(HttpSession s, HttpServletRequest request){
		CajerosFacade cajerosFacade = (CajerosFacade) s.getAttribute("FacadeCajero");
		cajerosFacade.setCajero(null);
		s = request.getSession(false);
    	s.invalidate();
    	return "index.jsp";
	}
	
	public String Entrar(HttpSession s){
		CajerosFacade cajerosFacade = (CajerosFacade) s.getAttribute("FacadeCajero");
		try {
			cajerosFacade.Consultar_cajeros();
			cajerosFacade.getCajero().getListafacturasdespachadas();
		} catch (Exception e) {
			System.out.println("Error al organizar las facturas por mesa.");
		}
    	s.setAttribute("mesas-facturas", cajerosFacade.getCajero().Organizar_Facturas_Mesa());
    	return "cajero/cajeroitems/listamesasgrafico.jsp";
	}
	
	public String Costo_Mesa(HttpSession s, HttpServletRequest request, String id, String mesa){
		CajerosFacade cajerosFacade = (CajerosFacade) s.getAttribute("FacadeCajero");
		try {
			Factura ans = cajerosFacade.getCajero().generarfacturageneral(id);
			ClientesFacade clientesFacade = new ClientesFacade();
			Cliente cliente = clientesFacade.Consultar_Cliente_Particular(ans.getCliente());
			s.setAttribute("Factura",ans);
			s.setAttribute("Cliente", cliente);
			return "cajero/cajeroitems/caja.jsp";
		} catch (Exception e) { 
			System.out.println("Error al buscar el costo de la mesa");
		}
		return null;
	}
	
	public String Cobrar(HttpSession s, HttpServletRequest request, String id, String mesa, String puntosusados){
		CajerosFacade cajerosFacade = (CajerosFacade) s.getAttribute("FacadeCajero");
		try {
			ClientesFacade clientesFacade = new ClientesFacade();
			Factura ans = cajerosFacade.cajero.generarfacturageneral(id);
			Cliente cliente = clientesFacade.Consultar_Cliente_Particular(ans.cliente);
			cajerosFacade.cajero.ActualizarPuntos(cliente, puntosusados);
			ans.pedido.precio_total-=Integer.parseInt(puntosusados);
			ans = cajerosFacade.cajero.Cobrar(ans);
			s.setAttribute("Factura",ans);
			s.setAttribute("Cliente", cliente);
			return "cajero/cajeroitems/factura.jsp";
		} catch (Exception e) {
			System.out.println("Error al cobrar la mesa en la base de datos.");
		}
		return null;
	}

}
