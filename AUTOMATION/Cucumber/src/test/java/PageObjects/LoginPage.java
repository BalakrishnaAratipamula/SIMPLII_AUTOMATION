package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver gdriver;
	
	//constructor to initiate driver, WebElemnts ----- initialization
	public LoginPage(WebDriver ldriver) { //constructor doesn't come void
		this.gdriver=ldriver; //(or) ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	//identifying WebElements ---- declaration
	@FindBy(id="Email")
	WebElement txtEmail;

	@FindBy(id="Password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	WebElement btnLogin;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement btnLogout;
	
	
	//action methods to above identified elements
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setUserPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() throws InterruptedException {
		btnLogin.click();
		Thread.sleep(3000);
	}
	
	public void clickLogout() {
		btnLogout.click();
	}
	
}