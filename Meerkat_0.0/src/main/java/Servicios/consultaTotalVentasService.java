package Servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Presentacion.GeneralesFacade;


@Path("consultatotalventas")
@Produces("text/plain")
public class consultaTotalVentasService {
    public consultaTotalVentasService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultartotalventas/")
	public String consultarproductos() throws Exception { 
		GeneralesFacade generalesFacade = new GeneralesFacade();
		return generalesFacade.Consultar_totalventas();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}