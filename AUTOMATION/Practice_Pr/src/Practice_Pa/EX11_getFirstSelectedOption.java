//create script to Select "Sept" in Month static dropdown in FB homepage, if already selected month is not the "Sep"
package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX11_getFirstSelectedOption {
public static void main(String[] args) throws Exception {
	//to initialize browser
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://facebook.com");
	driver.manage().window().maximize();
	
	Select a = new Select(driver.findElement(By.name("birthday_month")));
	
	String option = a.getFirstSelectedOption().getText();
	System.out.println("First selected option in the dd list is: "+option);
	if(option.equals("Aug")) {
		System.out.println("Aug month is alredy selected");
	}
	else {
		Thread.sleep(3000);
		a.selectByVisibleText("Aug");
		System.out.println("WD selected require month");
	}
}
}