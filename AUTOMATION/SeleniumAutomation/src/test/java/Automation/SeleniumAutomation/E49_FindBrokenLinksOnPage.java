package Automation.SeleniumAutomation;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E49_FindBrokenLinksOnPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to get links information
		List<WebElement> links = driver.findElements(By.tagName("a")); //a - is common tag for all links
		System.out.println("Number of Links are:  "+links.size());
		
		//to read 'href' attribute value
		for(int i=0; i<links.size(); i++) {
			String linkUrl = links.get(i).getAttribute("href");
			
			verifyLinkActive(linkUrl);
		}
		
		Thread.sleep(5000);
		driver.quit();
	}
	
	//to validate the response
	public static void verifyLinkActive(String linkUrl) {
		try { //if we get any exception i don't want to terminate the program
			//to capture the URL
			URL url = URI.create(linkUrl).toURL(); //URL is the sub set of URI / URI is the parent for URL
			//to connect with URL
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			httpurlconnection.setConnectTimeout(3500); //timeout value between links before connecting
			httpurlconnection.connect();
			
			//to print 200-OK, 401-Unauthorized
			if(httpurlconnection.getResponseCode() == 200) 
				System.out.println(linkUrl+" - "+httpurlconnection.getResponseCode()+" - "+httpurlconnection.getResponseMessage());
			else
				System.err.println(linkUrl+" - "+httpurlconnection.getResponseCode()+" - "+httpurlconnection.getResponseMessage());

		} catch(Exception e) {
			System.err.println(linkUrl);
		}
	} 
}
