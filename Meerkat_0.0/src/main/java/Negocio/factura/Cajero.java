package Negocio.factura;

import java.util.ArrayList;
import java.util.Map;

import Negocio.pedido.Empleado;
import Negocio.pedido.Mesa;
import Presentacion.*;

public class Cajero extends Empleado{
	
	public String id;
	public String nombre;
	public String apellido;
	public String clave;
	public String telefono;
	public Factura factura;
	
	PedidosFacade pedidosFacade = new PedidosFacade();
	
	public Cajero(String id, String nombre, String apellido, String clave, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.telefono = telefono;
	}
	
	public void generarFactura() throws Exception {
		pedidosFacade.GenerarFactura("En espera");
		pedidosFacade.Organizar_Facturas_Mesa();
	}
	
	public Map<Mesa,Factura> Mesas_x_factura(){
		return pedidosFacade.FacturaPorMesa;
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

	public boolean añadirpropina(int x) {
		//se le suma x al valor de la factura.
		return true;
	}

	@Override
	public void pagar() {
		System.out.println("Se le debe pagar al empleado 20 mil");
		
	}

	@Override
	public void bonificacacion() {
		// TODO Auto-generated method stub
		
	}
	
}

