package testng.framework;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//Log4j provides many logging levels. Below is the complete list.

//TRACE: The TRACE Level designates finer-grained informational events than the DEBUG.
//DEBUG: The DEBUG Level designates fine-grained informational events that are most useful to debug an application.
//INFO: The INFO level designates informational messages that highlight the progress of the application at coarse-grained level.
//WARN: The WARN level designates potentially harmful situations.
//ERROR: The ERROR level designates error events that might still allow the application to continue running.
//FATAL: The FATAL level designates very severe error events that will presumably lead the application to abort.
//ALL: The ALL has the lowest possible rank and is intended to turn on all logging.
//OFF: The OFF has the highest possible rank and is intended to turn off logging.
//ALL and OFF are special logging levels and should be used in extreme situations. I have never used these personally at any point of time.

public class Log4jDemo {
	Logger logger;
	WebDriver driver;

	@Test
	public void setUp() throws InterruptedException {
		logger = Logger.getLogger("Log4jDemo.class"); // classname.class //@@Class_Name
		PropertyConfigurator.configure("log4j.properties"); // Log4j-property file name //@@ProprtyFile_Name

		// System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		logger.info("-----------------Browser executable file running-------------");	//info, fatel, warn, error
		driver = new ChromeDriver();
		logger.info("-----------------Browser launched-----------");
	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		logger.trace("-----------------Application opened /trace=1/----------------");
		logger.info ("-----------------Application opened /info=2/-----------------");
		logger.error("-----------------Application opened /error=3/----------------");
		logger.warn ("-----------------Application opened /warn=4/-----------------");
		logger.fatal("-----------------Application opened /fatal=5/----------------");
		logger.debug("-----------------Application opened /debug=6/----------------");
		driver.manage().window().maximize();
		logger.info("-----------------Browser Maximized--------------");
		Thread.sleep(1000);

		driver.quit();
		logger.info("-----------------Browser closed-----------");
	}
} // logging levels:




