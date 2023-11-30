package SeleniumLatestFeaturesGroup.NewFeatures;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class EX03_OpenNewTabWithinSameWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		// Opens a new tab in existing window
		driver.switchTo().newWindow(WindowType.TAB);
		
		// Opens Browserstack homepage in the newly opened tab
		driver.navigate().to("https://www.browserstack.com/");
		
		
	}

}
