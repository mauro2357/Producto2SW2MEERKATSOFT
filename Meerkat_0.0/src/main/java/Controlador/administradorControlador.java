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


import Negocio.tomaynotificacionpedidos.*;
import Presentacion.*;

@WebServlet("/administrador")
public class administradorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public administradorControlador() {
        super();
    }
    
    public  static ArrayList<Producto> insumos;
    public  static consultarinventarioFacade inventarioFacade= new consultarinventarioFacade();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ingreso al servlet");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession s = request.getSession();
        String Puerta = null;
        Puerta = request.getParameter("entrar");
        String pagina = null;
        System.out.println(Puerta);
        if(Puerta.equalsIgnoreCase("Terminar"))
        {
        	s = request.getSession(false);
        	s.invalidate();
        	pagina = "index.jsp";
        }
        
        if(Puerta.equalsIgnoreCase("consultar_inventario")){ 
        	System.out.println("Ingreso a buscar el inventario: ");
        	try { //Try catch para intentar conectar a la BD
        		inventarioFacade.main(); //Ejecuta el main del Facade, esto obtiene todos los insumos que están en la BD
			} catch (Exception e) {
				e.printStackTrace(); //Devuelve un error si no conectó correctamente a la BD
			}
        	pagina = "/consultarinventariovista/listainventario.jsp"; //A esta página jsp se enviarán los atributos
        	s.setAttribute("todos-los-insumos", inventarioFacade.listainsumos);
        }      
        
        if(Puerta.equalsIgnoreCase("ir_administrador")){ //cuando en el index.jsp damos click al boton administrador.
        	pagina = "/consultarinventariovista/funcionesadministrador.jsp"; //Rederigimos a la jsp de las funciones del administrador.  	
        }
        
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}



