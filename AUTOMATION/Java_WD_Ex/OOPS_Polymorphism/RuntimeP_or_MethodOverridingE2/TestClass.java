package RuntimeP_or_MethodOverridingE2;

public class TestClass extends A2Chclass {

	public void setUp() {
		super.setUp();  //It will call parent class method //must need to extend parent class
		System.out.println("setUp()......from TestClass");
	} 

	public void userLogin() {
		System.out.println("userLogin()......from TestClass");
	}

	public static void main(String[] args) {
		TestClass obj = new TestClass();
		obj.setUp(); //A1ParClass, TC
		obj.userLogin(); //TC
		obj.tearDown(); //A1ParClass
	}
}
