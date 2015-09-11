package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.geraciondefactura.Factura;

public class generaciondefacturaFacade {
	public ArrayList<Factura> main() throws Exception{
		FacturaRepository facturarepository = new FacturaRepository();
		ArrayList<Factura> x = facturarepository.generarfactura();
		System.out.println("x2");
		System.out.println(x);
		return x;
	}
}
