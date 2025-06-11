package WD_Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX32d_iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		// First finding the elements using any of locator strategy
		List<WebElement> iframList = driver.findElements(By.tagName("iframe"));
		int totalFrames = iframList.size();
		System.out.println("No of Frames:" + totalFrames);

		WebElement ele = driver.findElement(By.name("iframe_b"));
		System.out.println("Frame Names are:");
		for (WebElement iframe : iframList) {
//			System.out.println(iframe.getAttribute("name"));
			if (iframe.getAttribute("name").equals("iframe_b")) {
				// switch to frame by element
				driver.switchTo().frame(ele);
				// Search box
				driver.findElement(By.id("searchInput")).sendKeys("iframe Testing");
				Thread.sleep(2000);
				// Switching back to the main window
				driver.switchTo().defaultContent();
			}
		}
		
		boolean btnDisplayed = driver.findElement(By.id("simpleAlert")).isDisplayed();
		System.out.println(btnDisplayed);
		driver.quit();
	}
}
