package WD_Examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class EX40b_FullPageScreenshot_Using_Selenium4Feature {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new FirefoxDriver(); // ChromeDriver not work
		driver.navigate().to("https://github.com/pazone/ashot"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Take_FullPage_Screenshot ######################
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE); // ChromeDriver not work
		try {
			FileHandler.copy(source, new File("./fullImage.jpg")); // (gettingImage, formatName,
		} catch (IOException e) {
			e.printStackTrace();  //bala#
		}  

		driver.quit(); 
	}

}
