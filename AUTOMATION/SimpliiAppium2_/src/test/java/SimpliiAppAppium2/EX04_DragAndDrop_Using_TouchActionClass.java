package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

//import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class EX04_DragAndDrop_Using_TouchActionClass {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:plaformVersion", "12"); //appium:
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "Xiaomi 220733SI");
		dc.setCapability("appium:udid", "adb-TCY9HYMN69FELV9D-YtIZTr._adb-tls-connect._tcp");
//		dc.setCapability("appium:app", "E:\\SampleAPK\\ApiDemos-debug.apk");
		
		dc.setCapability("appium:appPackage", "io.appium.android.apis");
		dc.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		
		//Source
		WebElement sourceEle = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		//Source
		WebElement targetEle = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
				
//		TouchAction tc = new TouchAction(driver);
//		tc.longPress(longPressOptions().withElement(element(sourceEle)))
//			.moveTo(element(targetEle))
//			.perform()
//			.release();


		System.out.println("Done");
//		Thread.sleep(8000);
		driver.quit();
	}
}
