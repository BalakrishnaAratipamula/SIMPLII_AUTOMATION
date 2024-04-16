package ConstructorConcept;

class Super { // parent
	void show() {
		System.out.println("parent class method");
	}
}

public class Ex2OnSuper extends Super { // test class - original class
	void show() {
		super.show();
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		Ex2OnSuper obj = new Ex2OnSuper();
		obj.show();
	}
}
