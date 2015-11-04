package Servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Negocio.pedido.Producto;
import Presentacion.GeneralesFacade;

@Path("consultainsumos")
@Produces("text/plain")
public class consultainsumosService {
    public consultainsumosService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarinsumos/")
	public ArrayList<Producto> consultarinsumos() throws Exception { 
		GeneralesFacade generalesFacade = new GeneralesFacade();
		return generalesFacade.Consultar_insumos();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}