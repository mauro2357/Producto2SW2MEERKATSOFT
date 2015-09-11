package Presentacion;

import java.util.ArrayList;

import Datos.consultasgeneralesenlaBDRepository;
import Negocio.tomaynotificacionpedidos.Producto;


public class consultasgeneralesenlaBDFacade {		
	public String x;
	public ArrayList<Producto> listaproductos;
	
	public String main() throws Exception{
		consultasgeneralesenlaBDRepository totalventas = new consultasgeneralesenlaBDRepository();
		String y = totalventas.Consultar_totalVentas();
		this.x = y;
		System.out.println("Ingreso al facade: " + x);
		return x;
	}
	
	
	
	public ArrayList<Producto> Productos_masvendidos() throws Exception{
		consultasgeneralesenlaBDRepository productosmas = new consultasgeneralesenlaBDRepository();
		ArrayList<Producto> x = productosmas.Productos_masvendidos();
		this.listaproductos = x;
		System.out.println("Ingreso al facade: ");
		return x;
	}
}