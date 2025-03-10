package WD_Examples;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Syanchronization_options {
public static void main(String[] args) throws InterruptedException {
		//to Initialize browser
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);

		WebDriver driver= new ChromeDriver();
		
		//-------------------pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.apsrtconline.in/oprs-web/");
		driver.manage().window().maximize();
		
		//------------------ImplicitlyWait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		//to enter "NLR"
		driver.findElement(By.name("source")).sendKeys("NLR");
		//to pause Execution
		Thread.sleep(3000);
		
		//------------------ExplicitWait
		//to pause execution based on "KOVUR-NLR" WebElement availability
		Wait<WebDriver> wt = new WebDriverWait(driver, 100);//don't need to mention seconds or minutes or hours
		wt.until(ExpectedConditions.presenceOfElementLocated(By.linkText("KOVUR-NLR")));
		
		driver.findElement(By.linkText("KOVUR-NLR")).click();
		
		//------------------FluentWait
		@SuppressWarnings("deprecation")
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		        .withTimeout(30, TimeUnit.SECONDS)
		        .pollingEvery(5, TimeUnit.SECONDS)
		        .ignoring(NoSuchElementException.class);
		WebElement ele = wait.until(new Function<WebDriver, WebElement>(){
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("destination"));
			}
			
		});
		
		
		//Fluent wait - Latest - https://www.scaler.com/topics/selenium-tutorial/fluent-wait-in-selenium/
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30))
			    .pollingEvery(Duration.ofSeconds(5))
			    .ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("myElement")));

			

		Thread.sleep(2000);
		driver.findElement(By.name("destination")).sendKeys("AAAAAAAAA");
		Thread.sleep(3000);
		
		driver.quit();
}
}
