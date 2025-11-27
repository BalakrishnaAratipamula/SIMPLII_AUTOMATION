package POM_DesighPattern_Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//Locators
	private By userNameField = By.id("username");
	private By passwordField = By.id("password");
	private By loginButton = By.id("loginBtn");
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page Actions
	public void enterUserName(String usrName) {
		driver.findElement(userNameField).sendKeys(usrName);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(passwordField).sendKeys(pwd);
	}
	
	public DashboardPage clickLogin() {
		driver.findElement(loginButton).click();
		return new DashboardPage(driver);
	}
	
}
