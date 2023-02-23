package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX01b_Navigation_cmds {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.gecko.driver", "E:\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https:en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println("**********back*********");
		Thread.sleep(2000);
		driver.navigate().refresh();
		System.out.println("**********refresh*********");
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println("**********forward*********");
		Thread.sleep(3000);

		driver.quit(); 
		driver.close(); 

	}

}
