package Negocio.pedido;

import java.util.ArrayList;

import Datos.DespachadorRepository;
import Datos.FacturaRepository;
import Negocio.factura.Factura;

public class Despachador extends Empleado {
	public String id;
	public String nombre;
	public String apellido;
	public String telefono;
	public ArrayList<Factura> listafacturassindespachar;
	
	FacturaRepository facturaRepository = new FacturaRepository();
	
	public Despachador(String id, String nombre, String apellido, String telefono) throws Exception{
		this.id = id;
		this.nombre  = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.listafacturassindespachar = facturaRepository.Generar_factura("Despachado");
	}

	public Despachador() {
	}

	public boolean Recibir_pedido(){
		
		return true;
	}
	
	public String Notificar_pedido(){
		return "Pedido despachado.";
	}
	
	public void despachar(String id) throws NumberFormatException, Exception{
		DespachadorRepository despachadorRepository = new DespachadorRepository();
		despachadorRepository.Despachar_pedido(Integer.parseInt(id));
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public void pagar() {
		System.out.println("Pagar a despachador 20 mil");
		
	}

	@Override
	public void bonificacacion() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Factura> getListafacturassindespachar() {
		return listafacturassindespachar;
	}

	public void setListafacturassindespachar(ArrayList<Factura> listafacturassindespachar) {
		this.listafacturassindespachar = listafacturassindespachar;
	}
	
}
