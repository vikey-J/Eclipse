package com.sd2;

import org.openqa.selenium.WebDriver;

import com.base_Class.Base_Class;
import com.helper.File_Reder_Manager;
import com.pomanager.Page_Object_Manager;
import com.runner.Automation_Runner;
import com.women_POManager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_SD extends Base_Class {
	public static WebDriver driver = Automation_Runner.driver;
	public static PageObjectManager pom=new PageObjectManager(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reder_Manager.getInstanceFRM().getInstanceCR().getUrl();
		url(url);
	}

	@Then("^user Click On Signin Button And It Navigate To My Store Page(\\d+)$")
	public void user_Click_On_Signin_Button_And_It_Navigate_To_My_Store_Page(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceSP().getLogin());
	}

	@When("^user Enter The Email Adress In  Email Address Field(\\d+)$")
	public void user_Enter_The_Email_Adress_In_Email_Address_Field(int arg1) throws Throwable {
	sendkeys(pom.getPOM1().getInstanceSP().getEmail(), "vikey12@gmail.com");
	}

	@When("^user Enter The Password In Password Field(\\d+)$")
	public void user_Enter_The_Password_In_Password_Field(int arg1) throws Throwable {
	sendkeys(pom.getPOM1().getInstanceSP().getPassword(), "vikey@123");
	}

	@Then("^user Click On Signin Button And It Navigate To My Account Page(\\d+)$")
	public void user_Click_On_Signin_Button_And_It_Navigate_To_My_Account_Page(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceSP().getSignin());
	}

	@When("^user Click on Women Button(\\d+)$")
	public void user_Click_on_Women_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceHP().getWomen());
	}

	@When("^user Click On Tops Button(\\d+)$")
	public void user_Click_On_Tops_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceHP().getTops());
	}

	@When("^user Click On TShirt Button$")
	public void user_Click_On_TShirt_Button() throws Throwable {
	click(pom.getPOM1().getInstanceHP().getTshirt());
	}

	@When("^user Move To Cursor On Instock Button And Click AddToCart Button(\\d+)$")
	public void user_Move_To_Cursor_On_Instock_Button_And_Click_AddToCart_Button(int arg1) throws Throwable {
	moveToElement(driver, pom.getPOM1().getInstanceATC().getInstock());
	click(pom.getPOM1().getInstanceATC().getAddtocart());
	}

	@When("^user Click On ProceedToCheckOut Button(\\d+)$")
	public void user_Click_On_ProceedToCheckOut_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceATC().getCheckout1());
	}

	@When("^user Enter Or Increse Quality In TextBox(\\d+)$")
	public void user_Enter_Or_Increse_Quality_In_TextBox(int arg1) throws Throwable {
	sendkeys(pom.getPOM1().getInstancePP().getNofproduct(), "4");
	}

	@When("^user Click On ProceedtoCheckOut Button(\\d+)$")
	public void user_Click_On_ProceedtoCheckOut_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstancePP().getCheckout2());
	}

	@When("^user Click On ProceedtoCheckout Button(\\d+)$")
	public void user_Click_On_ProceedtoCheckout_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceIC().getCheckout3());
	}

	@When("^user Select The CheckBox On Terms Of Service(\\d+)$")
	public void user_Select_The_CheckBox_On_Terms_Of_Service(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceCPI().getAgree());
	}

	@When("^user Click On ProceedToCheckout Button(\\d+)$")
	public void user_Click_On_ProceedToCheckout_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceCPI().getCheckout4());
	}

	@When("^user Click On Pay By Bank Wire Button(\\d+)$")
	public void user_Click_On_Pay_By_Bank_Wire_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceBP().getBank());
	}

	@When("^user Click On I Confirm My Order Button(\\d+)$")
	public void user_Click_On_I_Confirm_My_Order_Button(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceFP().getConfirm());
	}

	@Then("^user Click On Sign Out Button It Navigate To HomePage(\\d+)$")
	public void user_Click_On_Sign_Out_Button_It_Navigate_To_HomePage(int arg1) throws Throwable {
	click(pom.getPOM1().getInstanceSO().getSignOut());
	}

	@When("^user Click On Blouses Button$")
	public void user_Click_On_Blouses_Button() throws Throwable {
	click(pom.getPOM2().getInstanceHP().getBlouse());
	}

	@When("^user Click On Dresses Button(\\d+)$")
	public void user_Click_On_Dresses_Button(int arg1) throws Throwable {
    click(pom.getPOM3().getInstanceHP().getDress());	
	}

	@When("^user Click On Casual Dress Button$")
	public void user_Click_On_Casual_Dress_Button() throws Throwable {
	click(pom.getPOM3().getInstanceHP().getCasualDress());
	}

	@When("^user Click On Evening Dress Button$")
	public void user_Click_On_Evening_Dress_Button() throws Throwable {
	click(pom.getPOM4().getInstanceHP().getEveningDress());
	}

	@When("^user Click On Summer Dress Button$")
	public void user_Click_On_Summer_Dress_Button() throws Throwable {
	click(pom.getPOM5().getInstanceHP().getSummerDress());
	}



}
