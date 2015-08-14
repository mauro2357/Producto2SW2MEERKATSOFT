package com.techandsolve.tuflujo.garantizacobros.gui;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.techandsolve.tuflujo.EntryPoint;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PresupuestoFacturasGUIStepDefinitions {
	
	static {
		String valorDriver = System.getProperty("webdriver.chrome.driver");
		if (valorDriver == null) {
			System.setProperty("webdriver.chrome.driver",
					"drivers/chromedriver.exe");
		}
	}
	
	EntryPoint entryPoint=new EntryPoint();
	
	@Before
	public void setUp() throws Exception{
		entryPoint.inicializarAplicacion();
	}
	
	@When("^El director de proyectos acceda a la aplicacion e ingrese a la pantalla de presupuesto de facturacion$")
	public void El_director_de_proyectos_acceda_a_la_aplicacion_e_ingrese_a_la_pantalla_de_presupuesto_de_facturacion() throws Throwable {
		GUITestRunner.WEB_DRIVER.get("http://localhost:8080/presupuestoFacturacion");
	}
	
	@Then("^Se debe visualizar la pantalla para ingresar los datos del presupuesto$")
	public void Se_debe_visualizar_la_pantalla_para_ingresar_los_datos_del_presupuesto() throws Throwable {
		WebElement campoBienvenida = GUITestRunner.WEB_DRIVER.findElement(By.id("bienvenida"));
		assertNotNull(campoBienvenida);
	}
	
	@After
	public void endtest() throws Exception{
		entryPoint.stopServer();
	}

}
