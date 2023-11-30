package SeleniumLatestFeaturesGroup.NewFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX02_OpenNewWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);

		// Opens BrowserStack homepage in the newly opened window
		driver.navigate().to("https://www.browserstack.com/");
		
	}

}
