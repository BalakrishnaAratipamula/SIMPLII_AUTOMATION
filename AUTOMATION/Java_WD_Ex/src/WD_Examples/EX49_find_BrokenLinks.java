package WD_Examples;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX49_find_BrokenLinks { /////////////////////////// -------- https://youtu.be/WyheLWhk6QE
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); //try- https://www.theworldsworstwebsiteever.com/
		driver.manage().window().maximize();
		
		// to get links information
		List<WebElement> links = driver.findElements(By.tagName("a")); // tagName 'a' or 'link' is common for all links
		System.out.println("num of links are: " + links.size());

		for (int i = 0; i < links.size(); i++) {
			String linkUrl = links.get(i).getAttribute("href"); // href - bcz every link having 'href' attribute (by inspecting any 3 links and take common one)
			verifyLinkActive(linkUrl);	
		}
		driver.quit();
	}

	// method to validate the response
	public static void verifyLinkActive(String linkUrl) {
		try {
			URL url = URI.create(linkUrl).toURL(); //(or) new URI(linkUrl).toURL();		//new URL(linkUrl) ----> this is deprecated
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection(); // to create connection by using URL connection
			httpurlconnection.setConnectTimeout(3500); // to set timeout
			httpurlconnection.connect(); // to connect link

			// to print 200-OK, 401-Unauthorized
			if (httpurlconnection.getResponseCode() == 200) {
				System.out.println(linkUrl + "  -  " + httpurlconnection.getResponseCode() + "  -  "
						+ httpurlconnection.getResponseMessage()); // by default will get response message as 'OK'
			}
			// if response code is not equal to '200'
			else { // if response code is not equal to '200' /////'err' to print error msg in RED colour
				System.err.println(linkUrl + "  -  " + httpurlconnection.getResponseCode() + "  -  "
						+ httpurlconnection.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND); // by default if link not found will get response message as 'Not Found'
			}
		} catch (Exception e) {
			System.err.println(linkUrl);
		}

	}

}
