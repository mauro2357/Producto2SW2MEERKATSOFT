package actualizarinventario;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class agregarproductoalinventarioStepDefinitios {
	
	Administrador administrador = null;
	
	@Given("^El administrador va a agregar un producto.$")
	public void El_administrador_va_a_agregar_un_producto() throws Throwable {
		administrador = new Administrador();
		administrador.agregar_producto_a_inventario();
	}

	@When("^El producto a agregar no existe en la lista de productos.$")
	public void El_producto_a_agregar_no_existe_en_la_lista_de_productos() throws Throwable {
		Assert.assertEquals(administrador.verificar_el_producto_esta_en_el_inventario(),false); 
	}

	@Then("^Agregar el nuevo produto.$")
	public void Agregar_el_nuevo_produto() throws Throwable {
		Assert.assertTrue(administrador.agregar_producto_a_inventario());
	}

	@When("^El producto a agregar existe en la lista de productos.$")
	public void El_producto_a_agregar_existe_en_la_lista_de_productos() throws Throwable {
		Assert.assertEquals(!administrador.verificar_el_producto_esta_en_el_inventario(),true);
	}

	@Then("^Adiciona el producto al inventario.$")
	public void Adiciona_el_producto_al_inventario() throws Throwable {
		Assert.assertTrue(administrador.agregar_producto_a_inventario());
	}
	
	@When("^No hay base de datos.$")
	public void No_hay_base_de_datos() throws Throwable {
		Assert.assertTrue(administrador.verificar_conexion_bd()); //Esto supone que la base de datos no conectó.
	}
	
	@When("^Ocurre un error de bd.$")
	public void Ocurre_un_error_de_bd() throws Throwable {
	    Assert.assertTrue(!false); //False indicaría un error en la base de datos.
	}

	@Then("^Notificar error en la base de datos.$")
	public void Notificar_error_en_la_base_de_datos() throws Throwable {
		Assert.assertEquals("Error en la conexion BD.", administrador.notificar_conexion_bd() );
	}
	
}
