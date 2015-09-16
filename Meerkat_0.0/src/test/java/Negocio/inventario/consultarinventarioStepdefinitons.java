package Negocio.inventario;

import java.util.ArrayList;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Negocio.inventario.Administrador;
import Negocio.pedido.Producto;
import Presentacion.InventarioFacade;

public class consultarinventarioStepdefinitons {
	
	Administrador administrador = null;
	ArrayList<Producto> lista = new ArrayList<Producto>();
	public  static InventarioFacade inventarioFacade= new InventarioFacade();
	
	@Given("^El administrador consulta los insumos que hay en el inventario.$")
	public void El_administrador_consulta_los_insumos_que_hay_en_el_inventario() throws Throwable {
		administrador = new Administrador();
		administrador.Consultar_inventario();
		lista = inventarioFacade.Consultar_insumos();
		
		
	}

	@When("^Hay productos en el inventario.$")
	public void Hay_productos_en_el_inventario() throws Throwable {
		Assert.assertTrue(lista.size()>0); 
	}
	
	@Then("^Mostrar la lista de insumos.$")
	public void Mostrar_la_lista_de_insumos() throws Throwable {
		Assert.assertTrue(lista.size()>0);
	}

}
