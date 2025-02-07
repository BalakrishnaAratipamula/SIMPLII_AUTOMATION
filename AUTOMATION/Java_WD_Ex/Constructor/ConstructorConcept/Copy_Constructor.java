package ConstructorConcept;

public class Copy_Constructor {

	String name;
	int age;

	Copy_Constructor(String n, int a) { // constructor 1
		this.name = n;
		this.age = a;
	}

	Copy_Constructor(Copy_Constructor p) { // constructor 2
		this.name = p.name;
		this.age = p.age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Copy_Constructor cc1 = new Copy_Constructor("john", 32); // constructor 1
		Copy_Constructor cc2 = new Copy_Constructor(cc1); // constructor 2
	}
}
