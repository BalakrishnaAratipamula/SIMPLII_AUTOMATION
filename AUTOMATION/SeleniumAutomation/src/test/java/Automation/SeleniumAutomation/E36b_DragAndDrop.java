package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E36b_DragAndDrop {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		//below elements inside the frame so i want to switch into the frame
		driver.switchTo().frame(0); //index
		
		// source element
		WebElement source = driver.findElement(By.id("draggable"));
		// target element
		WebElement target = driver.findElement(By.id("droppable"));
		// target text element
		WebElement targetTextEle = driver.findElement(By.cssSelector("#droppable>p"));
		
		System.out.println("Before performing DrangAndDrop 'Target text' is:  "+targetTextEle.getText());
		//Creating object for Actions class
		Actions act = new Actions(driver);
		//perform drag and drop
		act.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		
		System.out.println("After performing DrangAndDrop 'Target text' is:  "+targetTextEle.getText());
		
		Thread.sleep(5000);
		driver.quit();
	}
}
