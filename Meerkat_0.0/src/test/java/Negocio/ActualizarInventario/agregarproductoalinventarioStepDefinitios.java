package Negocio.ActualizarInventario;

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
	
	@Given("^El administrador va a agregar un producto.$")
	public void El_administrador_va_a_agregar_un_producto() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^El producto a agregar no existe en la lista de productos.$")
	public void El_producto_a_agregar_no_existe_en_la_lista_de_productos() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Agregar el nuevo produto.$")
	public void Agregar_el_nuevo_produto() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^El producto a agregar existe en la lista de productos.$")
	public void El_producto_a_agregar_existe_en_la_lista_de_productos() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Adiciona el producto al inventario.$")
	public void Adiciona_el_producto_al_inventario() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^No hay base de datos.$")
	public void No_hay_base_de_datos() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^Notificar error en la base de datos.$")
	public void Notificar_error_en_la_base_de_datos() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^Ocurre un error de bd.$")
	public void Ocurre_un_error_de_bd() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}

	

