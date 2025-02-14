package Types_Of_Inheritance;

class ParentA{
	void display() {
		System.out.println("the ParentA is calling");
	}
}

class Child1 extends ParentA{
	void eat() {
		System.out.println("the Child1 is calling");
	}
}

class Child2 extends ParentA{
	void eat() {
		System.out.println("the Child2 is calling");
	}
}

public class E3_Hierarchical_Inheritance {
	public static void main(String[] args) {
		ParentA hi1 = new Child1();
		ParentA hi2 = new Child2();
		hi1.display();
		hi2.display();
	}
	
}
