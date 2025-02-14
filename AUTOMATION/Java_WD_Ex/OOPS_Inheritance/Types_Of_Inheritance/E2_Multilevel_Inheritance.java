package Types_Of_Inheritance;

class Parent{
	void display() {
		System.out.println("Parent class method is calling");
	}
}

class Child extends Parent{
	void display() {
		System.out.println("Child class method is calling");
	}
}

class Grandchild extends Child{
	void display() {
		System.out.println("Grandchild class method is calling");
	}
}

public class E2_Multilevel_Inheritance {
	public static void main(String[] args) {
		Parent mi1 = new Child();
		Parent mi2 = new Grandchild();
		mi1.display();
		mi2.display();
	}
}
