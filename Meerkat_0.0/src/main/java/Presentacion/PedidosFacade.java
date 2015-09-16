package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.factura.Factura;
import Negocio.pedido.Pedido;
import Negocio.pedido.Producto;

public class PedidosFacade {
	
	FacturaRepository facturarepository = new FacturaRepository();
	
	public ArrayList<Factura> main() throws Exception{
		ArrayList<Factura> x = facturarepository.generarfactura();
		return x;
	}
	
	public int ultimopedidoid() throws Exception{
		ArrayList<Factura> x = facturarepository.generarfactura();
		return x.size();
	}
	
	public void enviar_pedido(Pedido x) throws Exception{
		facturarepository.ingresarPedido(x);
	}
	
	public ArrayList<Producto> main(int idu) throws Exception{
		ArrayList<Producto> x = facturarepository.generarpedido(idu);
		return x;
	}
}
