// write program to verify entered value is displayed in Email edit box same as entered value in FB-home page
package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX02_Print_entered_value_in_Editbox {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	
	String a = "smith";
	WebElement edit1 = driver.findElement(By.name("email"));
	edit1.sendKeys("bhanu");
	edit1.clear();
	edit1.sendKeys(a);
	String b = edit1.getAttribute("value");
	System.out.println("enetrd value in edit box is: "+b);
	if(b.equals(a)) {
		System.out.println("Expected value displayed");
	}
	else {
		System.out.println("Expected value displayed");
	}
}
}
