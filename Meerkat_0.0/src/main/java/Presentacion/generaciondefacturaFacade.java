package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.geraciondefactura.Factura;
import Negocio.tomaynotificacionpedidos.Producto;

public class generaciondefacturaFacade {
	public static Factura main(String mesero, String cajero, String mesa, String productos) throws Exception{
		FacturaRepository Facturarepository = new FacturaRepository();
		Factura x = new Factura(mesero, cajero, mesa, productos);
		Facturarepository.generarfactura();
		return x;
	}
}
