package Negocio.ManejodeNomina;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Presentacion.AdministradoresFacade;
import Presentacion.NominaFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PagarNominaStepdefinitions {
	
	AdministradoresFacade administradoresFacade = new AdministradoresFacade();
	NominaFacade nominaFacade = new NominaFacade();
	Administrador administrador;
	
	
	@Given("^El administrador quiere pagarle a todos los empleados$")
	public void El_administrador_quiere_pagarle_a_todos_los_empleados() throws Throwable {
		administrador = administradoresFacade.Consultar_Administradores().get(0);
	}

	@When("^Hay empleados en la BD$")
	public void Hay_empleados_en_la_BD() throws Throwable {
		Assert.assertTrue(nominaFacade.Consultar_Empleados().size()>0);
	}

	@Then("^Ejecutar el metodo de pagar nomina$")
	public void Ejecutar_el_metodo_de_pagar_nomina() throws Throwable {
		administrador.pagar();
	}
	
}
