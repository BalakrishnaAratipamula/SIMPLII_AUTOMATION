package SimpliiAppAppium2;

import java.net.URI;
import java.net.URL;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class EX07_MobileBrowserAutomation_Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:plaformVersion", "12"); //appium:
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "Xiaomi 220733SI");
		dc.setCapability("appium:udid", "adb-TCY9HYMN69FELV9D-YtIZTr._adb-tls-connect._tcp");
		dc.setCapability("appium:browserName", "Chrome");
		dc.setCapability("appium:chromedriverExecutable", "F:\\SIMPLII\\SIMPLII_AUTOMATION\\AUTOMATION\\SimpliiAppium2_\\Drivers\\chromedriver.exe");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.navigate().to("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Seleniumhq");
		ele.sendKeys(Keys.RETURN); //ENTER
		driver.navigate().back();
		ele.sendKeys("Oracle Java");
		ele.sendKeys(Keys.ENTER); //RETURN
		
		TakesScreenshot takescreenshot = (TakesScreenshot)driver;
		File myFile = takescreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots\\sc.png");
		FileUtils.copyFile(myFile, destFile);
		
		System.out.println("Done");
		Thread.sleep(4000);
		driver.quit();
	}
}
