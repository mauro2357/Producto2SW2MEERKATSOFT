package Negocio.factura;

import org.junit.Assert;

import Presentacion.CajerosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class generaciondefacturaStepDefinitions {

	public static Factura factura = null;
	public static CajerosFacade cajerosFacade = new CajerosFacade();
	public static Cajero cajero = null;
	
	@Given("^El cajero generara una factura de cobro.$")
	public void El_cajero_generara_una_factura_de_cobro() throws Throwable {
		cajero = cajerosFacade.Consultar_cajeros().get(0);
	}

	@When("^Hay pedido.$")
	public void Hay_pedido() throws Throwable {
		Assert.assertFalse(cajero.generarfactura("1")!=null);
	}

	@Then("^Generar factura de cobro.$")
	public void Generar_factura_de_cobro() throws Throwable {
		factura = cajero.generarfactura("1");
	}

	@When("^No hay pedido.$")
	public void No_hay_pedido() throws Throwable {
		Assert.assertFalse(cajero.generarfactura("1")!=null);
	}

	@Then("^Notificar que no hay pedido.$")
	public void Notificar_que_no_hay_pedido() throws Throwable {
		Assert.assertFalse(cajero.generarfactura("1")!=null);
	}

}
