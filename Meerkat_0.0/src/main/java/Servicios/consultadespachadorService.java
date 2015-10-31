package Servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Negocio.pedido.Despachador;
import Presentacion.DespachadoresFacade;


@Path("consultadespachador")
@Produces("text/plain")
public class consultadespachadorService {
    public consultadespachadorService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultardespachador/")
	public String consultarproductos() throws Exception { 
	    DespachadoresFacade despachadoresFacade = new DespachadoresFacade();
		despachadoresFacade.Consultar_despachadores();
		ArrayList<String> nombres = new ArrayList<String>();
		for(Despachador despachador: despachadoresFacade.listadespachadores){
			nombres.add(despachador.nombre);
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