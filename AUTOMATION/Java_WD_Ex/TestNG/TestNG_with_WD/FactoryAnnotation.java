package TestNG_with_WD;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

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

public class FactoryAnnotation {
	@Factory
	public Object[] factoryMethod() {
		return new Object[] { new TestFactory("K1"), new TestFactory("K1") };
	}
}
