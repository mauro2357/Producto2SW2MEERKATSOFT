package Negocio.factura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Datos.FacturaRepository;
import Datos.MesaRepository;
import Negocio.pedido.Empleado;
import Negocio.pedido.Mesa;

public class Cajero extends Empleado{
	
	public String id;
	public String nombre;
	public String apellido;
	public String clave;
	public String telefono;
	public Factura factura;
	public ArrayList<Factura> listafacturasdespachadas;
	public Map<Mesa,Factura> FacturaPorMesa;
	
	FacturaRepository facturaRepository = new FacturaRepository();
	MesaRepository mesaRepository = new MesaRepository();
	
	public Cajero(String id, String nombre, String apellido, String clave, String telefono) throws Exception {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.telefono = telefono;
		this.listafacturasdespachadas = facturaRepository.Generar_factura("En espera");
	}
	
	public Map<Mesa,Factura> Organizar_Facturas_Mesa(){
		Map<Mesa,Factura> u = new HashMap<Mesa,Factura>();
		u.clear();
		for(Factura factura: listafacturasdespachadas){
			u.put(factura.getMesa(), factura);
		}
		FacturaPorMesa = u;
		return u;
	}

	public Factura getFactura() {
		return factura;
	}
	
	public Factura generarfactura(String id) throws Exception{
		ArrayList<Factura> listadefacturas = listafacturasdespachadas;
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
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public ArrayList<Factura> getListafacturasdespachadas() {
		return listafacturasdespachadas;
	}

	public void setListafacturasdespachadas(ArrayList<Factura> listafacturasdespachadas) {
		this.listafacturasdespachadas = listafacturasdespachadas;
	}
	
}

