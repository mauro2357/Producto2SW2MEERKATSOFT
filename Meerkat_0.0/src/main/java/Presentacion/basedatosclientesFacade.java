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
	
	public void Registrarcliente(String id, String nombre, String apellido, String sexo,  int puntos, String musica, String email, String telefono) throws Exception{
		BasedatosclientesRepository ingresarcliente = new BasedatosclientesRepository();
		ingresarcliente.registrarusuario(id, nombre, apellido, sexo, puntos, musica, email, telefono);
		System.out.println("Ingreso al facade: ");
	}
}