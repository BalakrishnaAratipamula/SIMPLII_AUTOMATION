package Constructor_Chaining;

class Parent {
	Parent() {
		this("constructor."); //at this step will call the matching parameterized constructor available in same class
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
		///@//// System.out.println("Child class no-argument constructor."); --- not allow bcz constructor calls must be the first statement
		///@//// this(); --- not allow bcz constructor calls must be the first statement
		this("constructor."); //at this step will call the matching parameterized constructor available in same class
		System.out.println("Child class no-argument constructor.");
	}

	Child(String s) {
		// referring parent class parameterized constructor
		super("constructor.");	//at this step will call the matching parameterized constructor available in Parent class
		System.out.println("Child class parameterized " + s);
	}

}

public class SimpleConstructoeChaining {
	public static void main(String[] args) {
		// instance of child class
//		Child cc = new Child(); //Execution 1
		Parent pp = new Parent(); //Execution 2
	}
}
