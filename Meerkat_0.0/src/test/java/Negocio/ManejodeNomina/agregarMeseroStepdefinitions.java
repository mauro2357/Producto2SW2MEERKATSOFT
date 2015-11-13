package Negocio.ManejodeNomina;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Presentacion.AdministradoresFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class agregarMeseroStepdefinitions {
	
	AdministradoresFacade administradoresFacade = new AdministradoresFacade();
	Administrador administrador;
	
	@Given("^El administrador quiere agregar un nuevo mesero$")
	public void El_administrador_quiere_agregar_un_nuevo_mesero() throws Throwable {
		administrador = administradoresFacade.Consultar_Administradores().get(0);
	}	

	@When("^Presiona el boton nuevo mesero$")
	public void Presiona_el_boton_nuevo_mesero() throws Throwable {
		Assert.assertTrue(administrador!=null);
	}

	@Then("^Redirigir a una nueva jsp para llenar todos los datos y finalmente registrar al mesero.$")
	public void Redirigir_a_una_nueva_jsp_para_llenar_todos_los_datos_y_finalmente_registrar_al_mesero() throws Throwable {
		Assert.assertTrue(administrador!=null);
	}
	
}
