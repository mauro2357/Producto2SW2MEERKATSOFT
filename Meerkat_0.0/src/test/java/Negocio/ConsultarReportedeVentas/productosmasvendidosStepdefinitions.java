package Negocio.ConsultarReportedeVentas;

import java.util.ArrayList;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Negocio.pedido.Producto;
import Presentacion.GeneralesFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class productosmasvendidosStepdefinitions {
	
	ArrayList<Producto> a; 
	GeneralesFacade generalesFacade= new GeneralesFacade();
	
	@Given("^El administrador va a consultar los productos mas vendidos$")
	public void El_administrador_va_a_consultar_los_productos_mas_vendidos() throws Throwable {
		a = generalesFacade.Consultar_productosmasvendidos();
	}

	@When("^Existen ventas en la base de datos$")
	public void Existen_ventas_en_la_base_de_datos() throws Throwable {
		Assert.assertTrue(a.size() > 0);
	}

	@Then("^Mostrar el listado de productos$")
	public void Mostrar_el_listado_de_productos() throws Throwable {
		Assert.assertTrue(a.size() > 0);
	}
	
}
