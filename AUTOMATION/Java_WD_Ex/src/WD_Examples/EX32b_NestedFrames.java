package WD_Examples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EX32b_NestedFrames {
	static WebDriver driver;

	public static void main(String[] args) {
		FirefoxOptions ops = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		ops.setProfile(profile);

		driver = new FirefoxDriver(ops);
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();

		Path path = Paths.get("E:\\ExtensionLink2\\ublock_origin-1.62.0.xpi"); //((or) older version)E:\\ExtensionLink\\ublock_origin-1.60.0.xpi
		((FirefoxDriver) driver).installExtension(path);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Number of Frames on a Page
		framesCountGeneric("iframe", "page"); // (locateFrameByTagName, identificationForConsoleMsg)

		// Switch to parent frame
		driver.switchTo().frame("frame1"); //id
		// Number of Frames on Parent Frame
		framesCountGeneric("iframe", "Parent Frame"); // (locateFrameByTagName, identificationForConsoleMsg)

		// switch to child frame
		driver.switchTo().frame(0); //index-0 - bcz Number of iframes inside the Parent Frame :  1
		// Number of Frames on Child Frame
		framesCountGeneric("iframe", "Child Frame"); // (locateFrameByTagName, identificationForConsoleMsg)

		// Switch back to parent frame
		driver.switchTo().parentFrame(); //built-in method
		// Number of Frames on Parent Frame
		framesCountGeneric("iframe", "Parent Frame"); // (locateFrameByTagName, identificationForConsoleMsg)

		// switch to child frame
		driver.switchTo().frame(0); //index
		// Number of Frames on Child Frame
		framesCountGeneric("iframe", "Child Frame"); // (locateFrameByTagName, identificationForConsoleMsg)

		//Switch to default content
        driver.switchTo().defaultContent(); //Enter to main window from any frame (child or parent)

        //Try to print the heading of the main page without switching
        WebElement mainPageText=driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
        System.out.println("Main Page Text: \n"+mainPageText.getText());

        System.out.println("============End============");
		driver.quit(); //*/
	}

	static void framesCountGeneric(String locateFrameByTagName, String identificationForConsoleMsg) {
		int countIframes = driver.findElements(By.tagName(locateFrameByTagName)).size();
		System.out.println("Number of iFrames inside the " + identificationForConsoleMsg + " : " + countIframes);
		if (identificationForConsoleMsg.equals("Parent Frame") || identificationForConsoleMsg.equals("Child Frame")) 
			System.out.println("Frame Text: " + driver.findElement(By.tagName("body")).getText());
	} 
}
