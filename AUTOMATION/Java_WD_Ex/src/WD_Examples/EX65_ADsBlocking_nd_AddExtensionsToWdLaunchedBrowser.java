package WD_Examples;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EX65_ADsBlocking_nd_AddExtensionsToWdLaunchedBrowser {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		/*/ChromeBrowser
		ChromeOptions ops = new ChromeOptions();
		File file = new File("E:\\CRX\\uBlock.crx");
		ops.addExtensions(file);
		
		driver = new ChromeDriver(ops);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		//*/
		
		//FirefoxBrowser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Path path = Paths.get("E:\\ExtensionLink\\ublock_origin-1.60.0.xpi");
		String extensionId = driver.installExtension(path);
		
		driver.get("https://text-compare.com/");
		Thread.sleep(2500);
		
		driver.uninstallExtension(extensionId);
		
		driver.quit();	
	}
}
