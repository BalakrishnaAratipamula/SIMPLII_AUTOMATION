package ConstructorConcept;

class Illustration3 { //https://www.scaler.com/topics/java/this-and-super-keyword-in-java/

	Illustration3() {
		this(10); // invoking parameterized constructor
	}

	Illustration3(int x) {
		System.out.println("Current class parameterized constructor invoked.");
		System.out.println("Number is : " + x);
	}
}

public class thisIsUsedToinvokeCurrentClassConstructor {

	public static void main(String[] args) {
		// creating an instance of Illustration class
		Illustration3 obj = new Illustration3();
	}
}
