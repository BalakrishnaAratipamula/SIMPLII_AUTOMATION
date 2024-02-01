package WD_Examples;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX50_find_BrokenImages { ///// -----https://youtu.be/6NXZQYs-Eig (other method 'jsup' also there
										///// )////image is not loaded properly is called broken images

	// no need to create the object bcz sub method is static method
	public static void main(String[] args) throws InterruptedException {
		// to initialize browser
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.theworldsworstwebsiteever.com/");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		// to get links information
		List<WebElement> images = driver.findElements(By.tagName("img"));// tagName 'a' is common for all links
		System.out.println("num of language images are: " + images.size());

		for (WebElement image : images) {
			String img = image.getAttribute("src"); // 'src' is common to all images
			verifyBrokenImage(img);
		}

		driver.close();

	}

	public static void verifyBrokenImage(String imgUrl) { /////////////// same as links
		try {
			URL url = new URL(imgUrl);
			HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection(); // to create connection by
																							// using URL connection
			httpurlconnection.setConnectTimeout(5000); // to set timeout
			httpurlconnection.connect(); // to connect image link

			// to print 200-OK, 401-Unauthorized
			if (httpurlconnection.getResponseCode() == 200) {
				System.out.println(imgUrl + "  -  " + httpurlconnection.getResponseCode() + "  -  "
						+ httpurlconnection.getResponseMessage()); // by default will get response message as 'OK'
			} else { // if response code is not equal to '200' /////'err' to print error msg in RED
						// colour
				System.err.println(imgUrl + "  -  " + httpurlconnection.getResponseCode() + "  -  "
						+ httpurlconnection.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND); // by default if link not found will get response message as'Not Found'
			}
		} catch (Exception e) {
			System.err.println(imgUrl);
		}
	}

}
