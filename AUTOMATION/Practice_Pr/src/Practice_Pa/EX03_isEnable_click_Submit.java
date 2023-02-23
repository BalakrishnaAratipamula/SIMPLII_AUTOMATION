//write script to click on "Sign Up" button in FB-Home page if that object is enabled and also**** read visibletext and name attribute values*****of that element
package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX03_isEnable_click_Submit {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://facebook.com");
	driver.manage().window().maximize();
	
	WebElement refObj = driver.findElement(By.name("websubmit"));
	//to read visibleText
	String a = refObj.getText();
	//to print read visibleText
	System.out.println("objact VisibleText is: "+a);
	
	//to read attributevalue
	String b = refObj.getAttribute("name");//above qun asked to retrive name attribute value//"name" or "class" or "id".............
	//to print read attributevalue
	System.out.println("object name attribute value is: "+b);
	
	//to click on [Signup]
	if(refObj.isEnabled()) {
		System.out.println("[SignUp] isEnabled");
		refObj.click();
	}
	else {
		System.out.println("[SignUp] is not Enabled");
	}
		
}
}
