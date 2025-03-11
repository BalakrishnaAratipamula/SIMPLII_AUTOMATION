package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E31c_AddsBlocking {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		/*/ Firefox Browser
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		options.setProfile(profile);
		
		driver = new FirefoxDriver(options); //options
		driver.get("https://demoqa.com/nestedframes");
		
		Path path = Paths.get("F:\\ExtensionLink_\\ublock_origin-1.62.0.xpi");
		((FirefoxDriver) driver).installExtension(path); //*/
		
		
		
		// Chrome Browser
		ChromeOptions options = new ChromeOptions();
		File file = new File("F:\\ExtensionLink_\\AdBlocker-Ultimate-Chrome-Web-Store.crx"); //Extension: AdBlocker Ultimate
		options.addExtensions(file);
		
		driver = new ChromeDriver(options); //options
		driver.get("https://demoqa.com/nestedframes"); //other practice link: https://text-compare.com/
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1)); //'Thank u for installing' window
		driver.close(); //after installing 'AdBlocker Ultimate' Extension '! Thank you for installing our adblocker!' is appearing so to focus on main window i'm closing the current focusing 'Thank you' window
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		
		//Try to print the heading of the main page without switching
        WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
        System.out.println("Main Page Text: \n"+mainPageText.getText()); //*/

//		driver.quit();
	}
}
