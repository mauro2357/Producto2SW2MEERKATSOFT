package Servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import Negocio.pedido.Producto;
import Presentacion.MeserosFacade;


@Path("consultaproductos")
@Produces("text/plain")
public class consultaproductosService {
    public consultaproductosService() {
    }

	@GET
	@Produces("text/plain")
	@Path("consultarproductos/{mesero}")
	public String consultarproductos(@PathParam("mesero") String mesero) throws Exception { 
		MeserosFacade meserosFacade = new MeserosFacade();
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero(mesero);
		ArrayList<Producto> y = meserosFacade.mesero.productos;
		ArrayList<String> nombresproductos = new ArrayList<String>();
		for(Producto producto: y){
			nombresproductos.add(producto.nombre);
		}
		return nombresproductos.toString();
	}

	@PUT
	@Consumes("text/plain")
	public void resourceMethodPUT(String content) { 
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
}