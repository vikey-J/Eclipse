package com.testNG_Runner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base_Class.Base_Class;
import com.helper.File_Reder_Manager;
import com.helper2.File_Read_Man;
import com.manager.POManager;

public class Adactin_Runner extends Base_Class {
	public static WebDriver driver = getBrowser("chrome");
	public static POManager pom = new POManager(driver);
	public static Logger log = Logger.getLogger(Adactin_Runner.class);

	@Test(priority = -5)
	public void url_Launch() {
		implicitWait(10, TimeUnit.SECONDS);
		url("https://adactinhotelapp.com/");
		log.info("Url launched");
	}

	@Test(priority = -2)
	public void login() throws Throwable {
		implicitWait(10, TimeUnit.SECONDS);
		String username = File_Read_Man.getInstanceFRM().getInstanceCR().getUsername();
		sendkeys(pom.getHp().getUsername(), username);
		String password = File_Read_Man.getInstanceFRM().getInstanceCR().getPassword();
		sendkeys(pom.getHp().getPassword(), password);
		click(pom.getHp().getLogin());
		implicitWait(20, TimeUnit.SECONDS);
		log.info("Login successfull");
	}

	@Test(priority = 0)
	public void searchHotel() throws Throwable {
		implicitWait(30, TimeUnit.SECONDS);
		String location = File_Read_Man.getInstanceFRM().getInstanceCR().getLocation();
		selectByValue(pom.getS().getLocation(), location);
		String hotel = File_Read_Man.getInstanceFRM().getInstanceCR().getHotel();
		selectByValue(pom.getS().getHotel(), hotel);
		String roomType = File_Read_Man.getInstanceFRM().getInstanceCR().getRoomtype();
		selectByValue(pom.getS().getRoomtypes(), roomType);
		String rooms = File_Read_Man.getInstanceFRM().getInstanceCR().getRooms();
		selectByValue(pom.getS().getRooms(), rooms);
		String date1 = File_Read_Man.getInstanceFRM().getInstanceCR().getDate1();
		sendkeys(pom.getS().getDate1(), date1);
		String date2 = File_Read_Man.getInstanceFRM().getInstanceCR().getDate2();
		sendkeys(pom.getS().getDate2(), date2);
		String adult = File_Read_Man.getInstanceFRM().getInstanceCR().getAdult();
		selectByValue(pom.getS().getAdult(), adult);
		String child = File_Read_Man.getInstanceFRM().getInstanceCR().getChild();
		selectByValue(pom.getS().getChild(), child);
		click(pom.getS().getSearch());
		implicitWait(20, TimeUnit.SECONDS);
		log.info("Hotel serached successfully");
	}

	@Test(priority = 1)
	public void selectHotel() {
		implicitWait(20, TimeUnit.SECONDS);
		click(pom.getSh().getAgree());
		click(pom.getSh().getContinue());
		implicitWait(20, TimeUnit.SECONDS);
		log.info("Hotel selected successfully");
	}

	@Test(priority = 2)
	public void bookHotel() throws Throwable {
		implicitWait(20, TimeUnit.SECONDS);
		String fname = File_Read_Man.getInstanceFRM().getInstanceCR().getFname();
		sendkeys(pom.getBh().getFname(), fname);
		String lname = File_Read_Man.getInstanceFRM().getInstanceCR().getLname();
		sendkeys(pom.getBh().getLname(), lname);
		String address = File_Read_Man.getInstanceFRM().getInstanceCR().getAddress();
		sendkeys(pom.getBh().getAdress(), address);
		String creditCard = File_Read_Man.getInstanceFRM().getInstanceCR().getCreditCard();
		sendkeys(pom.getBh().getCreditCard(), creditCard);
		String creditCardType = File_Read_Man.getInstanceFRM().getInstanceCR().getCreditCardType();
		selectByValue(pom.getBh().getCcType(), creditCardType);
		String expmonth = File_Read_Man.getInstanceFRM().getInstanceCR().getExpmonth();
		selectByValue(pom.getBh().getExpMonth(), expmonth);
		String expYear = File_Read_Man.getInstanceFRM().getInstanceCR().getExpYear();
		selectByValue(pom.getBh().getExpYear(), expYear);
		String ccv = File_Read_Man.getInstanceFRM().getInstanceCR().getCCV();
		sendkeys(pom.getBh().getCcv(), ccv);
		click(pom.getBh().getBooknow());
		implicitWait(20, TimeUnit.SECONDS);
		log.info("Hotel Booked successfully");
	}

	@Test(priority = 3)
	public void logOut() {
		implicitWait(20, TimeUnit.SECONDS);
		click(pom.getF().getLogout());
		log.info("Logout successfully");
	}

	@Test(priority = 5)
	public void url_Close() {
		driver.close();
		log.info("Browser close successfully");
	}

}
