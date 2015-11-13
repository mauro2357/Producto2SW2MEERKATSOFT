package Negocio.ManejodeNomina;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Presentacion.AdministradoresFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class claveaccesoadministradorStepdefinitions {
	
	AdministradoresFacade administradoresFacade = new AdministradoresFacade();
	Administrador administrador;
	
	@Given("^El administrador acceder a ciertas funciones$")
	public void El_administrador_acceder_a_ciertas_funciones() throws Throwable {
		administrador = administradoresFacade.Consultar_Administradores().get(0);
	}

	@When("^Copia la clave y es la asignada por el programa$")
	public void Copia_la_clave_y_es_la_asignada_por_el_programa() throws Throwable {
		String clave = "meerkat";
		Assert.assertTrue(clave.equalsIgnoreCase(administrador.clave));
	}

	@Then("^Redirigir a las funciones del administrador.$")
	public void Redirigir_a_las_funciones_del_administrador() throws Throwable {
		String clave = "meerkat";
		Assert.assertTrue(clave.equalsIgnoreCase(administrador.clave));
	}
	
}
