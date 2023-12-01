package testng.framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jDemo {
	Logger logger;
	WebDriver driver;

	@Test
	public void setUp() throws InterruptedException {
		logger = Logger.getLogger("Log4jDemo.class"); // classname.class
		PropertyConfigurator.configure("log4j.properties"); // Log4j-property file name

		// System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		logger.info("--------------Browser executable file running-------------");
		driver = new ChromeDriver();

		logger.info("---------------Browser launched-----------");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		logger.info("-----------------Application opened /info1/----------------");
		logger.error("----------------Application opened /error2/---------------");
		logger.warn("-----------------Application opened /warn3/----------------");
		logger.fatal("----------------Application opened /fatal4/---------------");
		logger.debug("----------------Application opened /debug5/---------------");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.quit();
		logger.info("---------------Browser closed-----------");
	}
} // logging levels:
