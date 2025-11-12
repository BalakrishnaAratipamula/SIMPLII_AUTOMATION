package WD_Examples;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX40d_WebElementScreenshot_inSelenium4 {
	public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");
        
        WebElement logo = driver.findElement(By.id("logo"));
        File screenshot = logo.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("logo.png"));
        
        driver.quit();
    }
}
