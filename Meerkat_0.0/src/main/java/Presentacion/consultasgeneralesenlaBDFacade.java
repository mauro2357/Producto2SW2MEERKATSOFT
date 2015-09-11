package Presentacion;

import Datos.consultasgeneralesenlaBDRepository;


public class consultasgeneralesenlaBDFacade {		
	public String x;
	
	public String main() throws Exception{
		consultasgeneralesenlaBDRepository totalventas = new consultasgeneralesenlaBDRepository();
		String y = totalventas.Consultar_totalVentas();
		this.x = y;
		System.out.println("Ingreso al facade: " + x);
		return x;
	}
}