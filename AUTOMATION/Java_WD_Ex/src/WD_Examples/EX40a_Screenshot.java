package WD_Examples;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX40a_Screenshot {
	public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/");

        //screenshot of the entire page
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        byte[] screenshotBytes = screenshot.getScreenshotAs(OutputType.BYTES);

        // Save the screenshot to a file
        FileUtils.writeByteArrayToFile(new File("screenshot.png"), screenshotBytes);

        driver.quit();
    }
}
