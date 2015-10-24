package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Presentacion.AdministradoresFacade;
import Presentacion.MeserosFacade;

@WebServlet("/login")
public class LoginControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginControlador() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
		if(s.getAttribute("FacadeMesero") == null){
			MeserosFacade meserosFacade = new MeserosFacade();
			s.setAttribute("FacadeMesero", meserosFacade);
			AdministradoresFacade administradoresFacade = new AdministradoresFacade();
			s.setAttribute("FacadeAdministrador", administradoresFacade);
			
		}
	}
}




