package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX26a_JS_AlertHandling {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();

		// Disable JavaScript alerts
		options.addArguments("--disable-popup-blocking");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://example.com");

		driver.quit();
	}
}
