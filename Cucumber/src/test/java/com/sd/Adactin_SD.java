package com.sd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;
import com.helper2.File_Read_Man;
import com.manager.POManager;
import com.runner.Adactin_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_SD extends Base_Class {
	public static WebDriver driver = Adactin_Runner.driver;
	public static POManager pom = new POManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Read_Man.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	sendkeys(pom.getHp().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	sendkeys(pom.getHp().getPassword(), password);
	}

	@Then("^user Cllick On Login Button And It Navigate To Search Hotel Page$")
	public void user_Cllick_On_Login_Button_And_It_Navigate_To_Search_Hotel_Page() throws Throwable {
		click(pom.getHp().getLogin());
	}

	@When("^user Select The Location$")
	public void user_Select_The_Location() throws Throwable {
		String location = File_Read_Man.getInstanceFRM().getInstanceCR().getLocation();
		selectByValue(pom.getS().getLocation(), location);
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		String hotel = File_Read_Man.getInstanceFRM().getInstanceCR().getHotel();
		selectByValue(pom.getS().getHotel(), hotel);
	}

	@When("^user Select The Room Type$")
	public void user_Select_The_Room_Type() throws Throwable {
		String roomtype = File_Read_Man.getInstanceFRM().getInstanceCR().getRoomtype();
		selectByValue(pom.getS().getRoomtypes(), roomtype);
	}

	@When("^user Select The  Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		String rooms = File_Read_Man.getInstanceFRM().getInstanceCR().getRooms();
		selectByValue(pom.getS().getRooms(), rooms);
	}

	@When("^user Enter The CheckInDate$")
	public void user_Enter_The_CheckInDate() throws Throwable {
		String date1 = File_Read_Man.getInstanceFRM().getInstanceCR().getDate1();
		sendkeys(pom.getS().getDate1(), date1);
	}

	@When("^user Enter The CheckOutDate$")
	public void user_Enter_The_CheckOutDate() throws Throwable {
		String date2 = File_Read_Man.getInstanceFRM().getInstanceCR().getDate2();
		sendkeys(pom.getS().getDate2(), date2);
	}

	@When("^user Select Adults Per Room$")
	public void user_Select_Adults_Per_Room() throws Throwable {
		String adult = File_Read_Man.getInstanceFRM().getInstanceCR().getAdult();
		selectByValue(pom.getS().getAdult(), adult);
	}

	@When("^user Select The Childrens Per Room$")
	public void user_Select_The_Childrens_Per_Room() throws Throwable {
		String child = File_Read_Man.getInstanceFRM().getInstanceCR().getChild();
		selectByValue(pom.getS().getChild(), child);
	}

	@Then("^user Click To Search Button And It Navigate To Select Hotel Page$")
	public void user_Click_To_Search_Button_And_It_Navigate_To_Select_Hotel_Page() throws Throwable {
		click(pom.getS().getSearch());
	}

	@When("^user Select The Radio Button$")
	public void user_Select_The_Radio_Button() throws Throwable {
		click(pom.getSh().getAgree());
	}

	@Then("^user Click The Continue Button And It Navigate To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigate_To_Book_A_Hotel_Page() throws Throwable {
		click(pom.getSh().getContinue());
	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
		String fname = File_Read_Man.getInstanceFRM().getInstanceCR().getFname();
		sendkeys(pom.getBh().getFname(), fname);
	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
		String lname = File_Read_Man.getInstanceFRM().getInstanceCR().getLname();
		sendkeys(pom.getBh().getLname(), lname);
	}

	@When("^user Enter The BillingAddress$")
	public void user_Enter_The_BillingAddress() throws Throwable {
		String address = File_Read_Man.getInstanceFRM().getInstanceCR().getAddress();
		sendkeys(pom.getBh().getAdress(), address);
	}

	@When("^user Enter The Credit Card Number$")
	public void user_Enter_The_Credit_Card_Number() throws Throwable {
		String creditCard = File_Read_Man.getInstanceFRM().getInstanceCR().getCreditCard();
		sendkeys(pom.getBh().getCreditCard(), creditCard);
	}

	@When("^user Select The Credit Card Type$")
	public void user_Select_The_Credit_Card_Type() throws Throwable {
		String creditCardType = File_Read_Man.getInstanceFRM().getInstanceCR().getCreditCardType();
		selectByValue(pom.getBh().getCcType(), creditCardType);
	}

	@When("^user Select The Expiry Date On Select Month$")
	public void user_Select_The_Expiry_Date_On_Select_Month() throws Throwable {
		String expmonth = File_Read_Man.getInstanceFRM().getInstanceCR().getExpmonth();
		selectByValue(pom.getBh().getExpMonth(), expmonth);
	}

	@When("^user Select The Expiry Date On Select Year$")
	public void user_Select_The_Expiry_Date_On_Select_Year() throws Throwable {
		String expYear = File_Read_Man.getInstanceFRM().getInstanceCR().getExpYear();
		selectByValue(pom.getBh().getExpYear(), expYear);
	}

	@When("^user Enter The Cvv Number$")
	public void user_Enter_The_Cvv_Number() throws Throwable {
		String ccv = File_Read_Man.getInstanceFRM().getInstanceCR().getCCV();
		sendkeys(pom.getBh().getCcv(), ccv);
	}

	@Then("^user Click The Book Now Button And It Navigate To Hotel Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigate_To_Hotel_Booking_Confirmation_Page() throws Throwable {
		click(pom.getBh().getBooknow());

	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		explicitWait(10, pom.getF().getLogout());
		click(pom.getF().getLogout());
	}

}