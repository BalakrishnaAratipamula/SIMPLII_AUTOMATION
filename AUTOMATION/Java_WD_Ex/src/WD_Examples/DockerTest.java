package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class DockerTest {
	public static RemoteWebDriver driver;
	public static void main(String[] args) throws Exception, MalformedURLException{
//		WebDriverManager.firefoxdriver().setup();
		
		// Set the desired capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setVersion("131.0");	
		capabilities.setBrowserName("chrome");
//		FirefoxOptions ops = new FirefoxOptions();
//		ops.addArguments("--ignore-ssl-errors=yes");
//		ops.addArguments("--ignore-certificate-errors");
		// URL of the Selenium Grid
//		URL gridUrl = new URL("http://localhost:4444/wd/hub");

		try {
		// Create a new instance of the RemoteWebDriver with the desired capabilities
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		}catch(MalformedURLException e) {}
		// Perform actions using the driver
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		driver.get("https://www.amazon.in/");
		System.out.println("Page Title: " + driver.getTitle());
		driver.get("https://www.google.com");
		System.out.println("Page Title: " + driver.getTitle());
		
		// Close the browser
		driver.quit();
	}
}
