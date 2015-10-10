package Negocio.pedido;

import org.junit.Assert;

import Negocio.pedido.Mesero;
import Negocio.pedido.Producto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class listadodeproductosparameseroStepDefinitions {
	
	Mesero mesero = null;
	
	@Given("^El mesero va a consultar los productos.$")
	public void El_mesero_va_a_consultar_los_productos() throws Throwable { 
		mesero = new Mesero();
	}

	@When("^No hay productos.$")
	public void No_hay_productos() throws Throwable {
		Assert.assertTrue(!(mesero.getProductos().size()==0));
	}

	@Then("^Notificar que no hay productos para vender.$")
	public void Notificar_que_no_hay_productos_para_vender() throws Throwable {
	    Assert.assertTrue(mesero.getMensaje()!="No hay productos.");
	}
	
	@When("^Hay productos.$")
	public void Hay_productos() throws Throwable {
	    Assert.assertTrue(mesero.getProductos().size()>0);
	}
	
	@Then("^Notificar que productos hay para vender.$")
	public void Notificar_que_productos_hay_para_vender() throws Throwable {
		Producto producto = mesero.getProductos().get(0);
	    Assert.assertEquals("coca cola ", producto.getNombre());
	    Assert.assertEquals(2000, producto.getValor(),0); 
	}
	
	@Given("^El mesero va a consultar un producto.$")
	public void El_mesero_va_a_consultar_un_producto() throws Throwable {
	}

	@When("^Existe el producto.$")
	public void Existe_el_producto() throws Throwable {
		Assert.assertTrue(mesero.consultarproductoinvididual("be01")!=null);
	}

	@Then("^Notificar el producto.$")
	public void Notificar_el_producto() throws Throwable {
	}

	@When("^No existe el producto.$")
	public void No_existe_el_producto() throws Throwable {

	}

	@Then("^Notificar que no existe el producto.$")
	public void Notificar_que_no_existe_el_producto() throws Throwable {

	}

	@When("^Existe un error en la base de datos.$")
	public void Existe_un_error_en_la_base_de_datos() throws Throwable {

	}

	
}
