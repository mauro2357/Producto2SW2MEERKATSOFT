package Servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Presentacion.GeneralesFacade;

@Path("consultamejormesero")
@Produces("text/plain")
public class consultamejormeseroService {
    public consultamejormeseroService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarmejormesero/")
	public String consultarmejormesero() throws Exception { 
		GeneralesFacade generalesFacade = new GeneralesFacade();
		return generalesFacade.Consultar_mejormesero();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}