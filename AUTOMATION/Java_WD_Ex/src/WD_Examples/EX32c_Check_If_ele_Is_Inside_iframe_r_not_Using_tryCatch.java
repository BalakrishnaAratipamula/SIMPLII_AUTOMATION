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
			System.out.println("Element found outside frame.");
		} catch (NoSuchElementException ex1) {
			// If element not found, check inside iframes
			System.out.println("Catch block inside");
			List<WebElement> frames_ = driver.findElements(By.tagName("frame"));

			for (WebElement frame_ : frames_) {
				driver.switchTo().frame(frame_);
				try { //try block is used: if ele is not present in iterating frames we don't get the exception and go with next iteration smoothly
					element.click();
					System.out.println("Element found inside an frame!");
					Thread.sleep(3000);

					//to read msg from alt
					Alert alt = driver.switchTo().alert();
					System.out.println("aler msg:   "+alt.getText());
					alt.accept();
					driver.findElement(By.name("fldLoginUserId")).sendKeys("4567");
					Thread.sleep(2000);
					
					driver.switchTo().defaultContent(); // Return to main page //defaultContect for: ele is present inside iterating frames
					break;
				} catch (NoSuchElementException ex2) {
					driver.switchTo().defaultContent(); // Return to main page //defaultContect for: ele is not present inside iterating frames
				}
			} 
		}

		driver.quit();
	}
}
