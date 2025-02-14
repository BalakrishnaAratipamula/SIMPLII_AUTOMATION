package RuntimeP_or_MethodOverridingE2;

class Parent {
	
	public void setUp() {
		System.out.println("setUp()......from parentClass");
	}
	
	public void tearDown() {
		System.out.println("tearDown()......from parentClass");
	}
}

class Child extends Parent {
	
	public void userLogin() {
		System.out.println("userLogin().....from childClass");
	}
}

public class GrandChild extends Child {

	public void setUp() {
		super.setUp();  //It will call parent class method //must need to extend parent class
		System.out.println("setUp()......from TestClass");
	} 

	public void userLogin() {
		System.out.println("userLogin()......from TestClass");
	}

	public static void main(String[] args) {
		GrandChild obj = new GrandChild();
		obj.setUp(); //A1ParClass(bcz 'super'), TC
		obj.userLogin(); //TC
		obj.tearDown(); //A1ParClass
	}
}
