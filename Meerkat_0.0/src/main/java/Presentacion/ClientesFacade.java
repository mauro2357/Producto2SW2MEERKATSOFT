package Presentacion;

import java.util.ArrayList;

import Datos.ClientesRepository;
import Negocio.cliente.Cliente;

public class ClientesFacade {	
	
	public ArrayList<Cliente> listaclientes;
	public static ClientesRepository clientesrepository = new ClientesRepository();
	
	public ArrayList<Cliente> Consultar_clientes() throws Exception{
		ArrayList<Cliente> x = clientesrepository.Consultar_Clientes();
		this.listaclientes = x;
		return x;
	}
	
	public void Registrar_cliente(String id, String nombre, String apellido, String sexo,  int puntos, String musica, String email, String telefono) throws Exception{
		clientesrepository.Registrar_usuario(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	}

	public Cliente Consultar_Cliente_Particular(String cliente) throws Exception {
		if(this.listaclientes==null) Consultar_clientes();
		for(Cliente clientem: this.listaclientes){
			if(clientem.getId().equalsIgnoreCase("cliente")) return clientem;
		}
		return null;
	}
}