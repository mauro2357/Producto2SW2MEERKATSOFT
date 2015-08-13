package com.techandsolve.tuflujo.garantizacobros.gui;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class GUITestRunner {

	public static final WebDriver WEB_DRIVER = new ChromeDriver();
	
	@AfterClass
	public static void endTests(){
		WEB_DRIVER.close();
	}

}
