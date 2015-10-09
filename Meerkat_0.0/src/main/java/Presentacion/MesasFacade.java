package Presentacion;

import java.util.ArrayList;

import Datos.MesaRepository;
import Negocio.pedido.Mesa;

public class MesasFacade {
	
	public ArrayList<Mesa> listamesas;
	public ArrayList<Mesa> listamesas_libres;
	
	MesaRepository mesarepository = new MesaRepository();
	
	public ArrayList<Mesa> Consultar_mesas() throws Exception{
		ArrayList<Mesa> x = mesarepository.Consultar_mesa();
		this.listamesas = x;
		listamesas_libres = new ArrayList<Mesa>();
		for(Mesa mesa: listamesas){
			if(mesa.getEstado().equalsIgnoreCase("disponible") || mesa.getEstado().equalsIgnoreCase("disponible\r")) listamesas_libres.add(mesa);
		}
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

	public void Ocupar_Mesa(Mesa mesam) throws Exception {
		mesarepository.Ocupar_Desocupar_Mesa(mesam.getId(), "ocupada");
	}
}