package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.tomaynotificacionpedidos.Producto;

public class consultarpedidosFacade {
	public ArrayList<Producto> main(int idu) throws Exception{
		FacturaRepository facturarepository = new FacturaRepository();
		ArrayList<Producto> x = facturarepository.generarpedido(idu);
		return x;
	}
}