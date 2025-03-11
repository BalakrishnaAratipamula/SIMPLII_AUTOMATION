package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class E31d_NestedFrames {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {
		// Firefox Browser
		FirefoxOptions options = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		options.setProfile(profile);

		driver = new FirefoxDriver(options); // options
		driver.get("https://demoqa.com/nestedframes");

		Path path = Paths.get("F:\\ExtensionLink_\\ublock_origin-1.62.0.xpi");
		((FirefoxDriver) driver).installExtension(path); // */
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 200)");
		//Number of frames on page
		framesCountGeneric("iframe", "Home Page"); 
		
		//Switch to Parent Frame
		driver.switchTo().frame("frame1"); //id
		//Number of frames on Parent Frame
		framesCountGeneric("iframe", "Parent Frame");
		
		//Switch to Child Frame
		driver.switchTo().frame(0); //index - 0 - bcz Number of iframes inside the Parent Frame :  1
		//Number of frames on Parent Frame
		framesCountGeneric("iframe", "Child Frame");
		
		//Switch back to Parent Frame
		driver.switchTo().parentFrame(); //predefined method
		//Number of frames on Parent Frame
		framesCountGeneric("iframe", "Parent Frame");
		
		//Switch to default content
        driver.switchTo().defaultContent(); //Enter to main window from any frame (child or parent)

        //Try to print the heading of the main page without switching
        WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
        System.out.println("Main Page Text: \n"+mainPageText.getText());

        System.out.println("============End============");
		driver.quit(); //*/
	}
	
	//generic code to get the number of frames
	public static void framesCountGeneric(String locateFrameByTagName, String identificationForConsoleMsg) {
		int countIframes = driver.findElements(By.tagName(locateFrameByTagName)).size();
		System.out.println("Number of iframes inside the "+identificationForConsoleMsg+" :  "+countIframes);
		if(identificationForConsoleMsg.equals("Parent Frame") || identificationForConsoleMsg.equals("Child Frame")) {
			//to get the frame Text
			System.out.println("Frame Text:  "+driver.findElement(By.tagName("body")).getText());
		}
	}
}
