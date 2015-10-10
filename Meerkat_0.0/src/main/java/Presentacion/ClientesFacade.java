package Presentacion;

import java.util.ArrayList;

import Datos.ClientesRepository;
import Negocio.cliente.Cliente;

public class ClientesFacade {	
	
	public ArrayList<Cliente> listaclientes;
	
	public ArrayList<Cliente> Consultar_clientes() throws Exception{
		ClientesRepository clientesrepository = new ClientesRepository();
		ArrayList<Cliente> x = clientesrepository.Consultar_Clientes();
		this.listaclientes = x;
		return x;
	}
	
	public void Registrar_cliente(String id, String nombre, String apellido, String sexo,  int puntos, String musica, String email, String telefono) throws Exception{
		ClientesRepository ingresarcliente = new ClientesRepository();
		ingresarcliente.Registrar_usuario(id, nombre, apellido, sexo, puntos, musica, email, telefono);
	}
}