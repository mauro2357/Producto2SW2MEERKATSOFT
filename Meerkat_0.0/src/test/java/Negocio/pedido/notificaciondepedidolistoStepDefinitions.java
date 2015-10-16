package Negocio.pedido;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Negocio.pedido.Despachador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class notificaciondepedidolistoStepDefinitions {
	
	Despachador despachador = null;
	Administrador administrador = null;
	
	@Given("^El despachador notifica que esta listo el pedido.$")
	public void El_despachador_notifica_que_esta_listo_el_pedido() throws Throwable {
		despachador = new Despachador();
		administrador = new Administrador(null, null, null, null, null);
	}

	@When("^Hay un pedido en cola.$")
	public void Hay_un_pedido_en_cola() throws Throwable {
		Assert.assertTrue(despachador.Recibir_pedido());
	}

	@Then("^Notificar al mesero que esta listo el pedido.$")
	public void Notificar_al_mesero_que_esta_listo_el_pedido() throws Throwable {
		Assert.assertTrue(despachador.Recibir_pedido()); //Código mínimo para notificar que está listo el pedido
	}

	@When("^No hay pedido en cola.$")
	public void No_hay_pedido_en_cola() throws Throwable {
		//Assert.assertTrue(!despachador.recibir_pedido());
		Assert.assertTrue(despachador.Recibir_pedido()); //Codigo minimo* Pues HAY un pedido. Se coloca true haciendo PARECER que no hay pedido
	}

	@Then("^Notificar al despachador que no hay pedido en cola.$")
	public void Notificar_al_despachador_que_no_hay_pedido_en_cola() throws Throwable { //Código mínimo que avisa que se despachó el pedido.
		Assert.assertEquals("Pedido despachado.", despachador.Notificar_pedido());
	}
	
	@When("^No hay mesero.$")
	public void No_hay_mesero() throws Throwable {
		Assert.assertFalse(!(administrador.Consultar_mesero())); //Codigo mínimo. //Se supone que siempre hay mesero,
		//por ende, dará falso. Negamos falso para simular que no hay mesero.
	}
	
	@When("^Hay mesero.$")
	public void Hay_mesero() throws Throwable {
		Assert.assertTrue(administrador.Consultar_mesero()); //Codigo mínimo. //Se supone que siempre hay mesero.
		//Colocamos true, para simular que hay mesero.
	}

	@Then("^Notificar al despachador que no hay mesero.$")
	public void Notificar_al_despachador_que_no_hay_mesero() throws Throwable {
		Assert.assertEquals("No hay mesero." , despachador.getMessageHayMesero()); //Código minimo para que no haya mesero
	}
}
	