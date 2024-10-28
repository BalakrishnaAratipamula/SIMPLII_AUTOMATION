package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EX05_Swipe_or_Scroll {
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
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		
		//get screen size 
		Dimension size = driver.manage().window().getSize();
		
		//find the position where we need to touch (starting position)
		int startX = size.getWidth()/2; //'x' center
		int startY = size.getHeight()/2; //'y' center
		
		//position till we want to move our finger (ending position)
		int endX = startX;
		int endY = (int) (size.getHeight()*0.25); //for upward swipe (we can see down side)
		int endY2 = (int) (size.getHeight()-250); //for upward swipe (we can see down side)
		
		//PointerInput class to create sequence
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1"); //finger1 - pointer1
		
		//Sequence object is used to create list of actions that will be performed
		Sequence sequence = new Sequence(finger1, 1)
				//finger Swipe-Up
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
				//finger Swipe-Up
				.addAction(new Pause(finger1, Duration.ofSeconds(5)))
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
				//finger Swipe-Up
				.addAction(new Pause(finger1, Duration.ofSeconds(5)))
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
				//finger Swipe-Down
				.addAction(new Pause(finger1, Duration.ofSeconds(5)))
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY2))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()))
				//finger Swipe-Down
				.addAction(new Pause(finger1, Duration.ofSeconds(5)))
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY2))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

		//perform the sequence of action
		driver.perform(Collections.singletonList(sequence));
				
		System.out.println("Done");
		Thread.sleep(4000);
		driver.quit();
	}
}
		