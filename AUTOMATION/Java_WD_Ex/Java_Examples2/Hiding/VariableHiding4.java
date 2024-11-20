package Hiding;

class SuperClass {
	int num = 100; // Superclass variable
}

class SubClass extends SuperClass {
	int num = 200; // Subclass variable
}

public class VariableHiding4 {
	public static void main(String[] args) {
		SuperClass superClassRef = new SuperClass();
		SubClass subClassRef = new SubClass();
		SuperClass superClassToSub = new SubClass();

		System.out.println("superClassRef.num = " + superClassRef.num); // Accesses SuperClass's num
		System.out.println("subClassRef.num = " + subClassRef.num); // Accesses SubClass's num
		System.out.println("superClassToSub.num = " + superClassToSub.num); // Accesses SuperClass's num
	}
}
