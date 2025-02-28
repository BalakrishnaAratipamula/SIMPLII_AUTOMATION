package WD_Examples;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX11a_MultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://trytestingthis.netlify.app/"); //https://accounts.google.com/
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300)"); 
		Thread.sleep(5000); 
		
		WebElement ele = driver.findElement(By.xpath("//select[@name='Optionwithcheck[]']"));
		
		Select sc = new Select(ele);
		System.out.println("isMultiple():  "+sc.isMultiple());
		
		sc.selectByVisibleText("Option");
		sc.selectByVisibleText("Option 2");
		sc.selectByVisibleText("Option 3");
		Thread.sleep(2000);
		sc.deselectByValue("option 2");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
