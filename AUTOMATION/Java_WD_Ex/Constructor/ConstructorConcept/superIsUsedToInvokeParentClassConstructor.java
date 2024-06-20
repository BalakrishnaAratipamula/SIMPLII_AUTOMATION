package ConstructorConcept;

class Parent5 {

	// parent class constructor
	Parent5() {
		System.out.println("Hi I am Parent class constructor.");
	}
}

// child class extending parent class
class Child5 extends Parent5 {

	// child class constructor
	Child5() {
		// invoking parent class constructor
		super();
	}
}

public class superIsUsedToInvokeParentClassConstructor {

	public static void main(String[] args) {
		// creating instance of child class
		Child5 obj = new Child5();
	}
}
