package WD_Examples;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX41g_ZoomIn_ZoomOut {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.body.style.zoom = '150%'"); //zoom-in
		Thread.sleep(2000);
		jse.executeScript("document.body.style.zoom = '100%'"); //reset to normal
		Thread.sleep(2000);
		
		driver.quit();
	}
}
