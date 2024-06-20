package ConstructorConcept;

class Parent2 {

	int a = 50;
	String s = "String from Parent class";
	void dis(){
		System.out.println("parent class method");
	}
	Parent2(){
		System.out.println("parent class constructor");
	}
}

class Child2 extends Parent2 {

	int a = 100;
	String s = "String from Child class";
	void dis2(){
		System.out.println("child class method");
	}
	
	Child2(){
		super();
	}
	void print() {
		// referencing to the instance variable of parent class
		System.out.println("Number from parent class is : " + super.a);
		System.out.println("String from parent class is : " + super.s);
		// referencing to the parent class method
		super.dis();

		
		// printing a and s of the current/child class
		System.out.println("Number from child class is : " + a);
		System.out.println("String from child class is : " + s);
		this.dis2();
	}
}

public class superIsUsedToReferParentClassInstanceVar {

	public static void main(String[] args) {
		// creating instance of child class
		Child2 obj = new Child2();
		obj.print();
	}
}
