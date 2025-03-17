package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41e_JsE_FlashAnElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Images link
		WebElement ele = driver.findElement(By.linkText("Images"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.backgroundColor = 'Yellow'", ele);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].style.backgroundColor = 'Green'", ele);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].style.backgroundColor = 'Red'", ele);
		Thread.sleep(3000);
		jse.executeScript("arguments[0].style.backgroundColor = ''", ele);
		
		Thread.sleep(6000);
		driver.quit();
	}
}
