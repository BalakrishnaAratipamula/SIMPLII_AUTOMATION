package Automation.SeleniumAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E12_Print_DropDownList_Options {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		
		By yearDD = By.name("birthday_year");
		
		// applying Explicit Wait to wait for 'YearDD' element
		Wait<WebDriver> wt = new WebDriverWait(driver, Duration.ofSeconds(30));
		wt.until(ExpectedConditions.presenceOfElementLocated(yearDD)); 
				
		driver.findElement(yearDD).click();
		Thread.sleep(3000);
		
		Select sc = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		//to get all dd options
		List<WebElement> options = sc.getOptions();
		//to print all options
		for(WebElement option : options) {
			String optionText = option.getText();
			System.out.println(optionText);
		}
		
		Thread.sleep(3000);
		driver.quit();
	}
	
}
