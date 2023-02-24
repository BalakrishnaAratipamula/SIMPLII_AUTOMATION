package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		this.ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[1]/ul/li")
	WebElement notvalide;
	
	@FindBy(id = "Email")
	WebElement  email;
	
	@FindBy(id = "Password")
	WebElement  password;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement  loginbtn;
	
	@FindBy(xpath = "/html/body/div[3]/nav/div/ul/li[3]/a")
	WebElement  logoutbtn;
	
	public String notvalidinfo() {
		return notvalide.getText();
	}
	
	public void setUsername(String name) {
		email.clear();
		email.sendKeys(name);
	}
	
	public void setPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickLogin() {
loginbtn.click();
}
	public void clickLogout() {
		logoutbtn.click();
		}
	
	
	
}
