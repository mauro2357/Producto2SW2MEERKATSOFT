package Negocio.factura;

import java.util.ArrayList;

import Negocio.pedido.Empleado;
import Presentacion.*;

public class Cajero extends Empleado{

	
	public String id;
	public String nombre;
	public String apellido;
	public String clave;
	public String telefono;
	public Factura factura;
	
	public Cajero(String id, String nombre, String apellido, String clave, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.telefono = telefono;
	}
	
	public String generarFactura() {
		factura = new Factura(null,null,null,null,null,null);
		return "Factura";
	}

	public Factura getFactura() {
		return factura;
	}
	
	public Factura generarfactura(String id) throws Exception{
		PedidosFacade pedidosFacade = new PedidosFacade();
		ArrayList<Factura> listadefacturas = pedidosFacade.getListafacturassindespachar();
		for(Factura factura:listadefacturas){
			if(factura.getId() == id) return factura;
		}
		return null;
	}

	public boolean aņadirpropina(int x) {
		//se le suma x al valor de la factura.
		return true;
	}

	@Override
	public void pagar() {
		System.out.println("Se le debe pagar al empleado 20 mil");
		
	}
	
}

