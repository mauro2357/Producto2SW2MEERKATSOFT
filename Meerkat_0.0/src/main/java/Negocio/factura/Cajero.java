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
			if(factura.pedido.estado=="Finalizado") continue;
			u.put(factura.mesa, factura);
		}
		FacturaPorMesa = u;
		return u;
	}
	
	public void ActualizarPuntos(Cliente cliente, String puntosusados) throws Exception {
		clientesRepository.ActualizarPuntos(cliente,puntosusados);
		int diferencia = cliente.puntos - Integer.parseInt(puntosusados);
		cliente.puntos = diferencia;
	}
	
	public Factura generarfacturageneral(String id) throws Exception{
		ArrayList<Factura> listadefacturas = facturaRepository.Generar_factura(null);
		for(Factura factura:listadefacturas){
			if(factura.id.equalsIgnoreCase(id)) return factura;
		}
		return null;
	}
	
	public Factura generarfactura(String id) throws Exception{
		ArrayList<Factura> listadefacturas = listafacturasdespachadas;
		for(Factura factura:listadefacturas){
			if(factura.id == id) return factura;
		}
		return null;
	}
	
	public int Consultar_precio_mesa(String id) throws Exception {
		Factura facturam = null;
		for(Factura factura: listafacturasdespachadas){
			if(factura.id.equalsIgnoreCase(id)) facturam=factura;
		}
		return facturam.pedido.precio_total;
	}
	
	public Factura Cobrar(Factura factura) throws Exception {
		facturaRepository.Cobrar(factura);
		FacturaPorMesa.remove(factura);
		factura.pedido.estado = "Finalizado";
		factura.cajero = this.id;
		return factura;
	}

	public boolean añadirpropina(int x) {
		//se le suma x al valor de la factura.
		return true;
	}

	@Override
	public void pagar() throws Exception {
		String saldo = "40000";
		empleadosRepository.Pagar(this,this.id,saldo);
	}

	@Override
	public void bonificacacion() {
		
	}
	

}

