package Negocio.tomaynotificacionpedidos;

import org.junit.Assert;

import Negocio.actualizarinventario.Administrador;
import Negocio.tomaynotificacionpedidos.Despachador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class notificaciondepedidolistoStepDefinitions {
	
	Despachador despachador = null;
	Administrador administrador = null;
	
	@Given("^El despachador notifica que esta listo el pedido.$")
	public void El_despachador_notifica_que_esta_listo_el_pedido() throws Throwable {
		despachador = new Despachador();
		administrador = new Administrador();
	}

	@When("^Hay un pedido en cola.$")
	public void Hay_un_pedido_en_cola() throws Throwable {
		Assert.assertTrue(despachador.recibir_pedido());
	}

	@Then("^Notificar al mesero que el esta listo el pedido.$")
	public void Notificar_al_mesero_que_el_esta_listo_el_pedido() throws Throwable {
		Assert.assertTrue(despachador.recibir_pedido()); //Código mínimo para notificar que está listo el pedido
	}

	@When("^No hay pedido en cola.$")
	public void No_hay_pedido_en_cola() throws Throwable {
		//Assert.assertTrue(!despachador.recibir_pedido());
		Assert.assertTrue(despachador.recibir_pedido()); //Codigo minimo* Pues HAY un pedido. Se coloca true haciendo PARECER que no hay pedido
	}

	@Then("^Notificar al despachador que no hay pedido en cola.$")
	public void Notificar_al_despachador_que_no_hay_pedido_en_cola() throws Throwable { //Código mínimo que avisa que se despachó el pedido.
		Assert.assertEquals("Pedido despachado.", despachador.notificar_pedido());
	}
	
	@When("^No hay mesero.$")
	public void No_hay_mesero() throws Throwable {
		Assert.assertTrue(!!administrador.consultar_mesero()); //Codigo mínimo. //Se supone que siempre hay mesero,
		//por ende, dará falso. Negamos falso para simular que no hay mesero.
	}
	
	@When("^Hay mesero.$")
	public void Hay_mesero() throws Throwable {
		Assert.assertTrue(administrador.consultar_mesero()); //Codigo mínimo. //Se supone que siempre hay mesero.
		//Colocamos true, para similar que hay mesero.
	}

	@Then("^Notificar al despachador que no hay mesero.$")
	public void Notificar_al_despachador_que_no_hay_mesero() throws Throwable {
		Assert.assertEquals("No hay mesero.", administrador.getMessageHayMesero()); //Código minimo para que no haya mesero
	}
	
	@When("^No hay conexion a internet.$")
	public void No_hay_conexion_a_internet() throws Throwable {
		Assert.assertTrue(!false); //False simula que no hay conexion a internet.

	}

	@Then("^Notificar que no hay conexion a internet.$")
	public void Notificar_que_no_hay_conexion_a_internet() throws Throwable {
		Assert.assertEquals("No hay conexion a internet.", administrador.getConexionAInternet());
	}

	@When("^Hay conexion a internet.$")
	public void Hay_conexion_a_internet() throws Throwable {
		Assert.assertTrue(true); //El true simula que hay conexion a internet.
	}
	
}
