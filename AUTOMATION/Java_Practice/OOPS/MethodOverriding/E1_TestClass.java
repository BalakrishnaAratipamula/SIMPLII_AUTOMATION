package MethodOverriding;

class ClassA {
	void add() {
		System.out.println("ClassA method is calling");
	}
}

//main
public class E1_TestClass extends ClassA{
	//Overridden method
	void add() {
		System.out.println("E1_TestClass method is calling");
	}
	
	public static void main(String[] args) {
		E1_TestClass obj = new E1_TestClass();
		obj.add();
	}
}

