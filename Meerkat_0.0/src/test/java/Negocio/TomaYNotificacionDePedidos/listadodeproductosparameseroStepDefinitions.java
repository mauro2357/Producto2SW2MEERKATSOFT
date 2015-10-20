package Negocio.TomaYNotificacionDePedidos;

import java.util.ArrayList;

import org.junit.Assert;
import Negocio.pedido.*;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class listadodeproductosparameseroStepDefinitions {
	
	MeserosFacade meserosFacade = new MeserosFacade();
	ArrayList<Producto> x;
	Mesero mesero;
	
	@Given("^El mesero va a consultar los productos.$")
	public void El_mesero_va_a_consultar_los_productos() throws Throwable {
		mesero = new Mesero();
		x = mesero.getProductos();
	}

	@When("^No hay productos.$")
	public void No_hay_productos() throws Throwable {
		Assert.assertTrue(!(x.size()<0));
	}

	@Then("^Notificar que no hay productos para vender.$")
	public void Notificar_que_no_hay_productos_para_vender() throws Throwable {
		Assert.assertEquals("Hay productos",mesero.getMensaje());
	}

	@When("^Hay productos.$")
	public void Hay_productos() throws Throwable {
		Assert.assertTrue(x.size()>0);
	}

	@Then("^Notificar que productos hay para vender.$")
	public void Notificar_que_productos_hay_para_vender() throws Throwable {
		Assert.assertEquals("Hay productos",mesero.getMensaje());
	}
	
}
