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

import Negocio.factura.Factura;
import Presentacion.*;

@WebServlet("/despachador")
public class DespachadorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DespachadorControlador() {
        super();
    }
    
    PedidosFacade facturaFacade = new PedidosFacade();

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
        if(Puerta.equalsIgnoreCase("ir_despachador")){
        	ArrayList<Factura> x = null;
        	try { x = facturaFacade.main();
			} catch (Exception e1) { System.out.println("Error en la base de datos al recibir los pedidos en cola.");}
			s.setAttribute("pedidos_en_cola",x);
        	pagina = "/despachadores/cocina.jsp";
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}
