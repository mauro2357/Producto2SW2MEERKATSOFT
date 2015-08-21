package Presentacion;

import Datos.FacturaRepository;

public class generaciondefacturaFacade {
	public static void main(String []arg) throws Exception{
		FacturaRepository Facturarepository = new FacturaRepository();
		System.out.println(Facturarepository.generarfactura());
	}
}
