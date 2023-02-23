package POM_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import POM_objectRepository.RediffHomePg;
import POM_objectRepository.RediffLoginPg;

public class RediffLoginvalidation {
public static void main(String[] args) throws Exception {
	
	//to initialize browser
	System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.navigate().to("http://rediffmail.com");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//to initialize WebElement Locator value classes from "objRepository" package
	//use PageFactory to initialize WebElements which are defind in pageObjects
	RediffHomePg RHP= PageFactory.initElements(driver, RediffHomePg.class); //RediffHomePg.class---pageObject class
	RediffLoginPg RLP = PageFactory.initElements(driver, RediffLoginPg.class);//initElements()----once call this method all webElements will get initialized
	
	RHP.signinObj(driver).click();
	RLP.emailObj().sendKeys("bhanu10205@gmail.com");
	RLP.pwdObj().sendKeys("Balakrishna");
	RLP.goObj().click();
	
	Thread.sleep(3000);
		
	String pgTitle= driver.getTitle();
	if (pgTitle.contains("Rediffmail")){
		System.out.println("Successful login operation");
	}
	else{
		System.out.println("Unsuccessful login operation");
		}
		
}
}