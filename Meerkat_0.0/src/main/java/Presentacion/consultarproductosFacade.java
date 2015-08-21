package Presentacion;

import Datos.PedidoRepository;

public class consultarproductosFacade {
	public static void main(String []arg) throws Exception{
		PedidoRepository pedidorepository = new PedidoRepository();
		System.out.println(pedidorepository.ConsultarProducto());
		
	}
}
