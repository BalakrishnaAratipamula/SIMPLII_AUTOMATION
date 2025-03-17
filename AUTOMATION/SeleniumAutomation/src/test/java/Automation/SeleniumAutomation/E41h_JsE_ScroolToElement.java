package Automation.SeleniumAutomation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E41h_JsE_ScroolToElement {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://file-examples.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		//Other files [Browser] 
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Other files']//following-sibling::a"));
		
		/*/1. ScrollTo Element using 'JsE'
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele); //*/
		
		// ScrollTo Element using 'Actions Class'
		new Actions(driver).scrollToElement(ele).perform();
		
		Thread.sleep(6000);
		driver.quit();
	}
}
