package Presentacion;

import java.util.ArrayList;

import Datos.EmpleadosRepository;
import Negocio.pedido.Empleado;

public class NominaFacade {	
	
	public ArrayList<Empleado> empleados = new ArrayList<Empleado>(); 
	public static EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	
	public ArrayList<Empleado> Consultar_Empleados() throws Exception{
		this.empleados = empleadosRepository.Consultar_Empleados();
		return empleados;
	}
	
	public void Pagar_Nomina() throws Exception{
		if(this.empleados==null) Consultar_Empleados();
		for(Empleado empleado: this.empleados){
			empleado.pagar();
		}
	}
	
	public void Registar_Despachador(String id, String nombre, String apellido, String telefono) throws Exception{
		empleadosRepository.Registrar_despachador(id, nombre, apellido, telefono);
	}
	
	public void Registar_Mesero(String id, String nombre, String apellido, String telefono) throws Exception{
		empleadosRepository.Registrar_mesero(id, nombre, apellido, telefono);
	}	
}

