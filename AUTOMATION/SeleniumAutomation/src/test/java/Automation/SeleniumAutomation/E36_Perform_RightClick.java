package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36_Perform_RightClick {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//'Right click me' btn
		WebElement button = driver.findElement(By.xpath("//*[text()='right click me']"));	
		
		Actions act = new Actions(driver);
		//perform right click
		act.moveToElement(button).contextClick().build().perform();
		Thread.sleep(2000);
		
		//click on 'paste'
		driver.findElement(By.xpath("//*[text()='Paste']")).click();
		
		//to handle alert
		Alert alert = driver.switchTo().alert();
		System.out.println("ALert window message:  "+alert.getText());
		alert.accept();
		
		Thread.sleep(5000);
		driver.quit(); 
	}
}
