package Presentacion;

import java.util.ArrayList;
import Datos.EmpleadosRepository;
import Negocio.pedido.Despachador;

public class DespachadoresFacade {
	
	public Despachador despachador;
	public static EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	public ArrayList<Despachador> listadespachadores;
	
	public ArrayList<Despachador> Consultar_despachadores() throws Exception{
		ArrayList<Despachador> x = empleadosRepository.Consultar_despachador();
		this.listadespachadores = x;
		this.despachador = this.listadespachadores.get(0);
		return x;
	}
}
