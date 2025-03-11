package WD_Examples;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
//https://youtu.be/rOAkHQWApmI?si=VhvmFIrEYlt7ENs_
public class EX65_ADsBlocking_nd_AddExtensionsToWdLaunchedBrowser {
	static WebDriver driver; //
	public static void main(String[] args) throws InterruptedException {
		
		/*/ Firefox Browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Path path = Paths.get("E:\\ExtensionLink\\ublock_origin-1.60.0.xpi"); //to download .xpi search 'ublock xpi-versions' on browser --> (or) https://www.lakora.us/xpi-versions/?id=ublock-origin (or) https://sourceforge.net/projects/ublock-origin.mirror/files/
		String extensionId = driver.installExtension(path);
		
		driver.get("https://text-compare.com/");
		Thread.sleep(2500);
		
		driver.uninstallExtension(extensionId);
		//*/
		
//		driver.quit();	
		
		
		// Chrome Browser
		/*to Download 'CRX Extractor/Downloader' --> Chrome Web Store - search 'CRX Extractor/Downloader' --> ADD Extension to chrome
		 *to download .crx file for Extension --> search extension in chrome web store --> RC on '[Add extension]' --> Download CRX for this extension --> Download CRX for this extension --> give location and save
		 */
		
		// Chrome Browser
		ChromeOptions options = new ChromeOptions();
		File file = new File("E:\\CRX\\AdBlocker-Ultimate-Chrome-Web-Store.crx"); // Extension: AdBlocker Ultimate
		options.addExtensions(file);

		driver = new ChromeDriver(options); // options
		driver.get("https://demoqa.com/nestedframes"); // other practice link: https://text-compare.com/

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// after installing 'AdBlocker Ultimate' Extension '! Thank you for installing our adblocker!' is appearing so to focus on main window i'm closing the current focusing 'Thank you' window
		Set<String> allWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allWindows);
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1)); // 'Thank u for installing' window
		driver.close(); // after installing 'AdBlocker Ultimate' Extension '! Thank you for installing our adblocker!' is appearing so to focus on main window i'm closing the current focusing 'Thank you' window
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());

		// Try to print the heading of the main page without switching
		WebElement mainPageText = driver.findElement(By.xpath("//*[@id='framesWrapper']/div[1]"));
		System.out.println("Main Page Text: \n" + mainPageText.getText());

		Thread.sleep(2500);
		// */
		
//		driver.quit();	
	}
}
