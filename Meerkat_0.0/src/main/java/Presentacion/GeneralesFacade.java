package Presentacion;

import java.util.ArrayList;

import Datos.GeneralesRepository;
import Negocio.pedido.Producto;

public class GeneralesFacade {		
	
	public String x; //Total_Ventas
	public ArrayList<Producto> listaproductos;
	
	public String Consultar_totalventas() throws Exception{
		GeneralesRepository totalventas = new GeneralesRepository();
		String y = totalventas.Consultar_totalVentas();
		this.x = y;
		return x;
	}

	public ArrayList<Producto> Consultar_productosmasvendidos() throws Exception{
		GeneralesRepository productosmas = new GeneralesRepository();
		ArrayList<Producto> x = productosmas.Consultarproductos_masvendidos();
		this.listaproductos = x;
		return x;
	}
}