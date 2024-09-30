package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EX01_BrowserLaunch_Using_WebDriverManager {
	public static void main(String[] args) {
		/*//
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(); //*/
		
		///
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); //*/
		
		driver.navigate().to("https://www.google.com/"); //*/ 

		driver.quit();
	}
}
