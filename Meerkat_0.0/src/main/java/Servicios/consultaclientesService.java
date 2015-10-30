package Servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Negocio.cliente.Cliente;
import Presentacion.ClientesFacade;


@Path("consultaclientes")
@Produces("text/plain")
public class consultaclientesService {
    public consultaclientesService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarclientes/")
	public String consultarproductos() throws Exception { 
		ClientesFacade clientesFacade = new ClientesFacade();
		clientesFacade.Consultar_clientes();
		ArrayList<String> nombres = new ArrayList<String>();
		for(Cliente cliente: clientesFacade.listaclientes){
			nombres.add(cliente.nombre);
		}
		return nombres.toString();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}