package Manage_WD_Instance_inParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Use WebDriver Factory for Better Management: A factory class can create drivers dynamically based on browser type.
public class X3_WebDriverFactory {
	public static WebDriver createInstance(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        }
        throw new IllegalArgumentException("Browser not supported");
    }
}
