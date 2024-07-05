package Java_Examples;

class Super {
	String className = "Super";	//super class variable
	int age = 25;				//super class variable
}

class Sub extends Super {		
	String className = "Sub";	//sub class variable
	int age = 22;				//sub class variable

	public void display() {
		Sub obj = new Sub();
		System.out.println("Name: " + obj.className);
		System.out.println("age: " + obj.age);
	}
}

public class VariableHiding3 {
	public static void main(String args[]) {
		new Sub().display();
	}
}
