package TestNG_ParallelExecutionWithDelays_usingXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

//@If you want to run the test script in diff browser with time differences How to do that?
//M1: Sequentially (One After Another with Time Gap)(below Ex) ref: Java_WD_Ex\src\WD_Examples\EX76_RunTestSCript_inDiffBrowser_withTimeDiff
//M2: ref: Java_WD_Ex\TestNG\TestNG_ParallelExecutionWithDelays
//M3: ref: Java_WD_Ex\TestNG\TestNG_ParallelExecutionWithDelays_usingXML (below Ex)
public class ParallelExecutionWithDelays {
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) throws InterruptedException {
	    if (browser.equalsIgnoreCase("chrome")) {
	        driver = new ChromeDriver();
	        Thread.sleep(0);
	    } else if (browser.equalsIgnoreCase("firefox")) {
	        driver = new FirefoxDriver();
	        Thread.sleep(5000); // delay before launching
	    }
	}
}
