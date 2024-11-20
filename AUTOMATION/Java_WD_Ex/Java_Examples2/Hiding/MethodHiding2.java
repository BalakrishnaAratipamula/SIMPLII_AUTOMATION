package Hiding;

class Parent2{
	public static void print() {
		System.out.println("Parent2");
	}
}

class Child2 extends Parent2{
	public static void print() {
		System.out.println("Child2");
	}
}
public class MethodHiding2 {
	public static void main(String[] args) {
		Child2.print();
	}
}
