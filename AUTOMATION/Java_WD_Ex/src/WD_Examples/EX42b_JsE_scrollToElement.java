package WD_Examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class EX42b_JsE_scrollToElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://file-examples.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		//'other files' element
		WebElement ele = driver.findElement(By.xpath("//h3[text()='Other files']/following-sibling::a")); 
		
		//Scroll To Element 
		//perfectly working - using JsE 
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		
		//perfect working - using Actions class
//		new Actions(driver).scrollToElement(ele).perform();
		
		Thread.sleep(2000);
//		driver.quit();
	}
}
