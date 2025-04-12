package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//E-Mail Address
	@FindBy(id="input-email")
	WebElement txtEmailAddress;
	
	//Password
	@FindBy(id = "input-password")
	WebElement txtPasswordLoginPage;
	
	//[Login]
	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmailLogin(String emailLogin) {
		txtEmailAddress.sendKeys(emailLogin);
	}
	
	public void setPasswordLogin(String pwdLogin) {
		txtPasswordLoginPage.sendKeys(pwdLogin);
	}

	public void clickLoginBtn() {
		btnLogin.click();
	}
}
