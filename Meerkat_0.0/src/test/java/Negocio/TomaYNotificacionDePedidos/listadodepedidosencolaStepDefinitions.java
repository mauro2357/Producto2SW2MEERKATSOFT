package Negocio.TomaYNotificacionDePedidos;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class listadodepedidosencolaStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	Mesero mesero;
	Pedido pedido;
	Despachador despachador;
	
	@Given("^El mesero construye el pedido temporalmente.$")
	public void El_mesero_construye_el_pedido_temporalmente() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.getMesero();
		despachador = new Despachador();
		pedido = new Pedido();
		pedido.Adicionarproducto(mesero.consultarproductoinvididual("be01"));
	}

	@When("^No hay pedidos en cola y el pedido contiene productos.$")
	public void No_hay_pedidos_en_cola_y_el_pedido_contiene_productos() throws Throwable {
		Assert.assertTrue(despachador.getListafacturassindespachar().size()>0 && pedido.getCuerpo().size()>0);
	}

	@Then("^Agregar el pedido a la cola.$")
	public void Agregar_el_pedido_a_la_cola() throws Throwable {
		
	}

	@When("^No hay pedidos en cola y el pedido no contiene productos.$")
	public void No_hay_pedidos_en_cola_y_el_pedido_no_contiene_productos() throws Throwable {

	}

	@Then("^Notificar que el nuevo pedido no contiene productos.$")
	public void Notificar_que_el_nuevo_pedido_no_contiene_productos() throws Throwable {

	}

	@When("^La mesa seleccionada ya tiene un pedido.$")
	public void La_mesa_seleccionada_ya_tiene_un_pedido() throws Throwable {

	}

	@Then("^Combinar productos entre los dos pedidos.$")
	public void Combinar_productos_entre_los_dos_pedidos() throws Throwable {

	}

	@Given("^El mesero envia un pedido al despachador.$")
	public void El_mesero_envia_un_pedido_al_despachador() throws Throwable {
		
	}

	@When("^Hay pedido en la mesa seleccionada.$")
	public void Hay_pedido_en_la_mesa_seleccionada() throws Throwable {

	}

	@Then("^Enviar pedido.$")
	public void Enviar_pedido() throws Throwable {

	}

	@When("^No hay pedido en la mesa seleccionada.$")
	public void No_hay_pedido_en_la_mesa_seleccionada() throws Throwable {

	}

	@Then("^Notificar que no hay despachador.$")
	public void Notificar_que_no_hay_despachador() throws Throwable {

	}

	@Then("^Notificar al mesero que el esta listo el pedido.$")
	public void Notificar_al_mesero_que_el_esta_listo_el_pedido() throws Throwable {

	}
	
}
