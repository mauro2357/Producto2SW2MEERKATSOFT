package Presentacion;

import java.util.ArrayList;

import Datos.MesaRepository;
import Negocio.pedido.Mesa;

public class MesasFacade {
	
	MesaRepository mesaRepository = new MesaRepository();
	
	public ArrayList<Mesa> Consultar_mesas(String aignorar) throws Exception{
		ArrayList<Mesa> x = mesaRepository.Consultar_mesas(aignorar);
		return x;
	}
	
	public Mesa Buscar_Mesa(String mesa) throws Exception{
		Mesa mesae = null;
		for(Mesa mesam: Consultar_mesas(null)){
			if(mesa.equalsIgnoreCase(mesam.id)){
				mesae=mesam;
				break;
			}
		}
		return mesae;
	}

	public void Ocupar_Mesa(Mesa mesam) throws Exception {
		mesaRepository.Ocupar_Desocupar_Mesa(mesam.id, "ocupada");
	}
}