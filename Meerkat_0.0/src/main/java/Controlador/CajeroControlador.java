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

@WebServlet("/caja")
public class CajeroControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CajeroControlador() {
        super();
    }
    
    public static CajerosFacade cajeroFacade = new CajerosFacade();
    public static MesasFacade mesasFacade = new MesasFacade();
    public static PedidosFacade pedidosFacade = new PedidosFacade();
    
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
        if(Puerta.equalsIgnoreCase("entrar_cajero")){
        	try {
    			pedidosFacade.GenerarFactura("En espera");
    			pedidosFacade.Organizar_Facturas_Mesa();
    		} catch (Exception e) {
    			System.out.println("Error al organizar las facturas por mesa.");
    		}
        	pagina = "cajero/cajeroitems/listamesasgrafico.jsp";
        	s.setAttribute("mesas-facturas", pedidosFacade.FacturaPorMesa);
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
