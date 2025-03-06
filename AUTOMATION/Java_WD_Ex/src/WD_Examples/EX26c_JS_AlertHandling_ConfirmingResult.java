package WD_Examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX26c_JS_AlertHandling_ConfirmingResult {
	public static void main(String args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");

		// clicking on prompt button
		WebElement confirmButton = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		confirmButton.click();
		Thread.sleep(3000);

		// accepting javascript alert
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.accept();

		System.out.println("Alert message:  " + alertMessage);
		String textAfterConfirmingAlert = driver.findElement(By.xpath("//*[@id='javascriptAlertsWrapper']/div[3]/div/span[2]")).getText();
		System.out.println("After confirming alert confirmation message:  " + textAfterConfirmingAlert);

		//dismiss javascript alert
		confirmButton.click();
		alert = driver.switchTo().alert();
		alertMessage = alert.getText();
		alert.dismiss();

		System.out.println("Alert message:  " + alertMessage);
		textAfterConfirmingAlert = driver.findElement(By.xpath("//*[@id='javascriptAlertsWrapper']/div[3]/div/span[2]")).getText();
		System.out.println("After confirming alert confirmation message:  " + textAfterConfirmingAlert);

		Thread.sleep(8000);
		driver.quit();
	}
}
