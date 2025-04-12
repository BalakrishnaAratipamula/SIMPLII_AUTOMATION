package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//'My Account' tab
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyAccountTab;
	
	//Register
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	//Login
	@FindBy(linkText = "Login")
	WebElement lnkLogin;
	
	public void clickMyAccountTab() {
		lnkMyAccountTab.click();
	}
	
	public void clickRegister() {
		lnkRegister.click();
	}
	
	public void clickLogin() {
		lnkLogin.click();
	}
}
