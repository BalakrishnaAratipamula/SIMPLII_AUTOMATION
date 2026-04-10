package WD_Examples;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EX40d_WebElementScreenshot_inSelenium4 {
	public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        
        Thread.sleep(5000);
        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        
        File src = searchBtn.getScreenshotAs(OutputType.FILE); //Selenium 4 feature
        File dest = new File("./SearbBtn_screenshot.png");
        FileHandler.copy(src, dest);
        
        driver.quit();
    }
}
