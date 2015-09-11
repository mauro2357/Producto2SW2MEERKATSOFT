package Presentacion;

import java.util.ArrayList;

import Datos.BasedatosclientesRepository;
import Negocio.basedatosclientes.Cliente;

public class basedatosclientesFacade {	
	
	public ArrayList<Cliente> listaclientes;
	
	public ArrayList<Cliente> main() throws Exception{
		System.out.println("Ingreso al facade: ");
		BasedatosclientesRepository clientesrepository = new BasedatosclientesRepository();
		System.out.println("Creo el nuevo objeto repository: ");
		ArrayList<Cliente> x = clientesrepository.ConsultarCliente();
		this.listaclientes = x;
		
		return x;
	}
}