package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EX60_getCssValue {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://ultimateqa.com/simple-html-elements-for-automation");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.linkText("Click me using this link text!"));
		
		String str = ele.getAttribute("href");
		
		Assert.assertEquals("https://ultimateqa.com/link-success/", str);
		Assert.assertEquals("padding-box", ele.getCssValue("background-origin"));
	
		driver.quit();
	}
}
