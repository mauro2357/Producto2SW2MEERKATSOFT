package Presentacion;

import java.util.ArrayList;

import Datos.*;
import Negocio.factura.*;

public class CajerosFacade {	
	
	public Cajero cajero;
	public ArrayList<Cajero> listacajeros;
	
	public ArrayList<Cajero> Consultar_cajeros() throws Exception{
		CajeroRepository cajeroRepository = new CajeroRepository();
		ArrayList<Cajero> x = cajeroRepository.Consultar_cajeros();
		this.listacajeros = x;
		definir_cajero();
		return x;
	}
	
	public void definir_cajero(){           //Cajero por defecto por ahora.
		cajero = listacajeros.get(0);
	}

	public Cajero getCajero() {
		return cajero;
	}

	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	public ArrayList<Cajero> getListacajeros() {
		return listacajeros;
	}

	public void setListacajeros(ArrayList<Cajero> listacajeros) {
		this.listacajeros = listacajeros;
	}
	
}