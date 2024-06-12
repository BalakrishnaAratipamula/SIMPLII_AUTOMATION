package SeleniumLatestFeaturesGroup.NewFeatures;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Flash.FlashObjectWebDriver;

public class FlashObjectsHandling { //*********************Not orking ignore this program*****************//
	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  	 
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/flash-testing.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();

		FlashObjectWebDriver fow = new FlashObjectWebDriver(driver, "myFlashMovie");	//'id' of 'object' tag
		
//		Thread.sleep(5000);		
//		fow.callFlashObject("Play");			
//	  	Thread.sleep(5000);		
//	  	fow.callFlashObject("StopPlay");			
		Thread.sleep(5000);		
		fow.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
	    System.out.println(fow.callFlashObject("GetVariable","/:message"));	
	    
		/*Thread.sleep(6000);
		fow.callFlashObject("pauseVideo");
		
		Thread.sleep(10000);
		fow.callFlashObject("playVideo");
		
		Thread.sleep(4000);
		fow.callFlashObject("seekTo","90","true");
		
		Thread.sleep(4000);
		fow.callFlashObject("setVolume","70");
		
		Thread.sleep(4000);
		fow.callFlashObject("mute");
		
		Thread.sleep(4000);
	    
		driver.close(); */
		driver.quit();
	}
}
