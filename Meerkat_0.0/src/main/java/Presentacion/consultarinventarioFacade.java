package Presentacion;

import java.util.ArrayList;

import Datos.InventarioRepository;
import Negocio.tomaynotificacionpedidos.Producto;


public class consultarinventarioFacade {	
	
	public ArrayList<Producto> listainsumos;
	
	public ArrayList<Producto> main() throws Exception{
		InventarioRepository inventariorepository = new InventarioRepository();
		ArrayList<Producto> x = inventariorepository.ConsultarInsumos ();
		this.listainsumos = x;
		System.out.println("Ingreso al facade: ");
		return x;
	}
}