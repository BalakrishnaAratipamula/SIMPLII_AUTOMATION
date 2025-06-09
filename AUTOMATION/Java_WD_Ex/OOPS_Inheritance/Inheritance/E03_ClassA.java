package Inheritance;

//@There are 3 classes say A,B and C in your project. How to access the methods of B and C from A Class?
class ClassC { //ClassC
	public void methodC() {
		System.out.println("ClassC");
	}
}

class ClassB extends ClassC { //ClassB
	public void methodB() {
		System.out.println("ClassB");
	}
}

public class E03_ClassA { //ClassA
	public static void main(String[] args) {
		ClassB objB = new ClassB();
		objB.methodB();
		objB.methodC();
	}
}
