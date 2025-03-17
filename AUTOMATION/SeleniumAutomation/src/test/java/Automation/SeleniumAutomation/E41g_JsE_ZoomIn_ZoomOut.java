package Automation.SeleniumAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E41g_JsE_ZoomIn_ZoomOut {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(3000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.body.style.zoom = '150%'"); //Zoom-in
		Thread.sleep(4000);
		jse.executeScript("document.body.style.zoom = '100%'"); //Zoom-out
		
		Thread.sleep(6000);
		driver.quit();
	}
}
