package Presentacion;

import java.util.ArrayList;

import Datos.GeneralesRepository;
import Negocio.pedido.Producto;

public class GeneralesFacade {
	public String numeroventas;
	public String mejormesero;
	public String listainsumos;
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
		this.totaliva= generalesRepository.Consultar_Iva();
		return totaliva;
	}
	public String Consultar_ventas() throws Exception{
		this.numeroventas= generalesRepository.Consultar_ventas();
		return numeroventas;
	}
	public String Consultar_insumos() throws Exception{
		this.listainsumos= generalesRepository.Consultar_insumos();;
		return listainsumos;
	}
	public String Consultar_mejormesero() throws Exception{
		this.mejormesero= generalesRepository.Consultar_mejormesero();
		return mejormesero;
	}
}