package Presentacion;

import java.util.ArrayList;

import Datos.MesaRepository;
import Negocio.pedido.Mesa;

public class MesasFacade {
	
	ArrayList<Mesa> listamesas;
	
	public ArrayList<Mesa> Consultar_mesas() throws Exception{
		MesaRepository mesarepository = new MesaRepository();
		ArrayList<Mesa> x = mesarepository.Consultar_mesa();
		this.listamesas = x;
		return x;
	}
	
	public Mesa Buscar_Mesa(String mesa) throws Exception{
		Mesa mesae = null;
		for(Mesa mesam: Consultar_mesas()){
			if(mesa.equalsIgnoreCase(mesam.getId())){
				mesae=mesam;
				break;
			}
		}
		return mesae;
	}
}