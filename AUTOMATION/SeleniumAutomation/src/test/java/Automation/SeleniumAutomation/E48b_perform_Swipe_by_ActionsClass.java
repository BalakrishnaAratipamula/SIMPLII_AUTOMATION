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

public class E48b_perform_Swipe_by_ActionsClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://example.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//'username' editbox
		WebElement ele = driver.findElement(By.id("SwipeTarget")); //SwipeTarget - dummy value
		
		//to perform series of Actions on 'UserName' editbox
		Actions actions = new Actions(driver);
		actions.clickAndHold(ele)
			.moveByOffset(200, 0)
			.release()
			.perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
