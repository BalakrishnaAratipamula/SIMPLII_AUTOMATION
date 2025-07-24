package WD_Examples;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;

public class EX01g_CaptureBrowserLogs {
	public static void main(String[] args) {
		// 1. Set logging preferences
		LoggingPreferences logPrefs = new LoggingPreferences();
		logPrefs.enable(LogType.BROWSER, Level.ALL); // capture all browser logs

		// 2. Add to ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.setCapability("goog:loggingPrefs", logPrefs);

		// 3. Start WebDriver
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
		// 4. Fetch browser logs
		driver.manage().logs().get(LogType.BROWSER).forEach(logEntry -> {
			System.out.println(logEntry.getLevel() + " : " + logEntry.getMessage());
		});
		
		driver.quit();
	}
}
