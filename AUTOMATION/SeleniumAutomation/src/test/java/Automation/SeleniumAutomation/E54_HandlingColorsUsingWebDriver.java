package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class E54_HandlingColorsUsingWebDriver {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Find button
		WebElement ele = driver.findElement(By.xpath("//*[@class='container']/input"));
		//to get clor in 'rgba' 
		String rgbBackgroungColor = ele.getCssValue("background-color");
		System.out.println("RGB Value is:  "+rgbBackgroungColor);
		
		//convert rgba to Hex code
		String hexBackgroundColor = Color.fromString(rgbBackgroungColor).asHex();
		System.out.println("Hex value is:  "+hexBackgroundColor);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
