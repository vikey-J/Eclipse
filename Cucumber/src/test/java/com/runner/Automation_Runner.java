package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\my pc\\eclipse-workspace\\Cucumber\\src\\test\\java\\com\\feature_File\\Automation.feature")
//                glue = "com.sd2")

public class Automation_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver = Base_Class.getBrowser("chrome");
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
		
	}

}
