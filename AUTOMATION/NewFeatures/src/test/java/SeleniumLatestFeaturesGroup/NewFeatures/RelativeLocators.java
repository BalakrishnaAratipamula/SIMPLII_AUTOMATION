package SeleniumLatestFeaturesGroup.NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
	public static void main(String args[]) throws InterruptedException {
		//to Initialize browser
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		driver.navigate().to("");	//ADD
		driver.manage().window().maximize();
		

		// Find an element above, below, toLeftOf, toRightOf, near, chaining the reference element
		By emailLocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		By passwordLocator = RelativeLocator.with(By.tagName("input")).below(By.id("email"));
		By cancelLocator = RelativeLocator.with(By.tagName("button")).toLeftOf(By.id("submit"));
		By submitLocator = RelativeLocator.with(By.tagName("button")).toRightOf(By.id("cancel"));
		By emailLocator2 = RelativeLocator.with(By.tagName("input")).near(By.id("lbl-email"));
		By chaining = RelativeLocator.with(By.tagName("button")).below(By.id("email")).toRightOf(By.id("cancel"));
		
		WebElement element1 = driver.findElement(emailLocator);
		
		//			(OR)		\\
		WebElement element1a = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("password")));
		element1.sendKeys("XYZ");
		
		


	}

}
