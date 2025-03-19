package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class E48_PerformSeriesOfActions {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//'username' editbox
		WebElement ele = driver.findElement(By.id("username"));
		
		//to perform series of Actions on 'UserName' editbox
		Actions actions = new Actions(driver);
		Action seriesOfActions = actions
				.moveToElement(ele)
				.click(ele)
				.keyDown(ele, Keys.SHIFT) //keypress
				.sendKeys("abcxyz")
				.keyUp(ele, Keys.SHIFT) //keyrelease
				.doubleClick()	//ctrl+a (select text in editbox)
				.contextClick()	//Right click
				.build();
		seriesOfActions.perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
