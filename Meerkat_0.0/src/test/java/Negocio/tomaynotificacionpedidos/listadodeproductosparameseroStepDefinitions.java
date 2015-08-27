package Negocio.tomaynotificacionpedidos;

import java.util.ArrayList;

import org.junit.Assert;

import Negocio.tomaynotificacionpedidos.Mesero;
import Negocio.tomaynotificacionpedidos.Producto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class listadodeproductosparameseroStepDefinitions {
	
	Mesero mesero = null;
	ArrayList<Producto> x = null;
	
	@Given("^El mesero va a consultar los productos.$")
	public void El_mesero_va_a_consultar_los_productos() throws Throwable { 
		mesero = new Mesero();
	}

	@When("^No hay productos.$")
	public void No_hay_productos() throws Throwable {
		x = mesero.consultarproductos();
		Assert.assertTrue(!(x.size()==0));
	}

	@Then("^Notificar que no hay productos para vender.$")
	public void Notificar_que_no_hay_productos_para_vender() throws Throwable {
	    Assert.assertTrue(mesero.getMensaje()!="No hay productos.");
	}
	
	@When("^Hay productos.$")
	public void Hay_productos() throws Throwable {
		x = mesero.consultarproductos();
	    Assert.assertTrue(x.size()>0);
	}
	
	@Then("^Notificar que productos hay para vender.$")
	public void Notificar_que_productos_hay_para_vender() throws Throwable {
		Producto producto = x.get(0);
	    Assert.assertEquals("Media de guaro", producto.getNombre());
	    Assert.assertEquals(8000, (double) producto.getValor(),0); 
	}
}