package Negocio.pedido;

import java.util.ArrayList;

import Datos.DespachadorRepository;
import Datos.EmpleadosRepository;
import Datos.FacturaRepository;
import Negocio.factura.Factura;

public class Despachador extends Empleado {

	public ArrayList<Factura> listafacturassindespachar;
	
	FacturaRepository facturaRepository = new FacturaRepository();
	EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	
	public Despachador(String id, String nombre, String apellido, String telefono) throws Exception{
		super(id, nombre, apellido, telefono);
		this.listafacturassindespachar = facturaRepository.Generar_factura("Despachado");
	}
	
	/*public Despachador(String id, String nombre, String apellido, String telefono) throws Exception{
		this.id = id;
		this.nombre  = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.listafacturassindespachar = facturaRepository.Generar_factura("Despachado");
	}*/

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
	public void pagar() throws Exception {
		String saldo = "30000";
		empleadosRepository.Pagar(this,this.getId(),saldo);
	}

	@Override
	public void bonificacacion() {
		
	}

	public ArrayList<Factura> getListafacturassindespachar() {
		return listafacturassindespachar;
	}

	public void setListafacturassindespachar(ArrayList<Factura> listafacturassindespachar) {
		this.listafacturassindespachar = listafacturassindespachar;
	}

	public String getMessageHayMesero() {
			return "No hay mesero.";
		
	}

	public void cancelar(String pedido_id) throws NumberFormatException, Exception {
		DespachadorRepository despachadorRepository = new DespachadorRepository();
		despachadorRepository.Cancelar_pedido(Integer.parseInt(pedido_id));
	}
	
}
