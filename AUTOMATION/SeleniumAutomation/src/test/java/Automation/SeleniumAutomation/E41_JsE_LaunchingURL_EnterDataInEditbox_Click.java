package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41_JsE_LaunchingURL_EnterDataInEditbox_Click {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//to open URL
		jse.executeScript("window.location='https://login.salesforce.com/'");
		
		//to enter text in editbox
		jse.executeScript("window.document.getElementById('username').value='aaaaaaaaaaaaa'");
		
		//to click on [LogIn]
		WebElement loginBtnEle = driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", loginBtnEle);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
