package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
//LRBD012402594133
//LRBD012402597582
public class EX01_Launch_diff_Browsers {
	public static void main(String[] args) throws InterruptedException {
		//geckoDriver
//		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.manage().logs().get(null);
		driver.navigate().to("https://www.google.com/"); 
		//to Print 'SessionId'
		SessionId sessionId = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session ID: " + sessionId); //*/
		
		/*/ChromeDriver
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/"); //*/


		/*/InternetExplorerDriver
		System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/"); //*/

		/*/EdgeDriver
		//System.setProperty("webdriver.edge.driver", "E:\\Drivers\\MicrosoftWebDriver.exe");
		System.setProperty("webdriver.edge.driver","E:\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/"); //*/

		driver.quit();
	}	
}
