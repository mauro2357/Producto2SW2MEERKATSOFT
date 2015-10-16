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
    
    public CajerosFacade cajeroFacade; //Por ahora así
    
    String pagina = null;
    String id = null;
    String mesa = null;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(cajeroFacade==null) cajeroFacade = new CajerosFacade();
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        id = request.getParameter("id");
        mesa = request.getParameter("mesa");
        switch (Puerta) {
		case "Terminar":
			cerrar_sesion(s, request);
			break;
		case "entrar_cajero":
			Entrar(s);
			break;
		case "Cobrar":
			Cobrar(s, request);
			break;
		default:
			break;
		}
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	public void cerrar_sesion(HttpSession s, HttpServletRequest request){
		cajeroFacade.setCajero(null);
		s = request.getSession(false);
    	s.invalidate();
    	pagina = "index.jsp";
	}
	
	public void Entrar(HttpSession s){
		try {
    		cajeroFacade.Consultar_cajeros();
    		cajeroFacade.getCajero().getListafacturasdespachadas();
		} catch (Exception e) {
			System.out.println("Error al organizar las facturas por mesa.");
		}
    	pagina = "cajero/cajeroitems/listamesasgrafico.jsp";
    	s.setAttribute("mesas-facturas", cajeroFacade.getCajero().Organizar_Facturas_Mesa());
	}
	
	public void Cobrar(HttpSession s, HttpServletRequest request){
		try {
			cajeroFacade.getCajero().Cobrar(id,mesa);
			pagina = "cajero/cajero.jsp";
		} catch (Exception e) {
			System.out.println("Error al cobrar la mesa e n la base de datos.");
		}
	}

}
