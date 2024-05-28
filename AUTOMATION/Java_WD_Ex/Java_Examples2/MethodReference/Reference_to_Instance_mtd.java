package MethodReference;

interface Sayable2 {
	void say();
}

public class Reference_to_Instance_mtd {
	public void saySomething() {
		System.out.println("non-static method calling");
	}

	public static void main(String[] args) {
		// Approach 1
		// Referring non-static method
		Reference_to_Instance_mtd obj = new Reference_to_Instance_mtd(); 
		Sayable2 sayable = obj::saySomething;
		// Calling interface method
		sayable.say();
		// calling overridden method using Lambda Exp - below approach will work bcz it Functional Interface
		Sayable2 sayable3 = () -> System.out.println("Overriden method called");
		sayable3.say();
		
		
		// Approach 2
		// Referring non-static method using anonymous object
		Sayable2 sayable2 = new Reference_to_Instance_mtd()::saySomething; // You can use anonymous object also
		// Calling interface method
		sayable2.say();
		// calling overridden method using Lambda Exp - below approach will work bcz it Functional Interface
		Sayable2 sayable33 = () -> System.out.println("Overriden method called");
		sayable33.say();
	}
}