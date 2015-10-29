package Presentacion;

import java.util.ArrayList;

import Datos.GeneralesRepository;
import Negocio.pedido.Producto;

public class GeneralesFacade {		
	public double totaliva;
	public String totalventas;
	public ArrayList<Producto> listaproductos;
	
	GeneralesRepository generalesRepository = new GeneralesRepository();
	
	public String Consultar_totalventas() throws Exception{
		this.totalventas = generalesRepository.Consultar_totalVentas();;
		return totalventas;
	}

	public ArrayList<Producto> Consultar_productosmasvendidos() throws Exception{ 
		this.listaproductos = generalesRepository.Consultarproductos_masvendidos();;
		return listaproductos;
	}
	
	public double Consultar_Iva() throws Exception{
		this.totaliva= generalesRepository.Consultar_Iva();;
		return totaliva;
	}
}