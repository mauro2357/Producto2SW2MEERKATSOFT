package Presentacion;

import java.util.ArrayList;

import Datos.MesaRepository;
import Negocio.tomaynotificacionpedidos.Mesa;

public class consultarmesasFacade {
	public ArrayList<Mesa> main(int idu) throws Exception{
		MesaRepository mesarepository = new MesaRepository();
		ArrayList<Mesa> x = mesarepository.main();
		return x;
	}
}