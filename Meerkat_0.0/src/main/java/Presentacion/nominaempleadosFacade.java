package Presentacion;

import Datos.nominaempleadosRepository;
import Negocio.tomaynotificacionpedidos.Despachador;

public class nominaempleadosFacade {	
		
	public void main(Despachador d) throws Exception{
		nominaempleadosRepository nominaempleados = new nominaempleadosRepository();
		nominaempleados.registrarusuario(d);
		System.out.println("Ingreso al facade: ");
	}
}