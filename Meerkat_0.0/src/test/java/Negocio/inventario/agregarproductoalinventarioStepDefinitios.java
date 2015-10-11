package Negocio.inventario;

import org.junit.Assert;

import Negocio.inventario.Administrador;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class agregarproductoalinventarioStepDefinitios {
	
	Administrador administrador = null;
	
	@Given("^El administrador agrega un producto al inventario.$")
	public void El_administrador_agrega_un_producto_al_inventario() throws Throwable {
		administrador = new Administrador(null, null, null, null, null);
		administrador.AgregarProducto();
	
		
		
	}

	@When("^No Hay productos en el inventario.$")
	public void No_Hay_productos_en_el_inventario() throws Throwable {
		
	}
	
	@Then("^Agregar el producto")
	public void Agregar_el_Producto() throws Throwable {
		
	}

}

	

