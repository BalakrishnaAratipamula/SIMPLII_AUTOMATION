package Static_nd_NonStatic;

class Example {
	int a = 10; // non-static variable
	static int b = 20; // static variable

	void show() {
		System.out.println("This is non-static show()");
	}

	static void staticShow() {
		System.out.println("This is static staticShow()");
	}
	
	void display() { // non-static method
		System.out.println(a); // can access non-static variable
		System.out.println(b); // can access static variable
		show(); // can call non-static method
		staticShow(); // can call static method
	}
}

public class EX_static_nd_nonstatic {
	public static void main(String[] args) {
		Example e = new Example();
		e.display();
	}
}