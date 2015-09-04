package Negocio.actualizarinventario;

import java.util.ArrayList;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Negocio.actualizarinventario.Administrador;
import Negocio.tomaynotificacionpedidos.Producto;
import Presentacion.consultarinventarioFacade;

public class consultarinventarioStepdefinitons {
	
	Administrador administrador = null;
	ArrayList<Producto> lista = new ArrayList<Producto>();
	public  static consultarinventarioFacade inventarioFacade= new consultarinventarioFacade();
	
	@Given("^El administrador consulta los insumos que hay en el inventario.$")
	public void El_administrador_consulta_los_insumos_que_hay_en_el_inventario() throws Throwable {
		administrador = new Administrador();
		administrador.consultar_inventario();
		lista = inventarioFacade.main();
		
		
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
