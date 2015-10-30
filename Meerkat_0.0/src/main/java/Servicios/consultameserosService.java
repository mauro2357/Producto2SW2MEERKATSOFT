package Servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import Negocio.pedido.Mesero;
import Presentacion.MeserosFacade;


@Path("consultameseros")
@Produces("text/plain")
public class consultameserosService {
    public consultameserosService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarmeseros/")
	public String consultarproductos() throws Exception { 
		MeserosFacade meserosFacade = new MeserosFacade();
		meserosFacade.Consultar_meseros();
		ArrayList<String> nombres = new ArrayList<String>();
		for(Mesero mesero: meserosFacade.listameseros){
			nombres.add(mesero.nombre);
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