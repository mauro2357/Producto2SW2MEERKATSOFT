package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.geraciondefactura.Factura;

public class generaciondefacturaFacade {
	public static ArrayList<Factura> main() throws Exception{
		FacturaRepository facturarepository = new FacturaRepository();
		ArrayList<Factura> x = facturarepository.generarfactura();
		return x;
	}
}
