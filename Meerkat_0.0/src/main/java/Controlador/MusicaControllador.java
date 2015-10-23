package Controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Musica")
public class MusicaControllador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MusicaControllador() {
        super();
    }
    
    String pagina = "listenyourmusicvista/reproductor.jsp";

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//if(administradoresFacade==null) administradoresFacade = new AdministradoresFacade();
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
		if(s.getAttribute("canciones") == null){
			ArrayList<String> canciones = new ArrayList<String>();
			ArrayList<String> ubicacion = new ArrayList<String>();
			s.setAttribute("canciones", canciones);
			s.setAttribute("ubicacion", ubicacion);
		}
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        switch (Puerta) {
	        case "Cancelar":
				cerrar_sesion(s, request);
				break;
	        case "Entrar_musica":
				entrar_musica(s);
				break;
	        default:
				pagina = "listenyourmusicvista/reproductor.jsp";
				break;
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}
	
	private void entrar_musica(HttpSession s) {
		ArrayList<String> canciones = (ArrayList<String>) s.getAttribute("canciones");
		ArrayList<String> ubicacion = (ArrayList<String>) s.getAttribute("ubicacion");
		canciones.add("Tu amor");
		ubicacion.add("../pistas/tuamor.mp3");
		s.setAttribute("canciones", canciones);
		s.setAttribute("ubicacion", ubicacion);
		pagina = "listenyourmusicvista/reproductor.jsp";
	}

	public void cerrar_sesion(HttpSession s, HttpServletRequest request){
		s = request.getSession(false);
    	s.invalidate();
    	pagina = "index.jsp";
	}

}
