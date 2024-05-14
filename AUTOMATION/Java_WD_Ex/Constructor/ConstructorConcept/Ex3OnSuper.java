package ConstructorConcept;

class Fruit{
	int x=12;
	void print() {	//Overriding is possible with non-ststic methods
		System.out.println("Fruit Class");
	}
}

class Mango extends Fruit{
	void demo() {
		System.out.println("Mango class");
		System.out.println(super.x);
		super.print();
	}
}

public class Ex3OnSuper {
	public static void main(String[] args) {
		Mango derived = new Mango();
		derived.demo();
	}
}


