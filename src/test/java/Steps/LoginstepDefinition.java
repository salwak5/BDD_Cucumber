package Steps;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import Pages.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginstepDefinition extends TestBase {
	//Given User is on TechFios Login page
	LoginPage loginpage; //= PageFactory.initElements(driver, LoginPage.class);
	@Before
	public void beforeRun() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
	}
	
	@Given ("^User is on TechFios Login page$")
	public void user_is_on_techFios_loginpage() {
		
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		
		
		
	}
	//When User eneters username as "demo@techfios.com"
	@When ("^User eneters username as \"([^\"]*)\"$")
	public void user_eneters_username_as(String username) {
		//loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName(username);
		
	}
	@When("^User eneters password as \"([^\"]*)\"$")
	public void user_eneters_password_as(String password)  {
		loginpage.insertPassword(password);
	   
	}

	@When("^User clicks signin button$")
	public void user_clicks_signin_button()  {
		loginpage.clicksigninbutton();
	   
	}
	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws IOException  {
		Assert.assertEquals("Dashboard- iBilling", loginpage.getPageTitle());
		takeScreenshot(driver);
		
	    
	}
	@When("^User eneters \"([^\"]*)\" from database;$")
	public void user_eneters_from_database(String logindata) {
		//if(logindata.equalsIgnoreCase("username")) {
		
		//}else if(logindata.equalsIgnoreCase("password")) {
			
		//}else {
			//System.out.println("unable to extract login data" + logindata + "from DB");
		//}
		switch(logindata) {
		case "username" :
			loginpage.insertUserName("demo@techfios.com");
			System.out.println("username from DB: ");
			break;
	
		case "password":
			loginpage.insertPassword("abc123");
			System.out.println("password from DB: ");
			break;
			default:
				System.out.println("unable to extract login data" + logindata + "from DB");
		}
	    
	    
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

	
	
	

}
