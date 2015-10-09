package Presentacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Datos.FacturaRepository;
import Negocio.factura.Factura;
import Negocio.pedido.Mesa;
import Negocio.pedido.Pedido;
import Negocio.pedido.Producto;

public class PedidosFacade {
	
	public static FacturaRepository facturarepository = new FacturaRepository();
	public ArrayList<Factura> listafacturassindespachar;
	public ArrayList<Factura> listafacturasdespachadas;
	public Map<Mesa,Factura> FacturaPorMesa;
	
	public void GenerarFactura(String aignorar) throws Exception{
		if(aignorar.equalsIgnoreCase("Despachado")){
			listafacturassindespachar = facturarepository.Generar_factura("Despachado");
		}
		if(aignorar.equalsIgnoreCase("En espera")){
			listafacturasdespachadas = facturarepository.Generar_factura("En espera");
		}
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
	
	public int ultimopedidoid() throws Exception{
		ArrayList<Factura> x = facturarepository.Generar_factura(null);
		return x.size();
	}
	
	public void Enviar_pedido(Pedido x) throws Exception{
		facturarepository.Ingresar_pedido(x);
	}
	
	public ArrayList<Producto> main(int idu) throws Exception{
		ArrayList<Producto> x = facturarepository.Generar_pedido(idu);
		return x;
	}

	public ArrayList<Factura> getListafacturassindespachar() {
		return listafacturassindespachar;
	}

	public void setListafacturassindespachar(ArrayList<Factura> listafacturassindespachar) {
		this.listafacturassindespachar = listafacturassindespachar;
	}

	public ArrayList<Factura> getListafacturasdespachadas() {
		return listafacturasdespachadas;
	}

	public void setListafacturasdespachadas(ArrayList<Factura> listafacturasdespachadas) {
		this.listafacturasdespachadas = listafacturasdespachadas;
	}

	
}
