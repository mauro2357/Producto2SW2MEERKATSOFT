package Presentacion;

import java.util.ArrayList;

import Datos.MeseroRepository;
import Negocio.tomaynotificacionpedidos.Mesero;

public class consultarmeserosFacade {
	public ArrayList<Mesero> main() throws Exception{
		MeseroRepository productorepository = new MeseroRepository();
		ArrayList<Mesero> x = productorepository.ConsultarMesero();
		return x;
	}
}
