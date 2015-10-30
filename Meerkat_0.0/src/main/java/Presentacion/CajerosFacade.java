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
	
	public void definir_cajero(){
		cajero = listacajeros.get(0);
	}
	
}