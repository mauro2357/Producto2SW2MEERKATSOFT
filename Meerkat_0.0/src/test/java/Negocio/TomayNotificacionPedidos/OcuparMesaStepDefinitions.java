package Negocio.TomayNotificacionPedidos;


import java.util.ArrayList;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.*;

public class OcuparMesaStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	Mesero mesero;
	Pedido pedido=null;
	
	@Given("^El mesero agregua un producto al pedido.$")
	public void El_mesero_agregua_un_producto_al_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
	}

	@When("^No hay pedido.$")
	public void No_hay_pedido() throws Throwable {
		Assert.assertTrue(pedido==null);
	}

	@Then("^Se crea el pedido.$")
	public void Se_crea_el_pedido() throws Throwable {
		pedido = new Pedido();
	}

	@When("^Hay pedido.$")
	public void Hay_pedido() throws Throwable {
		Assert.assertTrue(!(pedido!=null));
	}

	@Then("^Agregar producto al pedido.$")
	public void Agregar_producto_al_pedido() throws Throwable {
		pedido = new Pedido();
		pedido.cuerpo = new ArrayList<Producto>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		pedido.cuerpo.add(producto);
	}
}
