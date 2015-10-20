package Negocio.TomaYNotificacionDePedidos;


import java.util.ArrayList;

import org.junit.Assert;

import Negocio.pedido.*;
import Presentacion.MeserosFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleccionarMeseroStepDefinitions {
	
	static MeserosFacade meserosFacade;
	ArrayList<Mesero> x;
	Mesero mesero;
	
	
	@Given("^El mesero solicita la lista de meseros.$")
	public void El_mesero_solicita_la_lista_de_meseros() throws Throwable {
		meserosFacade = new MeserosFacade();
		this.x = meserosFacade.Consultar_meseros();
	}

	@When("^No hay meseros contratados.$")
	public void No_hay_meseros_contratados() throws Throwable {
		Assert.assertTrue(!(x==null || x.size()<0));
	}

	@Then("^Notificar que no hay meseros contratados.$")
	public void Notificar_que_no_hay_meseros_contratados() throws Throwable {
		Assert.assertTrue(meserosFacade.NoHayMeseros()!="No hay meseros contratados.");
	}

	@When("^Hay meseros contratados$")
	public void Hay_meseros_contratados() throws Throwable {
		Assert.assertTrue(x.size()>0);
	}

	@Then("^Listar meseros contratados.$")
	public void Listar_meseros_contratados() throws Throwable {
		Assert.assertNotNull(x);
	}

	@Given("^El mesero se define como mesero actual.$")
	public void El_mesero_se_define_como_mesero_actual() throws Throwable {
		mesero = new Mesero();
		mesero.setId("800");
	}

	@When("^El mesero no se encuentra en la lista de meseros contratados.$")
	public void El_mesero_no_se_encuentra_en_la_lista_de_meseros_contratados() throws Throwable {
		String id = mesero.getId();
		this.mesero = null;
		x = meserosFacade.Consultar_meseros();
		for(Mesero mesero: x){
			if(id.equalsIgnoreCase(mesero.getId())) this.mesero = mesero;
		}
		Assert.assertTrue(this.mesero!=null);
	}

	@Then("^Notificar que el mesero no se encuentra en la lista de meseros contratados.$")
	public void Notificar_que_el_mesero_no_se_encuentra_en_la_lista_de_meseros_contratados() throws Throwable {
		Assert.assertTrue(meserosFacade.Definir_mesero(this.mesero.getId()) != "El mesero no se encuentra en la lista de meseros contratados.");
	}

	@When("^El mesero se encuentra en la lista de meseros contratados.$")
	public void El_mesero_se_encuentra_en_la_lista_de_meseros_contratados() throws Throwable {
		String id = mesero.getId();
		this.mesero = null;
		x = meserosFacade.Consultar_meseros();
		for(Mesero mesero: x){
			if(id.equalsIgnoreCase(mesero.getId())) this.mesero = mesero;
		}
		Assert.assertTrue(this.mesero!=null);
	}

	@Then("^Definir mesero como mesero actual.$")
	public void Definir_mesero_como_mesero_actual() throws Throwable {
		Assert.assertEquals(meserosFacade.Definir_mesero(this.mesero.getId()), null);
	}

	
}
