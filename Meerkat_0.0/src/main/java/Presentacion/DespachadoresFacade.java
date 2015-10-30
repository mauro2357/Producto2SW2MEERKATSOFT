package Presentacion;

import java.util.ArrayList;

import Datos.DespachadorRepository;
import Negocio.pedido.Despachador;

public class DespachadoresFacade {
	
	public Despachador despachador;
	public ArrayList<Despachador> listadespachadores;
	
	public ArrayList<Despachador> Consultar_despachador() throws Exception{
		DespachadorRepository despachadorRepository = new DespachadorRepository();
		ArrayList<Despachador> x = despachadorRepository.Consultar_despachador();
		this.listadespachadores = x;
		this.despachador = this.listadespachadores.get(0);
		return x;
	}
}
