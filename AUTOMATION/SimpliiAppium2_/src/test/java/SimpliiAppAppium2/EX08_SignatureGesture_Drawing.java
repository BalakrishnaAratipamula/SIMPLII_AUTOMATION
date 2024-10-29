package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EX08_SignatureGesture_Drawing {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:plaformVersion", "12"); //appium:
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "Xiaomi 220733SI");
		dc.setCapability("appium:udid", "adb-TCY9HYMN69FELV9D-YtIZTr._adb-tls-connect._tcp");
//		dc.setCapability("appium:app", "E:\\SampleAPK\\com-kanishka-developer-sketchpad-220-66392854-d47a73d510e087545151dd83a8ad2e91.apk");
		dc.setCapability("appium:appPackage", "com.kanishka_developer.SketchPad");
		dc.setCapability("appium:appActivity", "io.kodular.kanishka_developer.SketchPad_220.Screen1");
		
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		Thread.sleep(8000);
		
		WebElement drawingPanel = driver.findElement(By.xpath("//android.view.View"));
		
		Point location = drawingPanel.getLocation();
		
		//drawing panel Height and Width
		Dimension size = drawingPanel.getSize();
		
		//Starting position (x, y) //top left is (0, 0) co-ordinates //bottom left is (n-value, n-value) co-ordinates
		int startX = (location.x + (size.getWidth()/2)); //top middle //starting x-cordinate
		int startY = location.y + 750; //100, 150, 200....580.... //starting y-cordinate
		
		//position till you want to move our finger (x, y)
		int endX = startX; //ending x-cordinate
		int endY = (location.y + (size.getHeight())); //Draw till end //ending y-cordinate
		
		//PointerInput class to create sequence of actions
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1"); //finger1 - pointer name 
		
		//Sequence object, which is a list of actions that will be performed on the device
		Sequence sequence = new Sequence(finger1, 1)
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY))
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				.addAction(new Pause(finger1, Duration.ofMillis(200)))
				.addAction(finger1.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(), endX, endY))
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		//perform sequence of actions
		driver.perform(Collections.singletonList(sequence));
		
		Thread.sleep(5000);
		driver.quit();
	}
}
