package SubClass_nd_InnerClass;

class SuperClass {

	void print() {
		System.out.println("Inside Super Class");
	}
}

class SubClass extends SuperClass {

	void print() {
		System.out.println("Inside Sub Class");
	}
}

public class SubClass_Demo {
	public static void main(String[] args) {
		SubClass sub = new SubClass();

		sub.print();
	}
}
