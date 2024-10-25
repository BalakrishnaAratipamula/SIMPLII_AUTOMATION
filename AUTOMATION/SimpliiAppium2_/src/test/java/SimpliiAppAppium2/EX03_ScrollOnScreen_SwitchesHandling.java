package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class EX03_ScrollOnScreen_SwitchesHandling {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:plaformVersion", "12");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "Xiaomi 220733SI");
		dc.setCapability("appium:udid", "adb-TCY9HYMN69FELV9D-YtIZTr._adb-tls-connect._tcp");
//		dc.setCapability("appium:app", "E:\\SampleAPK\\ApiDemos-debug.apk");
		
		dc.setCapability("appium:appPackage", "io.appium.android.apis");
		dc.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AppiumDriver driver = new AppiumDriver(url, dc);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		//Scroll upto
		String scrollUpto = "Switches"; //TextSwitcher
		WebElement ele = driver.findElement(
		AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\""+scrollUpto+"\"))"));
		ele.click();																								//.textContains(\"WebView\")
		
		//Default switch
		driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Default is on\"]")).click();
		//Monitored switch
		driver.findElement(By.xpath("//android.widget.Switch[@content-desc=\"Monitored switch\"]")).click();
		
		System.out.println("Done");
		Thread.sleep(8000);
		driver.quit();
	}
}
