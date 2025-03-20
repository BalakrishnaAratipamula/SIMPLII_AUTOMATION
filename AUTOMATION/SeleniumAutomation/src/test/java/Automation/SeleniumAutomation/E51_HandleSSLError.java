package Automation.SeleniumAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class E51_HandleSSLError {
	public static void main(String[] args) throws InterruptedException {
		//Execution 1: For Chrome Browser
		ChromeOptions capabilities = new ChromeOptions();
//		capabilities.setAcceptInsecureCerts(true);
//		(or)
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		WebDriver driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		
		Thread.sleep(6000);
		driver.quit();
	} //*/
	
		/*/Execution 1: For Firefox Browser
		FirefoxOptions capabilities = new FirefoxOptions();
		capabilities.setAcceptInsecureCerts(true);
//		(or)
//		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://self-signed.badssl.com/");

		Thread.sleep(6000);
		driver.quit(); 
	} //*/
}
