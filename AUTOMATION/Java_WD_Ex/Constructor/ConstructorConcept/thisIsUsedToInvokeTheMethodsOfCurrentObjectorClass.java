package ConstructorConcept;

class Illustration2 { //https://www.scaler.com/topics/java/this-and-super-keyword-in-java/

	void scaler() {
		System.out.print("Java is ");
	}

	void name() {
		this.scaler(); //invoking current class method
		System.out.println("OOPL");
	}
}

public class thisIsUsedToInvokeTheMethodsOfCurrentObjectorClass {

	public static void main(String[] args) {
		// creating an instance of Illustration class
		Illustration2 obj = new Illustration2();
		obj.name();
	}
}
