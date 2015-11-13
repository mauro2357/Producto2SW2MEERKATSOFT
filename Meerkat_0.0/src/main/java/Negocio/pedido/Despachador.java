package Negocio.pedido;

import java.util.ArrayList;
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
	
	public Despachador() throws Exception {
		this.listafacturassindespachar = facturaRepository.Generar_factura("Despachado");
	}

	public void despachar(String id) throws NumberFormatException, Exception{
		FacturaRepository despachadorRepository = new FacturaRepository();
		despachadorRepository.Despachar_pedido(Integer.parseInt(id));
	}

	@Override
	public void pagar() throws Exception {
		String saldo = "30000";
		empleadosRepository.Pagar(this,this.id,saldo);
	}

	@Override
	public void bonificacacion() {
		
	}

	public void cancelar(String pedido_id) throws NumberFormatException, Exception {
		FacturaRepository despachadorRepository = new FacturaRepository();
		despachadorRepository.Cancelar_pedido(Integer.parseInt(pedido_id));
	}
	
}
