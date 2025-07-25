package WD_Examples;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX01f_Cookies_Capture_from_Browser {
	public static void main(String[] args) throws InterruptedException, IOException {
		//for Chrome
		ChromeOptions ops = new ChromeOptions();
		ops.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cookie: cookies) 
			System.out.println("\n"+cookie);
		
		driver.quit();
	}
}
