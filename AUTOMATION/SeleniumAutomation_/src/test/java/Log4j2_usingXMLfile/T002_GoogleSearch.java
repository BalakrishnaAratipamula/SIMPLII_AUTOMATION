package Log4j2_usingXMLfile;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class T002_GoogleSearch {
	private static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) throws InterruptedException {
		// levels of logging: info, warn, fatel, debug, error
		logger.info("Execution is starting");
		WebDriver driver = new ChromeDriver();
		try {
			logger.info("Browser Launched");
			driver.get("https://www.google.co.in/");
			logger.info("Application launched");
			logger.debug("Page Title is:  " + driver.getTitle());
			WebElement ele = driver.findElement(By.name("q"));
			ele.sendKeys("Selenium");
			Assert.fail();
			ele.sendKeys(Keys.ENTER);
			logger.info("Serched for 'Selenium'");
			logger.debug("Page Title is:  " + driver.getTitle());
		} catch (Exception e) {
			logger.error("Test Failed:  " + e.getMessage());
		} finally {
			logger.info("Closing Browser");
			Thread.sleep(3000);
			System.out.println("@@@@Check 'logs/app111.log'"); //specified this path in 'log4j2.xml' file
			driver.quit();
		}
	}
}
