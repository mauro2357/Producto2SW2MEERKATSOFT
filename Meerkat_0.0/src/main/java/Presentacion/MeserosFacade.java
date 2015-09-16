package Presentacion;

import java.util.ArrayList;

import Datos.MeseroRepository;
import Negocio.pedido.Mesero;

public class MeserosFacade {
	public Mesero mesero;
	public ArrayList<Mesero> listameseros;
	
	public ArrayList<Mesero> main() throws Exception{
		MeseroRepository productorepository = new MeseroRepository();
		ArrayList<Mesero> x = productorepository.ConsultarMesero();
		this.listameseros = x;
		return x;
	}

	public void definirmesero(String meseroi) {
		if(mesero==null){
        	for(Mesero mesero: listameseros){
        		if(mesero.getId().contentEquals(meseroi)) this.mesero = mesero;
        	}
    	}
	}
	
	
	
}
