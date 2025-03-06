package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E30_JS_AlertHandling_ConfirmingResult {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 200)");
		
		//clicking on 'On button click, confirm box will appear' [Click me]
		WebElement confirmButton = driver.findElement(By.cssSelector("#confirmButton"));
		confirmButton.click();
		Thread.sleep(3000);
		
		//Handling JavaScript Alert
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		//to accept the alert
		alert.accept();
		
		System.out.println("Alert Message:  "+alertMessage);
		String textAfterConfirmingAlert = driver.findElement(By.cssSelector("#confirmResult")).getText();
		System.out.println("After confirming Alert confirmation message:  "+textAfterConfirmingAlert);
		
		//to dismiss the alert --> to click on 'Ok'
		confirmButton.click(); //clicking on 'On button click, confirm box will appear' [Click me]
		
		alert = driver.switchTo().alert();
		alertMessage = alert.getText();
		//to dismiss the alert --> to click on 'Cancel'
		alert.dismiss();
		
		System.out.println("Alert Message:  "+alertMessage);
		textAfterConfirmingAlert = driver.findElement(By.cssSelector("#confirmResult")).getText();
		System.out.println("After dismissing Alert confirmation message:  "+textAfterConfirmingAlert);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
