//How to handle SSL Certificate issue in FF with WebDriver 
// How to handle the secured connection error in HTTPS 
// How to handle the HTTPS website in selenium 
// How to accept the SSL untrusted connection?
package WD_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EX51_HandleSSLError { 

public static void main(String[] args) { /////////---------- https://youtu.be/yWNFF5cpL70  ,  https://youtu.be/lvIXXilkw60
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	//Global profile
	DesiredCapabilities capabilities = new DesiredCapabilities(); // (Or) FirefoxOptions options = new FirefoxOptions();
	
	capabilities.setAcceptInsecureCerts(true); 
	 			// (Or)
	//capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); //this will accept all the insecure certificates
	//capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); //this will accept all the SSL certificates
	
	////////////????? WebDriver driver= new ChromeDriver(capabilities); //arg - capabilities
	//why this depricated
	////////////????? driver.get("https://expired.badssl.com/");
	//driver.get("https://badssl.com/");
	//driver.findElement(By.linkText("expired")).click();
	
}
}
