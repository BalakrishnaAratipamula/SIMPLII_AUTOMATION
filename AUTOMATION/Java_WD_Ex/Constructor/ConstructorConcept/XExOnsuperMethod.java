package ConstructorConcept;

class Parent{
	public Parent() {
		System.out.println("parent constructor");
	}
}

class Child extends Parent{
	public Child() {
		super();	//We cannot use super() and this() keywords together in a constructor 
		System.out.println("child constructor");
	}
}

public class XExOnsuperMethod {
	public static void main(String[] args) {
		Child ch = new Child();
	}
}
