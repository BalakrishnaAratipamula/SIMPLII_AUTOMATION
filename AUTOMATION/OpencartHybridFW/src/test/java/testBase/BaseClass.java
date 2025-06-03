package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	//Declaration part
	public static WebDriver driver;
	public static Logger logger; //Log4j2
	public Properties prop;

	@BeforeClass(groups= {"Sanity", "Regression", "Master"})
	public void loggerClassSetUpMethod() {
		//Log4j2 part
		logger = LogManager.getLogger(this.getClass());
	}
	 
	
	@BeforeTest(groups= {"Sanity", "Regression", "Master"})
	@Parameters({"os", "browser"})	//grouping.xml
	public void setUp(String os, String br) throws IOException {
		//Properties file reading part
		//Load the config.properties file
		FileReader file = new FileReader("./src//test//resources//config.properties");
		prop = new Properties();
		//to load the properties
		prop.load(file);
		
		//Log4j2 part
//		logger = LogManager.getLogger(this.getClass()); 
		
		//to choose the environment
		if(prop.getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities  capabilities = new DesiredCapabilities();
			
			//os
			if(os.equalsIgnoreCase("windows")) {
				capabilities.setPlatform(Platform.WIN11);
			} else if(os.equalsIgnoreCase("linux")) {
				capabilities.setPlatform(Platform.LINUX);
			} else if(os.equalsIgnoreCase("mac")) {
				capabilities.setPlatform(Platform.MAC);
			} else {
				System.out.println("No mactching 'OS'");
				return;
			}
			
			//browser
			switch(br.toLowerCase()) {
			case "chrome": 
				capabilities.setBrowserName("chrome");
				break;
			case "edge": 
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			case "firefox": 
				capabilities.setBrowserName("firefox");
				break;
			default:
				System.out.println("No matching browser");
				return;
			}
			
			
			try {
				driver = new RemoteWebDriver(new URL("XXXXXXXXXXXXXX"), capabilities.merge(capabilities));
			} catch(MalformedURLException e) {
				e.printStackTrace();
			}
		}
		
		if(prop.getProperty("execution_env").equalsIgnoreCase("local")) {
			switch(br.toLowerCase()) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			default:
				System.out.println("No matching browser");
				return;
			}
		}
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("appURL1"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest(groups = { "Sanity", "Regression", "Master" })
	public void tearDown() throws InterruptedException {
//		if(driver!=null) {
			Thread.sleep(3000);	
			driver.quit();
//		}
	}

	//generating Random Data
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5); //length - 5
		return generatedString; //can use for first & last names
	}
	
	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10); //length - 10
		return generatedNumber; //can use for phoneNum
	}
	
	public String randomAlphaNumeric() {
		String generateAlpha = RandomStringUtils.randomAlphabetic(4); //length - 4
		String generateNumeric = RandomStringUtils.randomNumeric(3);
		return (generateAlpha+ "@" +generateNumeric); //can use for email
	}
	
	
	//1. captureScreen - for Fail & Skip event
	public String captureScreenshotForFailSkipEvent(String tname) throws IOException{
		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		TakesScreenshot takesscreenshot = (TakesScreenshot)driver;
		File sourceFile = takesscreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath = System.getProperty("user.dir")+"\\Screenshots1"+tname+"_"+timeStamp+".png";	//System.getProperty("user.dir") - will return the user directory
		File targetFile = new File(targetFilePath); //for storing
		
		sourceFile.renameTo(targetFile); //overriding the name
		
		return targetFilePath;
	}
	
	
	//2. captureScreenshotOnExecution - Capture screenshot while executing the script - pass event 
	public static String captureScreenshotWhileExecutingTheScript(String screenshotNameWithExtension){
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots1/"+screenshotNameWithExtension);
		
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot stored in local machine");
		
		return destFile.getAbsolutePath(); //getAbsolutePath() - will return the whole path
	}
	
	
	/*/User defined methods to capture the BrowserName and BrowserVersion to pass into Extent html report
	public String[] getBrowserDetails() {
		//initializing the browser
		driver = new ChromeDriver();
		
		Capabilities browserCap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = browserCap.getBrowserName();
		String browserVersion = browserCap.getBrowserVersion();
		String[] browserDetails = {browserName, browserVersion};
		
		return browserDetails;
	} //*/
	
}
