package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	//identification part
	//'My Account' text or 'Your Account Has Been Created!' text
	@FindBy(xpath = "//*[@id='content']/h2[text()='My Account'] | //div[@id='content']/h1[text()='Your Account Has Been Created!']")
	WebElement myAccountTextOrYourAccountHasBeenCreated;
	
	//Logout
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	//declaration part
	public boolean isMyAccountTextOrYourAccountHasBeenCreatedTextExists() {
		try {
			return (myAccountTextOrYourAccountHasBeenCreated.isDisplayed());
		} catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogout() {
		lnkLogout.click();
	}
}
