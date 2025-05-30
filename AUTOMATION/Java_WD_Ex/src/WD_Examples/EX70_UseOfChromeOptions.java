package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX70_UseOfChromeOptions {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--start-maximized");
//		ops.addArguments("--window-position=1920,1080"); //if use this it will run in headless approach
		ops.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://www.amazon.in/");
		System.out.println("PageTitle: "+driver.getTitle());
		
		Thread.sleep(6000);
		driver.quit();
	}
}
