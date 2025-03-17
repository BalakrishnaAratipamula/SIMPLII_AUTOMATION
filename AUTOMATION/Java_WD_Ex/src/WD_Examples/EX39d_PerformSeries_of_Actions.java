package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EX39d_PerformSeries_of_Actions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Username Edit box
		WebElement ele = driver.findElement(By.id("username"));

		// Perform series of Actions on 'Username' editbox
		Actions actions = new Actions(driver);
		Action seriesOfActions = actions
					   .moveToElement(ele)
					   .click(ele)
					   .keyDown(ele, Keys.SHIFT)
					   .sendKeys("abcdef")
					   .keyUp(ele, Keys.SHIFT)
					   .doubleClick()
					   .contextClick()
					   .build();
		seriesOfActions.perform();
		
		System.out.println("----Done----");
		Thread.sleep(6000);
		driver.quit();
	}
}
