package Presentacion;

import java.util.ArrayList;

import Datos.*;
import Negocio.factura.*;

public class CajerosFacade {	
	
	public ArrayList<Cajero> listacajeros;
	
	public ArrayList<Cajero> Consultar_cajeros() throws Exception{
		CajeroRepository clientesrepository = new CajeroRepository();
		ArrayList<Cajero> x = clientesrepository.Consultar_cajeros();
		this.listacajeros = x;
		return x;
	}
	
}