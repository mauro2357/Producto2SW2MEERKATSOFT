package Negocio.ManejodeNomina;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PagarNominaStepdefinitions {
	
	Administrador administrador = null;
	
	@Given("^El administrador quiere pagarle a todos sus empleados$")
	public void El_administrador_quiere_pagarle_a_todos_sus_empleados() throws Throwable {
		administrador = new Administrador(null, null, null, null, null);
		administrador.Contratar_Despachador(null, null, null, null);
	}

	@When("^Hay empleados empleados en la BD$")
	public void Hay_empleados_en_la_BD() throws Throwable {
		
	}

	@Then("^Ejecutar el metodo de pagar nomina$")
	public void Ejecutar_el_metodo_de_pagar_nomina() throws Throwable {
		
	}
	
}
