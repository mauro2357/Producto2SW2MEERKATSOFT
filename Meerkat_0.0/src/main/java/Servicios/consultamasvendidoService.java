package Servicios;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


import Presentacion.GeneralesFacade;


@Path("consultamasvendido")
@Produces("text/plain")
public class consultamasvendidoService {
    public consultamasvendidoService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarmasvendido/")
	public String consultarmasvendido() throws Exception { 
		GeneralesFacade inventarioFacade = new GeneralesFacade();
		return inventarioFacade.Consultar_productomasvendido();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}