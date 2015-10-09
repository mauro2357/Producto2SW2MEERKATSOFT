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
	public ArrayList<Factura> listafacturas;
	public Map<Mesa,Factura> FacturaPorMesa;
	
	public void GenerarFactura(String aignorar) throws Exception{
		listafacturas = facturarepository.Generar_factura(aignorar);
	}
	
	public Map<Mesa,Factura> Organizar_Facturas_Mesa(){
		Map<Mesa,Factura> u = new HashMap<Mesa,Factura>();
		for(Factura factura: listafacturas){
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

	public ArrayList<Factura> getListafacturas() {
		return listafacturas;
	}

	public void setListafacturas(ArrayList<Factura> listafacturas) {
		this.listafacturas = listafacturas;
	}
}
