package E2Default_AM;

public class A {
	//default method
	void msg() {
		System.out.println("Selenium WebDriver");
	}
}

class A2{
	void msg2() {
		System.out.println("msg2() method from 'A2' class");
		A obj = new A();
		obj.msg(); //here we don't get any compile time error bcz Default members are visible to all classes inside same package
	}
}


