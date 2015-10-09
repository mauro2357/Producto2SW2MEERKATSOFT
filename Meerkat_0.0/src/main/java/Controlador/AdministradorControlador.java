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

@WebServlet("/administrador")
public class AdministradorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AdministradorControlador() {
        super();
    }
    
    public static String clave = "meerkat";
    public  static InventarioFacade inventarioFacade= new InventarioFacade();
    public static ClientesFacade clientesFacade= new ClientesFacade();
    public static GeneralesFacade totalventas = new GeneralesFacade();
    public static NominaFacade creardespachador = new NominaFacade();
    public static NominaFacade crearmesero = new NominaFacade();
    
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
        if(Puerta.equalsIgnoreCase("consultar_inventario")){ 
        	try{ inventarioFacade.Consultar_insumos();
			}catch (Exception e) { System.out.println("Error en la base de datos al consultar el inventario.");}
        	pagina = "/consultarinventariovista/listainventario.jsp";
        	s.setAttribute("todos-los-insumos", inventarioFacade.listainsumos);
        }
        if(Puerta.equalsIgnoreCase("consultar_clientes")){ 
        	try{ clientesFacade.Consultar_clientes();
			}catch (Exception e) { System.out.println("Error en la base de datos al consultar los clientes.");}
        	pagina = "/basedatosusuariosvista/listaclientes.jsp";
        	s.setAttribute("todos-los-clientes", clientesFacade.listaclientes);
        }
        if(Puerta.equalsIgnoreCase("consultar_totalVentas")){ 
        	System.out.println("Ingreso a consultar totalventas: ");
        	try { totalventas.Consultar_totalventas(); 
			}catch (Exception e){ System.out.println("Error en la base de datos al consultar el total de las ventas.");}
        	pagina = "/consultasgeneralesenlaBDvista/totalventas.jsp";
        	s.setAttribute("todas-ventas", totalventas.x);
        }
        if(Puerta.equalsIgnoreCase("ir_administrador")){    	
        	String claveaux = request.getParameter("pass");
        	if(!clave.equalsIgnoreCase(claveaux)) return;
        	pagina = "/consultarinventariovista/funcionesadministrador.jsp";	
        }
        if(Puerta.equalsIgnoreCase("crear_despachador")){
        	pagina = "nominaempleadosvista/creardespachador.jsp";	
        }
        if(Puerta.equalsIgnoreCase("crear_mesero")){
        	pagina = "nominaempleadosvista/crearmesero.jsp";	
        }       
        if(Puerta.equalsIgnoreCase("datos_despachador")){
        	String id = request.getParameter("id");
        	String nombre = request.getParameter("nombre");
        	String apellido = request.getParameter("apellido");
        	String telefono = request.getParameter("telefono");
        	try {creardespachador.Registar_Despachador(id, nombre, apellido, telefono);
			}catch (Exception e) {System.out.println("Error en la base de datos al crear un despachador");}
        	pagina = "index.jsp";  	
        }
        if(Puerta.equalsIgnoreCase("datos_mesero")){
        	String id = request.getParameter("id");
        	String nombre = request.getParameter("nombre");
        	String apellido = request.getParameter("apellido");
        	String telefono = request.getParameter("telefono");
        	try {crearmesero.Registar_Mesero(id, nombre, apellido, telefono);
			}catch (Exception e) {System.out.println("Error en la base de datos al crear un mesero");}
        	pagina = "index.jsp";  	
        }        
        if(Puerta.equalsIgnoreCase("productos_masvendidos")){ 
        	try {totalventas.Consultar_productosmasvendidos();
			} catch (Exception e) {System.out.println("Error en la base de datos al consultar los productos más vendidos");}
        	pagina = "/consultasgeneralesenlaBDvista/productosmasvendidos.jsp";
        	s.setAttribute("productos-masvendidos", totalventas.listaproductos);
        }
        RequestDispatcher rd = request.getRequestDispatcher(pagina);
        rd.forward(request, response);
	}

}



