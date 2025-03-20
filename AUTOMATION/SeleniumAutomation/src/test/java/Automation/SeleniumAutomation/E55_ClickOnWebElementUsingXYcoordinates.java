package Automation.SeleniumAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E55_ClickOnWebElementUsingXYcoordinates {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Gmail link
		WebElement ele = driver.findElement(By.xpath("//*[text()='Gmail']"));
		
		//to get element coordinates
		int xCord = ele.getLocation().getX();
		int yCord = ele.getLocation().getY();
		
		System.out.println("X cord:  "+xCord+" Y cord:  "+yCord);
		
		//to click on WebElement using Actions class
		Actions act = new Actions(driver);
		act.moveByOffset(xCord, yCord).click().perform();
		
		System.out.println("Window Page Title:  "+driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	}
}
