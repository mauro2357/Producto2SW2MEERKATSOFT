package Negocio.ActualizarInventario;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import Negocio.pedido.Producto;
import Presentacion.AdministradoresFacade;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class agregarproductoalinventarioStepDefinitios {
	
	public static AdministradoresFacade administradoresFacade = new AdministradoresFacade();
	public static Administrador administrador;
	Producto insumo = null;
	
	@Given("^El administrador agrega los insumos al inventario.$")
	public void El_administrador_agrega_los_insumos_al_inventario() throws Throwable {
		administrador = administradoresFacade.Consultar_Administradores().get(0);
	}

	@When("^El insumo existe.$")
	public void El_insumo_existe() throws Throwable {
		insumo = administrador.Consultar_Insumos().get(0);
	}

	@Then("^Suma.$")
	public void Suma() throws Throwable {
		administrador.Agregar_insumo(insumo.codigo, insumo.nombre, insumo.valor, 1);
	}

	@When("^El insumo no existe.$")
	public void El_insumo_no_existe() throws Throwable {
		Assert.assertTrue(insumo==null);
	}

	@Then("^Crea.$")
	public void Crea() throws Throwable {
		administrador.Agregar_insumo("456", "papas", 2500, 1);
	}


}

	

