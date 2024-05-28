package Java_Examples;

class Super {
	String name = "Krishna";
	int age = 25;
}

class Sub extends Super {
	String name = "Vishnu";
	int age = 22;

	public void display() {
		Sub obj = new Sub();
		System.out.println("Name: " + obj.name);
		System.out.println("age: " + obj.age);
	}
}

public class VariableHiding3 {
	public static void main(String args[]) {
		new Sub().display();
	}
}
