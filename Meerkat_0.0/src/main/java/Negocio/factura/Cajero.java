package Negocio.factura;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Datos.ClientesRepository;
import Datos.EmpleadosRepository;
import Datos.FacturaRepository;
import Datos.MesaRepository;
import Negocio.cliente.Cliente;
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
	public ArrayList<Factura> listafacturasfinalizadas;
	public Map<Mesa,Factura> FacturaPorMesa;
	
	FacturaRepository facturaRepository = new FacturaRepository();
	MesaRepository mesaRepository = new MesaRepository();
	EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	ClientesRepository clientesRepository = new ClientesRepository();
	
	public Cajero(String id, String nombre, String apellido, String clave, String telefono) throws Exception {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.telefono = telefono;
		this.listafacturasdespachadas = facturaRepository.Generar_factura("En espera");  //Por ser la lista de despachadas, IGNORAMOS las En Espera, por defecto se ignoran las Finalizadas.
		this.listafacturasfinalizadas = facturaRepository.Generar_factura("Despachado/En espera"); //Por ser la lista de finalizadas, Ignoramos las Despachadas y En Espera, por ser un String de dos posiciones no se ignoran las finalizadas. (.split('/'))
	}
	
	public Map<Mesa,Factura> Organizar_Facturas_Mesa(){
		Map<Mesa,Factura> u = new HashMap<Mesa,Factura>();
		u.clear();
		for(Factura factura: listafacturasdespachadas){
			if(factura.pedido.getEstado()=="Finalizado") continue;
			u.put(factura.getMesa(), factura);
		}
		FacturaPorMesa = u;
		return u;
	}

	public Factura getFactura() {
		return factura;
	}
	
	public void ActualizarPuntos(Cliente cliente, String puntosusados) throws Exception {
		clientesRepository.ActualizarPuntos(cliente,puntosusados);
		int diferencia = cliente.puntos - Integer.parseInt(puntosusados);
		cliente.puntos = diferencia;
	}
	
	public Factura generarfacturageneral(String id) throws Exception{
		ArrayList<Factura> listadefacturas = facturaRepository.Generar_factura(null);
		for(Factura factura:listadefacturas){
			if(factura.getId().equalsIgnoreCase(id)) return factura;
		}
		return null;
	}
	
	public Factura generarfactura(String id) throws Exception{
		ArrayList<Factura> listadefacturas = listafacturasdespachadas;
		for(Factura factura:listadefacturas){
			if(factura.getId() == id) return factura;
		}
		return null;
	}
	
	public int Consultar_precio_mesa(String id) throws Exception {
		Factura facturam = null;
		for(Factura factura: listafacturasdespachadas){
			if(factura.getId().equalsIgnoreCase(id)) facturam=factura;
		}
		return facturam.getPedido().getPrecio_total();
	}
	
	public Factura Cobrar(Factura factura) throws Exception {
		facturaRepository.Cobrar(factura);
		FacturaPorMesa.remove(factura);
		factura.pedido.setEstado("Finalizado");
		factura.setCajero(this.getId());
		return factura;
	}

	public boolean añadirpropina(int x) {
		//se le suma x al valor de la factura.
		return true;
	}

	@Override
	public void pagar() throws Exception {
		String saldo = "40000";
		empleadosRepository.Pagar(this,this.getId(),saldo);
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

