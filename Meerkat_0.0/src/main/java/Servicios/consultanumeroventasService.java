package Servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Presentacion.GeneralesFacade;

@Path("consultanumeroventas")
@Produces("text/plain")
public class consultanumeroventasService {
    public consultanumeroventasService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarnumeroventas/")
	public String consultarventas() throws Exception { 
		GeneralesFacade generalesFacade = new GeneralesFacade();
		return generalesFacade.Consultar_ventas();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}