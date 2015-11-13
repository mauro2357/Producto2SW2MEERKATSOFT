package Negocio.TomayNotificacionPedidos;

import java.util.ArrayList;
import java.util.*;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class listadodepedidosencolaStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	DespachadoresFacade despachadoresFacade = new DespachadoresFacade();
	MesasFacade mesasFacade = new MesasFacade();
	ArrayList<Pedido> x;
	Mesero mesero;
	Pedido pedido;
	Despachador despachador;
	
	
	@Given("^El mesero construye el pedido temporalmente.$")
	public void El_mesero_construye_el_pedido_temporalmente() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		despachador = new Despachador();
		Mesa mesa = mesasFacade.Buscar_Mesa("1");
		Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		cantidades.put(producto, 1);
		ArrayList<Producto> lista_productos = new ArrayList<Producto>();
		pedido = new Pedido(lista_productos, "1001", mesa, null, "2015-11-12", cantidades, mesero);
		pedido.Adicionarproducto(producto);
	}

	@When("^No hay pedidos en cola y el pedido contiene productos.$")
	public void No_hay_pedidos_en_cola_y_el_pedido_contiene_productos() throws Throwable {
		Assert.assertTrue((despachador.listafacturassindespachar.size()>0) && pedido.cuerpo.size()>0);
	}

	@Then("^Agregar el pedido a la cola.$")
	public void Agregar_el_pedido_a_la_cola() throws Throwable {
		mesero.enviar_pedido(pedido);
	}

	@When("^No hay pedidos en cola y el pedido no contiene productos.$")
	public void No_hay_pedidos_en_cola_y_el_pedido_no_contiene_productos() throws Throwable {
		Assert.assertFalse(!(despachador.listafacturassindespachar.size()>0) && !(pedido.cuerpo.size()>0));
	}

	@Then("^Notificar que el nuevo pedido no contiene productos.$")
	public void Notificar_que_el_nuevo_pedido_no_contiene_productos() throws Throwable {
		Assert.assertTrue((pedido.cuerpo.size()>0));
	}

	@When("^La mesa seleccionada ya tiene un pedido.$")
	public void La_mesa_seleccionada_ya_tiene_un_pedido() throws Throwable {
		mesero.enviar_pedido(pedido);
	}

	@Then("^Combinar productos entre los dos pedidos.$")
	public void Combinar_productos_entre_los_dos_pedidos() throws Throwable {
		Assert.assertTrue((pedido.cuerpo.size()>0));
	}

	@Given("^El mesero envia un pedido al despachador.$")
	public void El_mesero_envia_un_pedido_al_despachador() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		despachador = new Despachador();
		Mesa mesa = mesasFacade.Buscar_Mesa("1");
		Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		cantidades.put(producto, 1);
		ArrayList<Producto> lista_productos = new ArrayList<Producto>();
		pedido = new Pedido(lista_productos, "1001", mesa, null, "2015-11-12", cantidades, mesero);
		pedido.Adicionarproducto(producto);
		mesero.enviar_pedido(pedido);
	}

	@When("^Hay pedido en la mesa seleccionada.$")
	public void Hay_pedido_en_la_mesa_seleccionada() throws Throwable {
		Assert.assertTrue((pedido.cuerpo.size()>0));
	}

	@Then("^Enviar pedido.$")
	public void Enviar_pedido() throws Throwable {
		mesero.enviar_pedido(pedido);
	}

	@When("^No hay pedido en la mesa seleccionada.$")
	public void No_hay_pedido_en_la_mesa_seleccionada() throws Throwable {
		mesero.enviar_pedido(pedido);
	}

	@Then("^Notificar que no hay despachador.$")
	public void Notificar_que_no_hay_despachador() throws Throwable {
		Assert.assertFalse(!(despachadoresFacade.Consultar_despachadores().size()>0));
	}

	@Then("^Notificar al mesero que el esta listo el pedido.$")
	public void Notificar_al_mesero_que_el_esta_listo_el_pedido() throws Throwable {
		pedido = new Pedido();
		pedido.estado = "Despachado";
		Assert.assertTrue(pedido.estado.equalsIgnoreCase("Despachado"));
	}
	
}
