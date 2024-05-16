package Java_Examples;

class Parent {
	public String name = "Parent";
}

class Child extends Parent {
	public String name = "Child";

	void displayName() {
		System.out.println(name);
	}
}

public class VariableHiding2 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.displayName();
	}
}
