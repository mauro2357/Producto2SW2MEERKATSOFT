package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.factura.Factura;
import Negocio.pedido.Pedido;
import Negocio.pedido.Producto;

public class PedidosFacade {
	
	public static FacturaRepository facturarepository = new FacturaRepository();
	public ArrayList<Factura> listafacturas;
	
	public void main() throws Exception{
		listafacturas = facturarepository.Generar_factura();
	}
	
	public int ultimopedidoid() throws Exception{
		ArrayList<Factura> x = facturarepository.Generar_factura();
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
