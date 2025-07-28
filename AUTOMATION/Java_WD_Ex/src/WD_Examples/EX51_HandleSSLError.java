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

// How to handle HTTPS website in selenium / or How to accept the SSL untrusted connection
public class EX51_HandleSSLError {

	public static void main(String[] args) {

		/*/Execution 1 -  For Chrome Browser
		ChromeOptions capabilities = new ChromeOptions(); //

		// capabilities.setAcceptInsecureCerts(true); 
		// (Or)
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); // this will accept all the insecure certificates

		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("https://expired.badssl.com/");
		
		System.out.println("The page title is : " + driver.getTitle()); // */

		
		
		//Execution 2 - For Firefox Browser
		FirefoxOptions capabilities = new FirefoxOptions();

//		capabilities.setAcceptInsecureCerts(true);
		// (Or)
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); // this will accept all the insecure certificates

		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://self-signed.badssl.com/");

		System.out.println("The page title is : " + driver.getTitle()); // */

	}
}
