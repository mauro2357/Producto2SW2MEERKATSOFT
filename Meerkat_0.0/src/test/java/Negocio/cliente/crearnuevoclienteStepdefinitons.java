package Negocio.cliente;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Negocio.inventario.Administrador;
import Negocio.pedido.Mesero;

public class crearnuevoclienteStepdefinitons {
	
	Administrador administrador = null;
	
	@Given("^El mesero va a agregar un nuevo cliente$")
	public void El_mesero_va_a_agregar_un_nuevo_cliente() throws Throwable {
		Mesero mesero = new Mesero();
		mesero.Registrar_Cliente(null, null, null, null, 0, null, null, null);
	}

	@When("^Presiona el boton registrar cliente$")
	public void Presiona_el_boton_registrar_cliente() throws Throwable {

	}

	@Then("^Redirigir a una nueva jsp para ingresar los datos y finalmente registrar el cliente en la BD$")
	public void Redirigir_a_una_nueva_jsp_para_ingresar_los_datos_y_finalmente_registrar_el_cliente_en_la_BD() throws Throwable {

	}

}
