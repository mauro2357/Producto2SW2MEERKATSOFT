package Negocio.ConsultarReportedeVentas;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Presentacion.GeneralesFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class consultartotalventasStepdefinitions {
	
	Administrador administrador = null;
	String totalventas = null;
	public  static GeneralesFacade generalesFacade= new GeneralesFacade();
	
	
	@Given("^El administrador consulta el total de las ventas$")
	public void El_administrador_consulta_el_total_de_las_ventas() throws Throwable {
		totalventas = generalesFacade.totalventas;
	}

	@When("^Hay ventas registradas en la BD$")
	public void Hay_ventas_registradas_en_la_BD() throws Throwable {
		Assert.assertTrue(totalventas != null);
	}

	@Then("^Mostrar el total de las ventas$")
	public void Mostrar_el_total_de_las_ventas() throws Throwable {
		Assert.assertTrue(totalventas != null);
	}
	
}
