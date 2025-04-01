package ExtentReports_V5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

public class T001_AccountRegistration extends BaseClass1{
	@Test
	public void verify_account_registration() throws InterruptedException {
		String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println("Executing methodName:  "+methodName);
		ExtentTest test = ExtentReportManager.captureScreenshotOnExecution(methodName);
		
//		try {
//			driver = new ChromeDriver(); //initialization done at 'BaseClass1.getBrowserDetails()'
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			test.addScreenCaptureFromPath(captureScreenshot("HomePage.jpg"), "@@HomePage");
			//myAccount
			driver.findElement(By.xpath("(//*[text()='My Account'])[1]")).click();
			test.addScreenCaptureFromPath(captureScreenshot("MyAccountLinkClicked.jpg"), "@@MyAccountLinkClicked");
			
			//Registor
			driver.findElement(By.xpath("(//*[text()='Register'])[1]")).click();
			test.addScreenCaptureFromPath(captureScreenshot("RegistorPage.jpg"), "@@RegistorPage Before Fill");
			Thread.sleep(2000);
			
			//Intentionally i'm Failing the script
//			Assert.fail("Intentionally i'm Failing the script");
			
			/*/Intentionally i'm Skipping the script
			boolean skipTest = true;
			if(skipTest) {
				throw new SkipException("Condition is met, so Skipping the Test");
			}
			System.out.println("Test is running"); //*/
			
			
			//Navigating back to HomePage
			driver.navigate().back();
			test.addScreenCaptureFromPath(captureScreenshot("Navigating_Back_to_HomePage.jpg"), "@@Navigating back to HomePage");
//		} catch(Exception e) {
//			Assert.fail("Test Failed:  "+e.getMessage());
//		} finally {
//			Thread.sleep(3000);
//			driver.quit();
//		}
	}
}
