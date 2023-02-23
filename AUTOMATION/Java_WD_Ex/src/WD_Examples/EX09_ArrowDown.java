//Write script to select "KOVUR-NLR" in "From" dropdown in APSRTC online application
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX09_ArrowDown {
	public static void main(String[] args) throws Exception {
		//to Initialize browser
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();

		//create reference object for "From" dropdown
		WebElement fromList = driver.findElement(By.name("source"));
		//to enter "NLR" in "From" dropdown
		fromList.sendKeys("NLR");

		//to pause
		Thread.sleep(5000);
		//to select value using linkText
		//driver.findElement(By.linkText("KOVUR-NLR")).click();
		//to press Down-arrow
		fromList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		fromList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		fromList.sendKeys(Keys.ENTER);
		
		driver.quit();
	}
}
