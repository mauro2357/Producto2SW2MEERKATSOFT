package Negocio.TomayNotificacionPedidos;


import java.util.ArrayList;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.MesasFacade;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class QuitarUnProductoStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	MesasFacade mesasFacade = new MesasFacade();
	Mesero mesero;
	Mesa mesa;
	Pedido pedido=null;
	
	@Given("^El mesero quita un producto al pedido.$")
	public void El_mesero_quita_un_producto_al_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		mesa = mesasFacade.Buscar_Mesa("1");
		pedido = new Pedido();
		ArrayList<Producto> cuerpo = new ArrayList<Producto>();
		pedido.cuerpo = cuerpo;
	}

	@Then("^Notifica que no hay pedido.$")
	public void Notifica_que_no_hay_pedido() throws Throwable {
		Assert.assertTrue(pedido!=null);
	}

	@Then("^Quitar producto al pedido.$")
	public void Quitar_producto_al_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		mesa = mesasFacade.Buscar_Mesa("1");
		pedido = new Pedido();
		Producto producto = mesero.consultarproductoinvididual("li01");
		ArrayList<Producto> cuerpo = new ArrayList<Producto>();
		cuerpo.add(producto);
		pedido.cuerpo = cuerpo;
		cuerpo.remove(producto);
	}
}
