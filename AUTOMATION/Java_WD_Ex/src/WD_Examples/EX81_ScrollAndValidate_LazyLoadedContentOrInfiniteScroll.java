package WD_Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//H to validate content that loads only when scrolling?
public class EX81_ScrollAndValidate_LazyLoadedContentOrInfiniteScroll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://example-lazyload-site.com"); // Replace with your site
		driver.manage().window().maximize();

		/*/M1
		//Initial elements loaded
		List<WebElement> items = driver.findElements(By.cssSelector(".item-class"));
		System.out.println("Initially loaded items: " + items.size());

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll until no new items are loaded
		int lastCount = 0;
		while (true) {
			// Scroll down
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000); // wait for new items to load

			items = driver.findElements(By.cssSelector(".item-class"));
			System.out.println("Items after scroll: " + items.size());

			if (items.size() == lastCount) {
				System.out.println("No more new items loaded. Lazy loading complete.");
				break;
			}
			lastCount = items.size();
		}
		
		// Validation Example: Ensure at least X items are loaded
		if (items.size() >= 50) {
			System.out.println("Validation passed! Total items: " + items.size());
		} else {
			System.out.println("Validation failed! Only " + items.size() + " items loaded.");
		}

		driver.quit();
		//*/
		
		
		//M2
		JavascriptExecutor js = (JavascriptExecutor) driver;
		long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

		while (true) {
		    js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		    Thread.sleep(2000);
		    long newHeight = (long) js.executeScript("return document.body.scrollHeight");
		    if (newHeight == lastHeight) {
		        break;
		    }
		    lastHeight = newHeight;
		}
	} 
}
