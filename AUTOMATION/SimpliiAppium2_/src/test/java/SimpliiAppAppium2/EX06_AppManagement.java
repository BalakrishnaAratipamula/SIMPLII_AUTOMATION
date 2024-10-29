package SimpliiAppAppium2;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class EX06_AppManagement {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("platformName", "Android");
		dc.setCapability("appium:plaformVersion", "12"); //appium:
		dc.setCapability("appium:automationName", "uiautomator2");
		dc.setCapability("appium:deviceName", "Xiaomi 220733SI");
		dc.setCapability("appium:udid", "adb-TCY9HYMN69FELV9D-YtIZTr._adb-tls-connect._tcp");
		
//		dc.setCapability("appium:appPackage", "io.appium.android.apis");
//		dc.setCapability("appium:appActivity", "io.appium.android.apis.ApiDemos");
		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		//to install
//		driver.installApp("E:\\SampleAPK\\ApiDemos-debug.apk");
		
		String appPackage = "io.appium.android.apis";
		
//		if(driver.isAppInstalled(appPackage)) {
//			System.out.println("App Installed");
//		}
		
		//to activate
		driver.activateApp(appPackage);
		System.out.println("App Activated");
		
		Thread.sleep(5000);
		
		//to terminate
		driver.terminateApp(appPackage);
		System.out.println("App Terminated");
		
		//to uninstall
//		driver.removeApp(appPackage);
//		System.out.println("App Uninstalled");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
