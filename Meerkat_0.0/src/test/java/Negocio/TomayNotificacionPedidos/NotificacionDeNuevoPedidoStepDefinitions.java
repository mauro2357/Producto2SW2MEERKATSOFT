package Negocio.TomayNotificacionPedidos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.ClientesFacade;
import Presentacion.DespachadoresFacade;
import Presentacion.MesasFacade;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NotificacionDeNuevoPedidoStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	MesasFacade mesasFacade = new MesasFacade();
	DespachadoresFacade despachadoresFacade = new DespachadoresFacade();
	ClientesFacade clientesFacade = new ClientesFacade();
	Pedido pedido;
	Mesero mesero;
	Mesa mesa;
	Despachador despachador;
	
	
	@Given("^El mesero crea un nuevo pedido.$")
	public void El_mesero_crea_un_nuevo_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		despachador = new Despachador();
		mesa = mesasFacade.Buscar_Mesa("1");
		Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		cantidades.put(producto, 1);
		ArrayList<Producto> lista_productos = new ArrayList<Producto>();
		pedido = new Pedido(lista_productos, "1001", mesa, null, "2015-11-12", cantidades, mesero);
		pedido.Adicionarproducto(producto);
	}

	@When("^Hay productos en el pedido.$")
	public void Hay_productos_en_el_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		despachador = new Despachador();
		mesa = mesasFacade.Buscar_Mesa("1");
		Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		cantidades.put(producto, 1);
		ArrayList<Producto> lista_productos = new ArrayList<Producto>();
		pedido = new Pedido(lista_productos, "1001", mesa, null, "2015-11-12", cantidades, mesero);
		pedido.Adicionarproducto(producto);
		Assert.assertTrue(pedido.cuerpo.size()>0);
	}

	@Then("^Enviar pedido al despachador.$")
	public void Enviar_pedido_al_despachador() throws Throwable {
		mesero.enviar_pedido(pedido);
	}

	@When("^No hay productos en el pedido.$")
	public void No_hay_productos_en_el_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		despachador = new Despachador();
		mesa = mesasFacade.Buscar_Mesa("1");
		Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		cantidades.put(producto, 1);
		ArrayList<Producto> lista_productos = new ArrayList<Producto>();
		pedido = new Pedido(lista_productos, "1001", mesa, null, "2015-11-12", cantidades, mesero);
		pedido.Adicionarproducto(producto);
		Assert.assertFalse(!(pedido.cuerpo.size()>0));
	}

	@Then("^Notificar al mesero que no hay productos en el pedido.$")
	public void Notificar_al_mesero_que_no_hay_productos_en_el_pedido() throws Throwable {
		meserosFacade.Consultar_meseros();
		meserosFacade.Definir_mesero("800");
		mesero = meserosFacade.mesero;
		despachador = new Despachador();
		mesa = mesasFacade.Buscar_Mesa("1");
		Map<Producto,Integer> cantidades = new HashMap<Producto,Integer>();
		Producto producto = mesero.consultarproductoinvididual("li01");
		cantidades.put(producto, 1);
		ArrayList<Producto> lista_productos = new ArrayList<Producto>();
		pedido = new Pedido(lista_productos, "1001", mesa, null, "2015-11-12", cantidades, mesero);
		pedido.Adicionarproducto(producto);
		Assert.assertFalse(!(pedido.cuerpo.size()>0));
	}

	@When("^No hay despachador.$")
	public void No_hay_despachador() throws Throwable {
		Assert.assertFalse(!(despachadoresFacade.Consultar_despachadores().size()>0));
	}

	@Then("^Notificar al mesero que no hay despachador.$")
	public void Notificar_al_mesero_que_no_hay_despachador() throws Throwable {
		Assert.assertFalse(!(despachadoresFacade.Consultar_despachadores().size()>0));
	}

	@When("^La mesa existe.$")
	public void La_mesa_existe() throws Throwable {
		Assert.assertTrue(mesasFacade.Buscar_Mesa("1")!=null);
	}

	@When("^La mesa no existe.$")
	public void La_mesa_no_existe() throws Throwable {
		mesasFacade = new MesasFacade();
		Assert.assertTrue(!(mesasFacade.Buscar_Mesa("1")==null));
	}

	@Then("^Notificar al mesero que la mesa no existe.$")
	public void Notificar_al_mesero_que_la_mesa_no_existe() throws Throwable {
		mesasFacade = new MesasFacade();
		Assert.assertTrue(!(mesasFacade.Buscar_Mesa("1")==null));
	}

	@When("^El cliente existe.$")
	public void El_cliente_existe() throws Throwable {
		Assert.assertTrue(clientesFacade.Consultar_Cliente_Particular("1001")!=null);
	}

	@When("^El cliente no existe.$")
	public void El_cliente_no_existe() throws Throwable {
		Assert.assertTrue(!(clientesFacade.Consultar_Cliente_Particular("1001")==null));
	}

	@Then("^Enviar pedido al despachador como cliente Publico.$")
	public void Enviar_pedido_al_despachador_como_cliente_Publico() throws Throwable {
		pedido.cliente="Publico";
		mesero.enviar_pedido(pedido);
	}


	
}
