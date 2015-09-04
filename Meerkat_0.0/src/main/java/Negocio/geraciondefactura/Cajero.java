package Negocio.geraciondefactura;

import java.util.ArrayList;

import Presentacion.generaciondefacturaFacade;

public class Cajero {

	
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
		generaciondefacturaFacade x = new generaciondefacturaFacade();
		ArrayList<Factura> listadefacturas = x.main();
		for(Factura factura:listadefacturas){
			if(factura.getId() == id) return factura;
		}
		return null;
	}

	public boolean añadirpropina(int x) {
		//se le suma x al valor de la factura.
		return true;
	}
	
}

