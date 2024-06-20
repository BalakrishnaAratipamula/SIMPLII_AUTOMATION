package ConstructorConcept;

class Illustration5 {   //https://www.scaler.com/topics/java/this-and-super-keyword-in-java/

	Illustration5 getIllustration() {
		// returing the instance of current class
		return this;
	}

	void print() {
		System.out.println("Hello World!");
	}
}

public class thisIsUsedToReturnTheCurrentClassInstanceValue {

	public static void main(String[] args) {
		new Illustration5().getIllustration().print(); //getIllustratio() - method returns the current class instance
	}
}
