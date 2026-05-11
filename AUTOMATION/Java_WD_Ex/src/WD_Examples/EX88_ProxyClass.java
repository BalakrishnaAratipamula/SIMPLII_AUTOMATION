package WD_Examples;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EX88_ProxyClass {
	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myproxy:8080");

		ChromeOptions options = new ChromeOptions();
		options.setProxy(proxy);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://example.com");
	}
}
