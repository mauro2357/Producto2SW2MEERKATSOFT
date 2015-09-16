package Presentacion;

import java.util.ArrayList;

import Datos.*;
import Negocio.factura.*;

public class CajerosFacade {	
	
	public ArrayList<Cajero> listacajeros;
	
	public ArrayList<Cajero> main() throws Exception{
		CajeroRepository clientesrepository = new CajeroRepository();
		ArrayList<Cajero> x = clientesrepository.main();
		this.listacajeros = x;
		return x;
	}
	
}