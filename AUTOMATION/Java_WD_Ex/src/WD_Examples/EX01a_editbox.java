//write script to enter "Live" in "user name" edit box after that to enter "Tech" in same editbox at Sales force Login page
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX01a_editbox {
	public static void main(String[] args) throws Exception {
		//to initialize browser
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://login.salesforce.com");
		driver.manage().window().maximize();

		//to enter "Live" in Username edit box
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("Live");
		Thread.sleep(3000);
		uname.sendKeys("********");
		Thread.sleep(3000);
		uname.sendKeys("Tech");
		Thread.sleep(1500);

		driver.quit();
	}
}