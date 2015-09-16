package Presentacion;

import Datos.EmpleadosRepository;

public class NominaFacade {	
	
	public void Registar_Despachador(String id, String nombre, String apellido, String telefono) throws Exception{
		EmpleadosRepository nominaempleados = new EmpleadosRepository();
		nominaempleados.Registrar_despachador(id, nombre, apellido, telefono);
	}
}