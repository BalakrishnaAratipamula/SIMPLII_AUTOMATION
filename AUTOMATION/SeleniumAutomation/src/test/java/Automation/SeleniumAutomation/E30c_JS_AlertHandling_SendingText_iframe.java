package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class E30c_JS_AlertHandling_SendingText_iframe {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//switch into frame
		driver.switchTo().frame("iframeResult"); //id_value
		
		//click on 'Try it' btn
		driver.findElement(By.cssSelector("html>body>button")).click();
		
		//Handling JavaScript Alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		
		//Send text into Alert text box
		alert.sendKeys("Selenium WebDriver!");
		Thread.sleep(5000);
		alert.accept(); //click on Ok button
		
		WebElement actualPromptMessage = driver.findElement(By.cssSelector("#demo"));
		//Assertion
		Assert.assertEquals("Hello Selenium WebDriver!! How are you today?", actualPromptMessage.getText());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
