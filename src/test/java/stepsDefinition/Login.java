package stepsDefinition;

import java.util.List;

import org.testng.Assert;

import Capability.CapabilityBase;
import POM.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login extends CapabilityBase {
	
	BaseClass baseClass = new BaseClass();
	Pages.Login login = new Pages.Login();
	@Given("^I am on login page$")
	public void  I_am_on_login_page() {
		System.out.println("I am on login page");
		baseClass.get("https://webdriveruniversity.com/Login-Portal/index.html");
		
	}
	
	@When("^Enter username and password$")
	public void  Enter_username_and_password() {
		System.out.println("Enter username and password");
		login.login(testData.get("username"),testData.get("password"));
	}
	
	@And("^Click on submit button$")
	public void  Click_on_submit_button() {
		System.out.println("Click on submit button");
		//login.Submit();
	}
	
	@Then("^verify Homepage title$")
	public void verify_Homepage_title() {
		System.out.println("verify Homepage title");
	Assert.assertEquals(driver.getTitle(),"WebDriver | Login Portal");
	}

	@When("Enter username {string} and password {string}")
	public void enter_username_and_password(String username, String password) {
	    System.out.println(username);
	    System.out.println(password);
	    
	    login.login(username,password);
	}

	@When("^Enter the username (.+) and password (.+)$")
	public void enter_the_username_user1_and_password_user1(String username, String password) {
		System.out.println(username);
	    System.out.println(password);
	    
	    login.login(username,password);
	}
	
	@When("Enter the username and password")
	public void enter_the_username_and_password(DataTable dataTable) {
		
		List<List<String>> data = dataTable.asLists();
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(0).get(1));
	   
	}

	@When("Initialize Selenium Webdriver")
	public void initialize_selenium_webdriver() {
		System.out.println("Initialize Selenium Webdriver");

	}
	@Then("Open the browser")
	public void open_the_browser() {
		System.out.println("Open the browser");

	}








}
