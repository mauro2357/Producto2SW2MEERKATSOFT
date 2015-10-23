package Presentacion;

import java.util.ArrayList;

import Datos.CancionRepository;
import Negocio.musica.Cancion;

public class CancionFacade {
	
	CancionRepository cancionRepository = new CancionRepository();
	public ArrayList<Cancion> Consultar_canciones(String aignorar) throws Exception{
		ArrayList<Cancion> x = CancionRepository.Consultar_Canciones();
		return x;
	}

}
