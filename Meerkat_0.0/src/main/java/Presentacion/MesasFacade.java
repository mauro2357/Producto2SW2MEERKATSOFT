package Presentacion;

import java.util.ArrayList;

import Datos.MesaRepository;
import Negocio.pedido.Mesa;

public class MesasFacade {
	public ArrayList<Mesa> Consultar_mesas() throws Exception{
		MesaRepository mesarepository = new MesaRepository();
		ArrayList<Mesa> x = mesarepository.Consultar_mesa();
		return x;
	}
}