package WD_Examples;

import java.util.List;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX32c_Check_If_ele_Is_Inside_iframe_r_not_Using_tryCatch {
	
	static WebElement element;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/"); // Replace with actual URL

		try {
			// Try finding the element directly
			element = driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]"));
			System.out.println("Element found outside iframe.");
		} catch (NoSuchElementException e) {
			// If element not found, check inside iframes
			System.out.println("Catch block inside");
			List<WebElement> iframes = driver.findElements(By.tagName("frame"));

			for (WebElement iframe : iframes) {
				driver.switchTo().frame(iframe);
				try {
					element.click();
					System.out.println("Element found inside an iframe!");
					Thread.sleep(3000);

					//to read msg from alt
					Alert alt = driver.switchTo().alert();
					System.out.println("aler msg:   "+alt.getText());
					alt.accept();
					driver.findElement(By.name("fldLoginUserId")).sendKeys("4567");
					Thread.sleep(2000);
					
					driver.switchTo().defaultContent(); // Return to main page
					break;
				} catch (NoSuchElementException ex) {
					driver.switchTo().defaultContent(); // Return to main page
				}
			}
		}

		driver.quit();
	}
}
