package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;
	
	public LoginPage(WebDriver driver) { 
		this.driver = driver;
	}
	
	
	//WEBELEMENTS
	@FindBy (how = How.XPATH,using ="//input[@id='username']") 
	WebElement USERNAME_ELEMENT;
	@FindBy (how = How.XPATH,using ="//input[@id='password']") 
	WebElement PASSWORD_ELEMENT;
	@FindBy (how = How.XPATH,using ="//button[@name='login' and @type='submit']")
	WebElement SIGNIN_BUTTON_ELEMENT;
	
	
	//INTRACTABLE METHODS
	public void insertUserName(String username)  {
	USERNAME_ELEMENT.sendKeys(username);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void insertPassword(String password){
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void clicksigninbutton() {
		SIGNIN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void loginIn(String UserName,String Password) {
		USERNAME_ELEMENT.sendKeys(UserName);
		PASSWORD_ELEMENT.sendKeys(Password );
		SIGNIN_BUTTON_ELEMENT.click();
	}
public String getPageTitle() {
	return driver.getTitle();
	
}

}
