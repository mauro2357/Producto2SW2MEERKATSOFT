package Negocio.pedido;

import java.util.ArrayList;

import Negocio.factura.Cajero;
import Presentacion.*;

public enum Nomina {
	INSTACE;
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	MeserosFacade meserosFacade = new MeserosFacade();
	DespachadoresFacade despachadoresFacade = new DespachadoresFacade();
	CajerosFacade cajerosFacade = new CajerosFacade();
	
	public void actualizarNomina() throws Exception{
		ArrayList<Mesero> x = meserosFacade.Consultar_meseros();
		ArrayList<Despachador> y = despachadoresFacade.Consultar_despachador();
		ArrayList<Cajero> z = cajerosFacade.Consultar_cajeros();
		for(Mesero mesero: x){
			empleados.add(mesero);
		}
		for(Despachador despachador: y){
			empleados.add(despachador);
		}
		for(Cajero cajero: z){
			empleados.add(cajero);
		}
		for(Empleado empleado: empleados){
			empleado.pagar();
		}
		
	}
	
}
