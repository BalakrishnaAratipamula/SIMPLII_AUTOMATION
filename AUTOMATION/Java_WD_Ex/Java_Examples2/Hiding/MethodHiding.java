package Hiding;

//Base Class
class Base {
	public static void f1() {
		System.out.println("Base Class");
	}
}

//class child extend Demo class
class Child3 extends Base {
	public static void f1() {
		System.out.println("Child Class");
	}
}

public class MethodHiding {
	public static void main(String args[]) {
		Child3.f1();
	}
}
