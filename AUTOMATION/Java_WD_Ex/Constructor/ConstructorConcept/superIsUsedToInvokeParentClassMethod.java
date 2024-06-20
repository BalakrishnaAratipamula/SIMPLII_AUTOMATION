package ConstructorConcept;

class Parent3 {
	void display() {
		System.out.println("Hi I am parent class method.");
	}
}

class Child3 extends Parent3 {
	void display() {
		System.out.println("Hi I am child class method.");
	}

	void print() {
		// invoking display method from parent class
		super.display();
		// display method from child class
		display();
	}
}

public class superIsUsedToInvokeParentClassMethod {

	  public static void main(String[] args) {
	    // creating instance of child class
	    Child3 obj = new Child3();
	    obj.print();
	  }
	}
