package Negocio.TomayNotificacionPedidos;

import org.junit.Assert;

import Negocio.factura.Factura;
import Negocio.pedido.Despachador;
import Presentacion.DespachadoresFacade;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class notificaciondepedidolistoStepDefinitions {
	
	DespachadoresFacade despachadoresFacade = new DespachadoresFacade();
	MeserosFacade meserosFacade = new MeserosFacade();
	Despachador despachador;
	Factura factura;
	
	@Given("^El despachador notifica que esta listo el pedido.$")
	public void El_despachador_notifica_que_esta_listo_el_pedido() throws Throwable {
		despachador = despachadoresFacade.Consultar_despachadores().get(0);
		factura = despachador.listafacturassindespachar.get(0);
		
	}

	@When("^Hay un pedido en cola.$")
	public void Hay_un_pedido_en_cola() throws Throwable {
		Assert.assertTrue(despachador.listafacturassindespachar.size()>0);
	}

	@Then("^Notificar al mesero que esta listo el pedido.$")
	public void Notificar_al_mesero_que_esta_listo_el_pedido() throws Throwable {
		despachador.despachar(factura.id);
	}

	@When("^No hay pedido en cola.$")
	public void No_hay_pedido_en_cola() throws Throwable {
		Assert.assertFalse(!(despachador.listafacturassindespachar.size()>0)); 
	}

	@Then("^Notificar al despachador que no hay pedido en cola.$")
	public void Notificar_al_despachador_que_no_hay_pedido_en_cola() throws Throwable { //Código mínimo que avisa que se despachó el pedido.
		Assert.assertFalse(!(despachador.listafacturassindespachar.size()>0));
	}
	
	@When("^No hay mesero.$")
	public void No_hay_mesero() throws Throwable {
		Assert.assertFalse(!(meserosFacade.Consultar_meseros().size()>0));
	}
	
	@When("^Hay mesero.$")
	public void Hay_mesero() throws Throwable {
		Assert.assertTrue((meserosFacade.Consultar_meseros().size()>0));
	}

	@Then("^Notificar al despachador que no hay mesero.$")
	public void Notificar_al_despachador_que_no_hay_mesero() throws Throwable {
		Assert.assertFalse(!(meserosFacade.Consultar_meseros().size()>0));
	}
}
	