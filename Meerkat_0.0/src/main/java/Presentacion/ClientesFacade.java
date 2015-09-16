package Presentacion;

import java.util.ArrayList;

import Datos.ClientesRepository;
import Negocio.cliente.Cliente;

public class ClientesFacade {	
	
	public ArrayList<Cliente> listaclientes;
	
	public ArrayList<Cliente> main() throws Exception{
		ClientesRepository clientesrepository = new ClientesRepository();
		ArrayList<Cliente> x = clientesrepository.ConsultarCliente();
		this.listaclientes = x;
		return x;
	}
	
	public void Registrarcliente(String id, String nombre, String apellido, String sexo,  int puntos, String musica, String email, String telefono) throws Exception{
		ClientesRepository ingresarcliente = new ClientesRepository();
		ingresarcliente.registrarusuario(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	}
}