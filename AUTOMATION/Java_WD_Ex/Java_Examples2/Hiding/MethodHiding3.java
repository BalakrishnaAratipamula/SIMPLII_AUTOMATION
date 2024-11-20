package Hiding;

class SuperClass3 {
	static void display() {
		System.out.println("Static method in SuperClass");
	}
}

class SubClass3 extends SuperClass3 {
	static void display() {
		System.out.println("Static method in SubClass");
	}
}

public class MethodHiding3 {
	public static void main(String[] args) {
		SuperClass3 superClassRef = new SuperClass3();
		SuperClass3 superClassToSub = new SubClass3();
		SubClass3 subClassRef = new SubClass3();

		superClassRef.display(); // Calls SuperClass's static method
		superClassToSub.display(); // Calls SuperClass's static method
		subClassRef.display(); // Calls SubClass's static method
	}
}
