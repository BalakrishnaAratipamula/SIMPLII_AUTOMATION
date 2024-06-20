package Constructor_Chaining;

class Parent {

	Parent() {
		System.out.println("Parent class no argument constructor");
	}

	Parent(String s) {
		System.out.println("Parent class parameterized " + s);
	}
}

// Child class extends parent class
class Child extends Parent {

	Child() {
		// referring current class parameterized constructor
		/////// System.out.println("Child class no-argument constructor."); --- not allow bcz constructor calls must be the first statement
		/////// this(); --- not allow bcz constructor calls must be the first statement
		this("constructor.");
		System.out.println("Child class no-argument constructor.");
	}

	Child(String s) {
		// referring parent class parameterized constructor
		super("constructor.");
		System.out.println("Child class parameterized " + s);
	}
}

public class SimpleConstructoeChaining {

	public static void main(String[] args) {
		// instance of child class
		Child obj = new Child();
	}
}
