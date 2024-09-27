package WD_Examples;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class EX59_Practice_iFrame_Maps_EReport {

	public static WebDriver driver;
	public static String state = "new-mexico"; // won't work with 'florida' bcz an appln error

	public static void main(String[] args) throws Exception {
		ExtentReports extentreports = new ExtentReports();
		File file = new File("reports.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		extentreports.attachReporter(sparkreporter);

		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications-");

		driver = new ChromeDriver(ops);
		driver.navigate().to("https://petdiseasealerts.org/forecast-map");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		ExtentTest test1 = extentreports.createTest("TestCase 1", "Log level description 1");
		test1.info("---URL opened---")
		.addScreenCaptureFromPath(captureScreenshot("1.jpg"), "#1");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)", "");
		
		List<WebElement> totalframes = driver.findElements(By.tagName("iframe")); // (or) tagName("iframe")
		// Switch to Frame by WebElement
		WebElement iframeelement = driver.findElement(By.xpath("//*[@class='capc-map-embed mode-widget']/iframe"));
		System.out.println("Number of frames are: " + totalframes.size());

		Thread.sleep(2000);
		driver.switchTo().frame(iframeelement); // Switch to Frame by WebElement
		Thread.sleep(3000);

		List<WebElement> states = driver.findElements(By.xpath("//*[@class='region']"));
		System.out.println("States Count:  " + states.size());
		for (WebElement stateNames : states) {
			String listOfStateNames = stateNames.getAttribute("id");
			System.out.println(listOfStateNames);
		}
		test1.info("---States List Printed---")
		.addScreenCaptureFromPath(captureScreenshot("2.jpg"), "#2");

		for (WebElement stateNames : states) {
			String listOfStateNames = stateNames.getAttribute("id");
			if (listOfStateNames.equals(state)) {
				stateNames.click();
				Thread.sleep(10000);
				System.out.println("Given state:  " + state + "\nClicked state: " + listOfStateNames);
				test1.info("---Clicked on ### " + state + " ### State---")
				.addScreenCaptureFromPath(captureScreenshot("3.jpg"), "#3");

			}
		}

		Thread.sleep(1000);
		extentreports.flush();
		driver.close();
		Desktop.getDesktop().browse(new File("reports.html").toURI());
	}

	// 1. To capture screenshot and store it in Local machine
	public static String captureScreenshot(String fileName) throws InterruptedException {
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Screenshots/" + fileName);
		try {
			FileUtils.copyFile(sourceFile, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot - To capture screenshot and store it in Local machine");
		return destFile.getAbsolutePath();
	}

}
