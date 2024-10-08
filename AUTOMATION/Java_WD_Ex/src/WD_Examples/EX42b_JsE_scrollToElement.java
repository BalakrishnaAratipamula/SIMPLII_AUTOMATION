package WD_Examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EX42b_JsE_scrollToElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://file-examples.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000); 

		//imperfect 
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Other files']/following-sibling::a")); 
/*		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		 */
		
		//perfect
		new Actions(driver).scrollToElement(ele).perform();
		Thread.sleep(2000);
		
		driver.quit();
	}
}
