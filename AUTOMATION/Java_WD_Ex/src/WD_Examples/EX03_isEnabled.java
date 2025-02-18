//write script to click on "Sign Up" button in FB-Home page if that object is enabled and also read visibletext and name attribute values of that element
package WD_Examples;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EX03_isEnabled {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		//to create reference object for "Sign Up" button
		WebElement ele = driver.findElement(By.xpath("//a[text()='Create new account']"));

		//to read visibleText
		String str1 = ele.getText();
		//to print read visibleText
		System.out.println("object VisibleText is: "+str1);

		//to click on Sign-up
		if(ele.isEnabled()) {   //(or) refobj.isEnabled() //if(ele.isEnabled()==true)
			//to click on 'Create New Account'
			ele.click();
			System.out.println("Object is enabled");
		}
		else {
			System.out.println("Object is disabled");
		}
		Thread.sleep(2500);

		driver.quit(); 
	}
}
