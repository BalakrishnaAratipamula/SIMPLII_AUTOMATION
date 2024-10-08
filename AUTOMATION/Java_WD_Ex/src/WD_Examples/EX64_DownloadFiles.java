package WD_Examples;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EX64_DownloadFiles {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		String fileType = "PDF"; // "DOC, DOCX", "XLS, XLSX".....
		
		/*/--------Execute in ChromeBrowser
		ChromeOptions ops = new ChromeOptions();
		File file = new File("E:\\CRX\\uBlock.crx");
		ops.addExtensions(file); //to add Extensions while WD launching the browser
		
		HashMap<String, Object> prefs = new HashMap<>(); //prefs - preferences
		prefs.put("plugins.always_open_pdf_externally", true); //without open pdf preview before it download // false-open in preview mode
		prefs.put("download.default_directory", "F:\\file_download_using_WD"); //to download file in custom dir:
																			   //if didn't give this cmd the file will download in default browser download path
		ops.setExperimentalOption("prefs", prefs); //to set this options to browser
		
		driver = new ChromeDriver(ops); //*/
		
		
		/*/--------Execute in EdgeBrowser 
		 * //before Selenium 4.0.0v we have to add one dependency to handle this type of download
		 * i.e. https://github.com/microsoft/edge-selenium-tools  copy dependency from this path
		 *//*
		EdgeOptions ops = new EdgeOptions();
		File file = new File("E:\\CRX\\uBlock.crx");
		ops.addExtensions(file); //to add Extensions while WD launching the browser
		
		HashMap<String, Object> prefs = new HashMap<>(); //prefs - preferences
		prefs.put("plugins.always_open_pdf_externally", true); //without open pdf preview before it download // false-open in preview mode
		prefs.put("download.default_directory", "F:\\file_download_using_WD"); //to download file in custom dir:
																			   //if didn't give this cmd the file will download in default browser download path
		ops.setExperimentalOption("prefs", prefs); //to set this options to browser
		
		driver = new EdgeDriver(ops); //*/
		
		
		
		//--------Execute in FirefoxDriver 
		FirefoxOptions ops = new FirefoxOptions();
		FirefoxProfile profile = new FirefoxProfile();
		File file = new File("E:\\CRX\\uBlock.crx");
		profile.addExtension(file);
		profile.setPreference("extensions.uBlock.currentVersion", "1.60.0");
		
		profile.setPreference("pdfjs.disabled", true);
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		profile.setPreference("browser.download.dir", "F:\\file_download_using_WD");
		profile.setPreference("browser.download.folderList", 2);
		
		ops.setProfile(profile);
		
		driver = new FirefoxDriver(ops);
		
		driver.get("https://file-examples.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);

		WebElement docBrowse = driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")); //// *[text()='Documents']/following-sibling::a
		System.out.println(docBrowse.isEnabled());
		new Actions(driver).scrollToElement(docBrowse).perform();
		
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollBy(0,200)"); // to scrolldown

		docBrowse.click();
		Thread.sleep(8000);
		new Actions(driver).scrollToElement(docBrowse).perform();
		docBrowse.click();
	    
		driver.findElement(By.xpath("//*[text()='"+ fileType +"']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(), 'Download sample')]")).click();

//		driver.quit();
	}
}
