package Servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Negocio.cliente.Cliente;
import Presentacion.ClientesFacade;


@Path("consultagustomusical")
@Produces("text/plain")
public class consultagustomusicalService {
    public consultagustomusicalService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultargustomusical/")
	public String consultargusto() throws Exception { 
		ClientesFacade clientesFacade = new ClientesFacade();
		clientesFacade.Consultar_clientes();
		ArrayList<String> x = new ArrayList<String>();
		for(Cliente cliente: clientesFacade.listaclientes){
			x.add(cliente.nombre + " " + cliente.musica);
		}
		return x.toString();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}