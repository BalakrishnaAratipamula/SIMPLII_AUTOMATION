package POM_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POM_objectRepository.RediffHomePg;
import POM_objectRepository.RediffLoginPg;

public class RediffLoginvalidation {
	public static void main(String[] args) throws Exception {

		//to initialize browser
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://rediffmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);

		//Instead of creating constructor below method will use while maintaining 'TestScript' class as separate class
		//By initializing WebElement locator values from �object.repository�  package classes using �PageFactory� class
		RediffHomePg RHP = PageFactory.initElements(driver, RediffHomePg.class); //RediffHomePg.class---pageObject class
		RediffLoginPg RLP = PageFactory.initElements(driver, RediffLoginPg.class); //initElements()----once call this method all webElements will get initialized

		RHP.signinObj(driver).click();
		RLP.emailObj(driver).sendKeys("bhanu10205");
		RLP.pwdObj().sendKeys("Sr786bhanu786#");
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