package WD_Examples;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
//https://youtu.be/15-ayP0sukA?si=0dJ7MbrtB0qVjYoj
//https://www.youtube.com/watch?v=vmwc_TK07SU --- Must try for one more practice url
public class EX64_DownloadFiles { 
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//pre: EX65_ADsBlocking_nd_AddExtensionsToWdLaunchedBrowser
		
		String browser = "Chrome";
		String fileType = "PDF"; // "DOC, DOCX", "XLS, XLSX".....
		String filePathinLD = "F:\\file_download_using_WD";
		
		switch(browser.toUpperCase()){
		case "CHROME":
			//--------Execute in ChromeBrowser
			ChromeOptions ops = new ChromeOptions();
			File file = new File("E:\\CRX\\uBlock.crx");
			ops.addExtensions(file); //to add Extensions while WD launching the browser
			
			HashMap<String, Object> prefs = new HashMap<>(); //prefs - preferences
			prefs.put("plugins.always_open_pdf_externally", true); //without open pdf preview before it download // false-open in preview mode
			prefs.put("download.default_directory", filePathinLD); //to download file in custom dir:
																				   //if didn't give this cmd the file will download in default browser download path
			ops.setExperimentalOption("prefs", prefs); //to set this options to browser
			
			driver = new ChromeDriver(ops); 
			break;
			//*/
		case "EDGE":
			//--------Execute in EdgeBrowser 
			//before Selenium 4.0.0v we have to add one dependency to handle this type of download
			//i.e. https://github.com/microsoft/edge-selenium-tools  copy dependency from this path
			EdgeOptions ops2 = new EdgeOptions();
			File file2 = new File("E:\\CRX\\uBlock.crx");
			ops2.addExtensions(file2); //to add Extensions while WD launching the browser
			
			HashMap<String, Object> prefs2 = new HashMap<>(); //prefs - preferences
			prefs2.put("plugins.always_open_pdf_externally", true); //without open pdf preview before it download // false-open in preview mode
			prefs2.put("download.default_directory", filePathinLD); //to download file in custom dir:
																				   //if didn't give this cmd the file will download in default browser download path
			ops2.setExperimentalOption("prefs", prefs2); //to set this options to browser
			
			driver = new EdgeDriver(ops2); 
			break;
			//*/
		case "FIREFOX":
			//--------Execute in FirefoxBrowser 
			FirefoxOptions ops3 = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			
			//http://kb.mozillazine.org/About:config_entries --- below arguments captured from this site
			profile.setPreference("pdfjs.disabled", true); //file type PDF
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); //To neverAsk.saveToDisk through pop-up while pdf file is opening
			profile.setPreference("browser.download.dir", filePathinLD); //to specify custom file download path
			profile.setPreference("browser.download.folderList", 2); //0: the desktop
			//														 //1: (default): the downloads folder
			//														 //2: the last folder specified for a download 
			
			ops3.setProfile(profile);
			
			driver = new FirefoxDriver(ops3);
			
			Path path = Paths.get("E:\\ExtensionLink\\ublock_origin-1.60.0.xpi");
			((FirefoxDriver) driver).installExtension(path); //Ref: EX65_ADsBlocking_nd_AddExtensionsToWdLaunchedBrowser
			break;
			//*/
		}
		
		
		driver.get("https://file-examples.com/");
		//(OR-try this URL for Ex practice) https://www.telerik.com/try/telerik-testing-framework
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);

		WebElement docBrowse = driver.findElement(By.xpath("//h3[text()='Documents']/following-sibling::a")); //// *[text()='Documents']/following-sibling::a
		System.out.println(docBrowse.isEnabled());
		
		if(browser.equalsIgnoreCase("Edge")||browser.equalsIgnoreCase("Chrome")) { //|| EDGE
			new Actions(driver).scrollToElement(docBrowse).build().perform(); //comment when browser is FF only 
		}
		
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("window.scrollBy(0,200)"); // to scrolldown
		
		String title = driver.getTitle();
		docBrowse.click();
		Thread.sleep(8000);
		if(browser.equals("Chrome")) {
			new Actions(driver).scrollToElement(docBrowse).perform(); //comment when browser is FF only
		}
		if(title.equals(driver.getTitle())) {
			System.out.println(docBrowse.isEnabled());
			docBrowse.click();
		}
		
		driver.findElement(By.xpath("//*[text()='"+ fileType +"']/following-sibling::td[2]/a")).click();
		driver.findElement(By.xpath("//a[starts-with(text(), 'Download sample')]")).click();

		Thread.sleep(8000);
		driver.quit();
		
		Desktop.getDesktop().browse(new File(filePathinLD).toURI());
	}
}
