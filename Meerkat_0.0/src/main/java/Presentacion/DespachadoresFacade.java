package Presentacion;

import java.util.ArrayList;

import Datos.DespachadorRepository;
import Negocio.pedido.*;

public class DespachadoresFacade {
	
	public Despachador despachador;
	public ArrayList<Despachador> listadespachadores;
	
	public ArrayList<Despachador> Consultar_despachador() throws Exception{
		DespachadorRepository productorepository = new DespachadorRepository();
		ArrayList<Despachador> x = productorepository.Consultar_despachador();
		this.listadespachadores = x;
		this.despachador = this.listadespachadores.get(0);
		return x;
	}

}
