package com.afterTestNG;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links{
	
	public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\my pc\\eclipse-workspace\\TestNG\\Chrome_Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		List<WebElement> all_Links = driver.findElements(By.tagName("(//a)"));
		for (WebElement url_link : all_Links) {
			String urllink = url_link.getAttribute("href");
			URL url=new URL(urllink);
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			if(con.getResponseCode()>400) {
				System.out.println("Broken Link");
			}
		}
	
	
	
}
}