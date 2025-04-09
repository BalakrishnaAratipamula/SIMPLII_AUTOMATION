package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	
	//constructor to initialize the driver object of WebDriver
	public BasePage(WebDriver driver) {
		this.driver=driver;
		
		//Initialize by using 'PageFactory'
		PageFactory.initElements(driver, this);
	}
}
