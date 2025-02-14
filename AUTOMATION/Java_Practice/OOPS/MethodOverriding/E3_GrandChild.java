package MethodOverriding;

//class
class Prarent {
	public void setUp() {
		System.out.println("setUp().....from parent class");
	}

	void tearDown() {
		System.out.println("tearDown().....from parent class");
	}
}

//parent - child - grand child
//class
class Child extends Prarent {
	void userLogin() {
		System.out.println("userLogin().....from child class");
	}
}

//main
public class E3_GrandChild extends Child{ 
	public void setUp() {
		super.setUp();
		System.out.println("setUp().....from TestClass class");
	}
	
	void userLogin() {
		System.out.println("userLogin().....from TestClass class");
	}
	
	public static void main(String[] args) {
		E3_GrandChild obj = new E3_GrandChild();
		obj.setUp(); //E3_TestClass
		obj.userLogin(); //E3_TestClass
		obj.tearDown(); //A1PrClass
	}
}
