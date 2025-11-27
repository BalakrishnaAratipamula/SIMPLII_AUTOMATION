package WD_Examples;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX64b_Handle_FileUpload_nd_Download_nd_VeryingDownloadedFile {
	static WebDriver driver;
	
	public static void main(String[] args) throws AWTException {
		ChromeOptions options = new ChromeOptions();
		
		// File Upload
		WebElement uploadElement = driver.findElement(By.id("fileUpload")); 
		uploadElement.sendKeys("C:\\path\\to\\file.txt");
		
		// Using Robot class for OS-Level file dialogs
		Robot robot = new Robot();
		robot.keyPress (KeyEvent.VK_CONTROL);
		robot.keyPress (KeyEvent.VK_V);
		robot.keyRelease (KeyEvent.VK_V);
		robot.keyRelease (KeyEvent.VK_CONTROL);
		
		// File Download (configure browser to auto-download) ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<>(); 
		chromePrefs.put("download.default_directory", "/download/path"); 
		chromePrefs.put("download.prompt_for_download", false); 
		options.setExperimentalOption("prefs", chromePrefs); 
		driver = new ChromeDriver (options);
		
		// Verify downloaded file
		File downloadDir = new File("/download/path"); 
		File[] files = downloadDir.listFiles();
		assertTrue(files != null && files.length > 0);
	}
}
