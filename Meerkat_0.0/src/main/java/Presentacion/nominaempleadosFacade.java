package Presentacion;

import Datos.nominaempleadosRepository;
import Negocio.tomaynotificacionpedidos.Despachador;

public class nominaempleadosFacade {	
	
		
	public void main(Despachador d) throws Exception{
		System.out.println("Ingreso al facade: ");
	}
	
	public void RegistarDespachador(String id, String nombre, String apellido, String telefono) throws Exception{
		nominaempleadosRepository nominaempleados = new nominaempleadosRepository();
		nominaempleados.registrarusuario(id, nombre, apellido, telefono);
		System.out.println("Ingreso al facade: ");
	}
}