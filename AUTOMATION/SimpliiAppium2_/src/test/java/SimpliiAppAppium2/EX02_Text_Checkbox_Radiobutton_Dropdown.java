package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EX02_Text_Checkbox_Radiobutton_Dropdown {
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
		driver.findElements(By.id("android:id/text1")).get(4).click(); ////android.widget.TextView[@content-desc=\"Controls\"]
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		//TextBox
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"io.appium.android.apis:id/edit\"]")).sendKeys("Selenium WebDriver");
		//CheckBox
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Checkbox 2']")).click(); ////android.widget.CheckBox[@content-desc=\"Checkbox 2\"]
		//RadioButton
		driver.findElement(By.xpath("//android.widget.RadioButton[@content-desc=\"RadioButton 2\"]")).click();
		//Star
		driver.findElement(By.xpath("//android.widget.CheckBox[@content-desc=\"Star\"]")).click();
		//Flat Switch / Toggle Switch
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		
		//Dropdown
		driver.findElement(By.id("android:id/text1")).click();
		List<WebElement> ddValues = driver.findElements(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\"]")); ////android.widget.CheckedTextView[@resource-id="android:id/text1" and @text="Jupiter"]
		System.out.println(ddValues.size());
		for(int i=0; i<8; i++) {
			String value = ddValues.get(i).getText();
			if(value.equalsIgnoreCase("Jupiter")) {
				ddValues.get(i).click();
				System.out.println(value+" clicked");
				break;
			}
		}
		
		System.out.println("Done");
		Thread.sleep(8000);
		driver.quit();
	}
}
