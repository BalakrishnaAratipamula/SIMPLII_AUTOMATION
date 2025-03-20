package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class E56_GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ultimateqa.com/simple-html-elements-for-automation");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//'Click me using this link text!' link
		WebElement ele = driver.findElement(By.linkText("Click me using this link text!"));
		
		String str = ele.getAttribute("href");
		
		Assert.assertEquals("https://ultimateqa.com/link-success/", str);
		Assert.assertEquals("padding-box", ele.getCssValue("background-origin"));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
