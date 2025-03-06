package Automation.SeleniumAutomation;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class E29_FileUpload_using_AutoIT {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Select WORD files")).click();
		Thread.sleep(10000);

		//to call .exe (AutoIT script file) file
		Runtime.getRuntime().exec("E:\\AutoIT\\file.exe");
		
		// validating whether right file is selected or not
		String fileNameText = driver.findElement(By.cssSelector(".file__info__name")).getText();
		String actualFileName = "Simple.docx";
		if (fileNameText.trim().equals(actualFileName))
			System.out.println("*****File uploaded successfully****");
		else
			System.out.println("*****File doesn't uploaded****");

		Thread.sleep(5000);
		driver.quit(); //*/
	}
}

/*/ Steps: SciTe editor script (write the script)--> save it with .au3 extension --> go to file explorer --> RC on file --> show more options --> compile script (*64) 

;To focus on "File Name" edit box
ControlFocus("Open", "", "Edit1")
;To enter file path
ControlSetText("Open", "", "Edit1", "E:\AutoIT\Simple.docx" )
;To pause execution
Sleep(5000)
;To click on "open" button
ControlClick("Open", "",  "Button1")

//*/