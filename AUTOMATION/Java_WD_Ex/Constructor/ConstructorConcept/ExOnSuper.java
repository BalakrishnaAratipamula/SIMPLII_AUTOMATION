package ConstructorConcept;

class Base{
	void print() {	//Overriding is possible with non-ststic methods
		System.out.println("Base Class");
	}
}

class Derived extends Base{
	void print() {
		super.print();	//super() is used to call Parent class constructors, methods and fields
		System.out.println("Derived class");
	}
}

public class ExOnSuper {
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.print();
	}
}
