package Servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Presentacion.GeneralesFacade;

@Path("consultatotaliva")
@Produces("text/plain")
public class consultaTotalivaService {
    public consultaTotalivaService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultartotaliva/")
	public Double consultariva() throws Exception { 
		GeneralesFacade generalesFacade = new GeneralesFacade();
		return generalesFacade.Consultar_Iva();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}