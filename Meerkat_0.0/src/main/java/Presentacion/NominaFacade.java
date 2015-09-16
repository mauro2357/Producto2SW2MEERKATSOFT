package Presentacion;

import Datos.EmpleadosRepository;
import Negocio.pedido.Despachador;

public class NominaFacade {	
	
		
	public void main(Despachador d) throws Exception{
		System.out.println("Ingreso al facade: ");
	}
	
	public void RegistarDespachador(String id, String nombre, String apellido, String telefono) throws Exception{
		EmpleadosRepository nominaempleados = new EmpleadosRepository();
		nominaempleados.registrarusuario(id, nombre, apellido, telefono);
		System.out.println("Ingreso al facade: ");
	}
}