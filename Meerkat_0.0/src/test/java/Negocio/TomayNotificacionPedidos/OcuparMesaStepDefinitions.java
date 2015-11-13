package Negocio.TomayNotificacionPedidos;


import java.util.ArrayList;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.MesasFacade;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OcuparMesaStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	MesasFacade mesasFacade = new MesasFacade();
	Mesero mesero;
	Mesa mesa;
	Pedido pedido;
	
	@Given("^El mesero ocupara una mesa.$")
	public void El_mesero_ocupara_una_mesa() throws Throwable {
		mesero = meserosFacade.listameseros.get(0);
		mesa = mesasFacade.Buscar_Mesa("1");
		pedido = new Pedido();
		ArrayList<Producto> cuerpo = new ArrayList<Producto>();
		pedido.cuerpo = cuerpo;
	}

	@Then("^Ocuparla.$")
	public void Ocuparla() throws Throwable {
		mesero.Ocupar_Mesa(mesa);
	}

	@Then("^Notificar que no existe la mesa.$")
	public void Notificar_que_no_existe_la_mesa() throws Throwable {
		Assert.assertTrue(mesasFacade.Buscar_Mesa("1")!=null);
	}

	@Then("^Notificar que el pedido no tiene productos.$")
	public void Notificar_que_el_pedido_no_tiene_productos() throws Throwable {
		Assert.assertFalse(!(pedido.cuerpo.size()>0));
	}
}
