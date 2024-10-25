package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EX04b_DragAndDrop_Using_W3CActionAPI {
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
				
		Point sourceEleCenter = getCenter(sourceEle);
		Point targetEleCenter = getCenter(targetEle);
		
		//PointerInput class to create sequence of actions (like press, move, release...)
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		
		Sequence sequence = new Sequence(finger1, 1)
				//move finger ti the starting position
				.addAction(finger1.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), sourceEleCenter))
				//finger coming down to contact with screen
				.addAction(finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
				//pause cmd
				.addAction(new Pause(finger1, Duration.ofMillis(588)))
				//move finger to the end position
				.addAction(finger1.createPointerMove(Duration.ofMillis(588), PointerInput.Origin.viewport(), targetEleCenter))
				//move finger up
				
				.addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
		
		driver.perform(Arrays.asList(sequence));
		
		String str = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		System.out.println(str);
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	static Point getCenter(WebElement ele) { //to get source and target center
		Point location = ele.getLocation();
		Dimension size = ele.getSize();
		Point centerPoint = new Point(location.x+size.width/2, location.y+size.height/2);
		
		return centerPoint;
	}
}
