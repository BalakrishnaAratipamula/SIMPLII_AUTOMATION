package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36c_ClickAndHold {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testkru.com/Interactions/DragAndDrop");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//click on 'Box 1'
		WebElement ele = driver.findElement(By.id("box1"));	
		
		System.out.println("Element Text Before holding:  "+ele.getText());
		//Creating obj to ACtions class
		Actions act = new Actions(driver);
		//perform click and hold
		act.clickAndHold(ele).pause(1000).perform();
		Thread.sleep(2000);
		
		System.out.println("Element Text After holding:  "+ele.getText());
		Thread.sleep(5000);
		driver.quit(); 
	}
}
