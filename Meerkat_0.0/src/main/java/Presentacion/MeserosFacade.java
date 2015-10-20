package Presentacion;

import java.util.ArrayList;

import Datos.MeseroRepository;
import Negocio.pedido.Mesero;

public class MeserosFacade {
	
	public Mesero mesero;
	public static MeseroRepository productorepository = new MeseroRepository();
	public ArrayList<Mesero> listameseros;
	
	public ArrayList<Mesero> Consultar_meseros() throws Exception{
		ArrayList<Mesero> x = productorepository.Consultar_mesero();
		if(mesero!=null) Definir_mesero(mesero.getId());
		this.listameseros = x;
		return x;
	}

	public String Definir_mesero(String meseroi) {
		if(mesero==null || !mesero.getId().equalsIgnoreCase(meseroi)){
        	for(Mesero mesero: listameseros){
        		if(mesero.getId().contentEquals(meseroi)){
        			this.mesero = mesero;
        			return null;
        		}
        	}
        	return "El mesero no se encuentra en la lista de meseros contratados.";
    	}
		return null;
	}

	public String NoHayMeseros(){
		if(this.listameseros==null || this.listameseros.size()<0) return "No hay meseros contratados.";
		return null;
	}
	
	public Mesero getMesero() {
		return mesero;
	}

	public void setMesero(Mesero mesero) {
		this.mesero = mesero;
	}

	public static MeseroRepository getProductorepository() {
		return productorepository;
	}

	public static void setProductorepository(MeseroRepository productorepository) {
		MeserosFacade.productorepository = productorepository;
	}

	public ArrayList<Mesero> getListameseros() {
		return listameseros;
	}

	public void setListameseros(ArrayList<Mesero> listameseros) {
		this.listameseros = listameseros;
	}
	
	
	
}
