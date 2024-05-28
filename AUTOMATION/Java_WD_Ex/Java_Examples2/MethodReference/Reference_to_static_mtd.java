package MethodReference;

interface Sayable {
	void say();
}

public class Reference_to_static_mtd {
	public static void saySomething() {
		System.out.println("Static method called");
	}

	public static void main(String[] args) {
		// Referring static method
		Sayable sayable = Reference_to_static_mtd::saySomething;
		
		// Calling interface method
		sayable.say();
		
		// calling overridden method using Lambda Exp - below approach will work bcz it Functional Interface
		Sayable sayable2 = () -> System.out.println("Overriden method called");
		sayable2.say();
		
	}

}
