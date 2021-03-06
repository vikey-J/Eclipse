package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base_Class.Base_Class;
import com.helper2.File_Read_Man;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature_File\\Adactin.feature",
	glue ="com.sd",
	monochrome = true,
	dryRun = false,
    strict = true,
	plugin = { "html:Report/Html_Report","pretty",
			"json:Reports/JsonReport.json",
//			"com.cucumber.listener.ExtendsCucumberFormatter:ExtendsReport/Report.exe"
		})
		
public class Adactin_Runner{
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up()   {
		driver = Base_Class.getBrowser("chrome");
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
	
	
}