package ConstructorConcept;

class Illustration4 { //https://www.scaler.com/topics/java/this-and-super-keyword-in-java/

	int value = 5;

	// print method
	void print(Illustration4 obj) {
		System.out.println("value = " + obj.value);
	}

	void invoke() {
		// print method is invoked by passing 'this' as an argument
		print(this);
	}
}

public class thisIsUsedToPasseAsAnArgumentInaMethodCall {

	public static void main(String[] args) {
		// creating an instance of Illustration class
		Illustration4 obj = new Illustration4();
		obj.invoke();
	}
}
