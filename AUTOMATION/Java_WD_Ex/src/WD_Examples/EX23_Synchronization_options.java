package WD_Examples;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class EX23_Synchronization_options {

	public static void main(String[] args) throws Exception {
		// to Initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// -------------------pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
		driver.navigate().to("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();

		// ------------------ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // Deprecated in Selenium 3

		///////////////////////////////////////////////// finding element and check state
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1)); // Bcz of Deprecation we use this cmd
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='right click me']")));
		//---------(OR)
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='right click me']")));
		//take action and record result
		Assert.assertTrue(element.isDisplayed());
		
		// to enter "NLR"
		driver.findElement(By.name("source")).sendKeys("NLR");
		// to pause Execution
		Thread.sleep(3000);

		// ------------------ExplicitWait
		// to pause execution based on "KOVUR-NLR" WebElement availability
		Wait<WebDriver> wt = new WebDriverWait(driver, Duration.ofSeconds(6)); // don't need to mention seconds or minutes or hours
		wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("KOVUR-NLR")));

		driver.findElement(By.linkText("KOVUR-NLR")).click();

		/*//Deprecated FluentWait
		 * FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		 * .withTimeout(30, TimeUnit.SECONDS) .pollingEvery(5, TimeUnit.SECONDS)
		 * .ignoring(NoSuchElementException.class); WebElement ele = wait.until(new
		 * Function<WebDriver, WebElement>(){
		 * 
		 * public WebElement apply(WebDriver driver ) { return
		 * driver.findElement(By.name("destination")); }
		 * 
		 * });
		 */
		
		// ------------------FluentWait
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name("destination")));

		driver.quit();

	}
}
