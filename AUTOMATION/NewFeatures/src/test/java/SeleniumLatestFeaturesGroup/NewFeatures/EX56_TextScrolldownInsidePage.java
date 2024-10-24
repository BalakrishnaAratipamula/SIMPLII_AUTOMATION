package SeleniumLatestFeaturesGroup.NewFeatures;

	
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EX56_TextScrolldownInsidePage {

	public static void main(String[] args) throws Throwable {
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");

			// System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSE\\Java\\Drivers\\chromedriver.exe");
			final WebDriver driver = new ChromeDriver(opt);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,650)", "");
			WebElement parent = driver.findElement(By.xpath("//div/table[@id='product']"));

			List<WebElement> trs = parent.findElements(By.xpath("//div/table[@id='product']/tbody/tr"));
			System.out.println("total no of tr tags: " + trs.size());
			Thread.sleep(10000);
			
			WebElement ele = driver.findElement(By.xpath("//*[@id='product']/tbody/tr[9]/td[text()='Delhi']"));
			Actions action = new Actions(driver);
			action.scrollToElement(ele).perform();
	        Thread.sleep(5000);
	        js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(5000);
			
			////////////////////////  Selenium 4 new features
	        WebElement clickable = driver.findElement(By.id("clickable"));
	        new Actions(driver)
	                .moveToElement(clickable)
	                .pause(Duration.ofSeconds(1))
	                .clickAndHold()
	                .pause(Duration.ofSeconds(1))
	                .sendKeys("abc")
	                .perform();

			driver.quit();
		}


}
