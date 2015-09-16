package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.factura.Factura;
import Negocio.pedido.Pedido;
import Negocio.pedido.Producto;

public class PedidosFacade {
	
	FacturaRepository facturarepository = new FacturaRepository();
	
	public ArrayList<Factura> main() throws Exception{
		ArrayList<Factura> x = facturarepository.Generar_factura();
		return x;
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
}
