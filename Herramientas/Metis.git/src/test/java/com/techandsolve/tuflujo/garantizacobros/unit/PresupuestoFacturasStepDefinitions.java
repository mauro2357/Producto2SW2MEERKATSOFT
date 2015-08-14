package com.techandsolve.tuflujo.garantizacobros.unit;

import static org.junit.Assert.assertEquals;

import com.techandsolve.tuflujo.domain.Cliente;
import com.techandsolve.tuflujo.domain.Presupuesto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PresupuestoFacturasStepDefinitions {
	private Presupuesto presupuesto;

	@Given("^El cliente NO es del sector salud.$")
	public void El_cliente_NO_es_del_sector_salud() throws Throwable {
		presupuesto = new Presupuesto();
		presupuesto.setCliente(new Cliente());
		presupuesto.getCliente().setSector("Financiero");
		presupuesto.setValor(1000000);

	}

	@When("^se presupueste la factura.$")
	public void se_presupueste_la_factura() throws Throwable {
		presupuesto.presupuestar();
	}

	@Then("^se debe cobrar un (\\d+)% adicional por concepto de IVA.$")
	public void se_debe_cobrar_un_adicional_por_concepto_de_IVA(int arg1)
			throws Throwable {
		assertEquals(presupuesto.getValor(), new Integer(1160000));
	}
}
