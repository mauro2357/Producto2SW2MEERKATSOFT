package Presentacion;

import java.util.ArrayList;
import Datos.EmpleadosRepository;
import Negocio.pedido.Mesero;

public class MeserosFacade {
	
	public Mesero mesero;
	public static EmpleadosRepository empleadosRepository = new EmpleadosRepository();
	public ArrayList<Mesero> listameseros;
	
	public ArrayList<Mesero> Consultar_meseros() throws Exception{
		ArrayList<Mesero> x = empleadosRepository.Consultar_mesero();
		if(mesero!=null) Definir_mesero(mesero.id);
		this.listameseros = x;
		return x;
	}

	public String Definir_mesero(String meseroi) {
		if(mesero==null || !mesero.id.equalsIgnoreCase(meseroi)){
        	for(Mesero mesero: listameseros){
        		if(mesero.id.contentEquals(meseroi)){
        			this.mesero = mesero;
        			return null;
        		}
        	}
        	return "El mesero no se encuentra en la lista de meseros contratados.";
    	}
		return null;
	}
	
}
