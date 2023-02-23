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

		//Instead of creating constructor below method will use while maintaining 'TestScript' class as separate class
		//By initializing WebElement locator values from “object.repository”  package classes using “PageFactory” class
		RediffHomePg RHP = PageFactory.initElements(driver, RediffHomePg.class); //RediffHomePg.class---pageObject class
		RediffLoginPg RLP = PageFactory.initElements(driver, RediffLoginPg.class); //initElements()----once call this method all webElements will get initialized

		RHP.signinObj(driver).click();
		RLP.emailObj(driver).sendKeys("bhanu10205@gmail.com");
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