package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	RemoteWebDriver driver;	//RemoteWebDriver is using for docker execution. It works as normal WebDriver so no need to change for normal execution. suppose if u want to replace replace in all classes 

	public BasePage(RemoteWebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
