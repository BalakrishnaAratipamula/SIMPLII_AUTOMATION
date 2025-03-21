package TestNG_with_WD;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
/*@Factory is a TestNG annotation used in dynamic execution of Test cases. By this we can pass parameters to whole test class at run time. 
 That passed parameters can be used by one or more test methods of that class. */

/*/ Exec 1: Simple Factory Using @Factory
class TestFactory {
	private String str;

	public TestFactory(String str) {
		this.str = str;
	}

	@Test
	public void testMethod() {
		System.out.println(str);
	}
}

public class E12_FactoryAnnotation {
	@Factory  
	public Object[] factoryMethod() {
		return new Object[] { new TestFactory("K1"), new TestFactory("K2") };
	} 
} //*/


/*/Exec 2: Simple Factory Using @Factory
class TestFactory {
	private int number;

    // Constructor to accept the data
    public TestFactory(int number) {
        this.number = number;
    }

    @Test
    public void testMethod() {
        System.out.println("Test executed with number: " + number);
    }
    
public static class E12_FactoryAnnotation {
        @Factory
        public Object[] factoryMethod() {
            return new Object[] {
                new TestFactory(1),
                new TestFactory(2),
                new TestFactory(3),
                new TestFactory(4)
            };
        }
    } 
} //*/


//Exec 3: Using Data Providers with @Factory
public class E12_FactoryAnnotation {

    private String browser;
    private String version;

    public E12_FactoryAnnotation(String browser, String version) {
        this.browser = browser;
        this.version = version;
    }

    @Test
    public void testMethod() {
        System.out.println("Testing on Browser: " +browser+ ", Version: " +version);
    }

    public static class TestFactory {
        @DataProvider(name = "browserData")
        public static Object[][] getData() {
            return new Object[][] {
                {"Chrome", "120"},
                {"Firefox", "118"},
                {"Edge", "115"}
            };
        }

        @Factory(dataProvider = "browserData")
        public Object[] createInstances(String browser, String version) {
            return new Object[] { new E12_FactoryAnnotation(browser, version) };
        }
    }
}
