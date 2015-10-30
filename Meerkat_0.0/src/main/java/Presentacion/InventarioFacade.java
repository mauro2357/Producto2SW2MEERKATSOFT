package Presentacion;

import java.util.ArrayList;

import Datos.InventarioRepository;
import Negocio.pedido.Producto;


public class InventarioFacade {	
	
	public ArrayList<Producto> listainsumos;
	
	public ArrayList<Producto> Consultar_insumos() throws Exception{
		InventarioRepository inventariorepository = new InventarioRepository();
		ArrayList<Producto> x = inventariorepository.Consultar_insumos ();
		this.listainsumos = x;
		return x;
	}
}