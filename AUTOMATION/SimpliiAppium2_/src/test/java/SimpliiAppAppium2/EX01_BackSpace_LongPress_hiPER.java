package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class EX01_BackSpace_LongPress_hiPER {
	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:platformVersion", "12");
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "Xiaomi 220733SI"); // Redmi A1, Xiaomi 220733SI, samsung SM-M315F
		dc.setCapability("appium:udid", "adb-TCY9HYMN69FELV9D-YtIZTr._adb-tls-connect._tcp"); // TCY9HYMN69FELV9D
//		dc.setCapability("appium:app", "E:\\SampleAPK\\hr.palamida-6.1-APK4Fun.com.apk");

		//capabilities to interact with installed mobile application
		dc.setCapability("appium:appPackage", "cz.hipercalc");
		dc.setCapability("appium:appActivity", "app.hipercalc.CalculatorActivity");
		URL url = URI.create("http://127.0.0.1:4723/").toURL();

		driver = new AndroidDriver(url, dc);

		Thread.sleep(10000);
		System.out.println("Application started");

		driver.findElement(By.xpath("//android.widget.Button[@text=\"<U>1\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text=\"<U>%DIVISION\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text=\"<U>3\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text=\"<U>6\"]")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text=\"<U>9\"]")).click();

		WebElement backSpace = driver.findElement(By.xpath("//android.widget.Button[@text=\"<U><BS>\"]"));
		backSpace.click();
		driver.findElement(By.xpath("//android.widget.Button[@text=\"<U>0\"]")).click();
		Thread.sleep(2000);
		longPress(backSpace);
		
		Thread.sleep(10000);
		driver.quit();
	}
	
	static void longPress(WebElement backSpace) {
		Point location = backSpace.getLocation(); //get x,y position or points
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); //TOUCH type operation PointerInput class to create sequence of actions (like press, move, release...) //make sure objRef and name must be same (finger or finger1...)
		Sequence longPress = new Sequence(finger, 1); //initial length is always '1' //Sequence of steps involve or sequence of actions
		longPress.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), location.x, location.y)); //to move finger //don't need initial duration so '0', here 'viewport' is our mobile screen, x position, y position
		longPress.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg())); //to move downwards and press finger
		longPress.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), location.x, location.y)); //to long press finger
		longPress.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg())); //to finger up from button
		
		driver.perform(Collections.singleton(longPress)); //to perform above sequence
		
	}
}
