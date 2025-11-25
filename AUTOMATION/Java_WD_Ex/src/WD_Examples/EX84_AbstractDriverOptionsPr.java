package WD_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX84_AbstractDriverOptionsPr {
	public static void main(String[] args) {
        // ChromeOptions extends AbstractDriverOptions
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");   // run without opening browser window
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");

        System.out.println("Page title is: " + driver.getTitle());
        driver.quit();
	}
}
