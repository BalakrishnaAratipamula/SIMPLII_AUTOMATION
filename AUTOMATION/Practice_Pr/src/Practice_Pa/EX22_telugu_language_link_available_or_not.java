// write script to check “telugu” language link availability in Google home page before & after click on that link
package Practice_Pa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX22_telugu_language_link_available_or_not {
public static void main(String[] args) throws Exception {
	//to Initialize browser
	System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://google.co.in");
	driver.manage().window().maximize();
	
	//Before click on telugu link
	System.out.println("Before click on telugu link");
	int n =driver.findElements(By.linkText("తెలుగు")).size();
	if(n!=0) {
		System.out.println("number of telugu links are: "+n);
	}
	else {
		System.out.println("telugu link is invisible");
	}
	Thread.sleep(5000);
	
	//after click on telugu link
	System.out.println("After click on telugu link");
	driver.findElement(By.linkText("తెలుగు")).click();
	n = driver.findElements(By.linkText("తెలుగు")).size();
	if(n!=0) {
		System.out.println("number of telugu links are: "+n);
	}else {
		System.out.println("telugu link is invisible");
	}
	
	
}
}
