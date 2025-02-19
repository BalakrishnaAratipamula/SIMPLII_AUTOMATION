package RuntimeP_or_MethodOverridingE5_RealTimeEx;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1_MobileTest extends E1_BaseClass {
    @Override
    public void setUp() {
        driver = new ChromeDriver();  // Assume Chrome is used for mobile testing
        driver.manage().window().setSize(new Dimension(375, 812)); // iPhone X size
        
        driver.get("https://google.co.in/");
    }
    
    public static void main(String[] args) throws InterruptedException {
    	/*/to call child class overridden methods
    	E1_MobileTest obj = new E1_MobileTest();
    	obj.setUp();
    	Thread.sleep(3000);
    	obj.tearDown();
    	System.out.println("----Done---"); //*/
    	
    	//to call parent class methods
    	E1_BaseClass obj = new E1_BaseClass();
    	obj.setUp();
    	Thread.sleep(3000);
    	obj.tearDown();
    	System.out.println("----Done---"); //*/
       
	}
}
