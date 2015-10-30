package Presentacion;

import java.util.ArrayList;

import Datos.FacturaRepository;
import Negocio.factura.Factura;

public class PedidosFacade {
	
	public static FacturaRepository facturarepository = new FacturaRepository();
	public ArrayList<Factura> listafacturassindespachar;
	public ArrayList<Factura> listafacturasdespachadas;
	
	
	public void GenerarFactura(String aignorar) throws Exception{
		if(aignorar.equalsIgnoreCase("Despachado")){
			listafacturassindespachar = facturarepository.Generar_factura("Despachado");
		}
		if(aignorar.equalsIgnoreCase("En espera")){
			listafacturasdespachadas = facturarepository.Generar_factura("En espera");
		}
	}
	
	public int ultimopedidoid() throws Exception{
		ArrayList<Factura> x = facturarepository.Generar_factura(null);
		return x.size();
	}

	
}
