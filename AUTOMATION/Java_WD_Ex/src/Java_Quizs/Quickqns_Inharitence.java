package Java_Quizs;

class Parent{
	private void print() {
		System.out.println("parent");
	}
	public void display() {
		print();
	}
}

class Child extends Parent{
	public void print() {
		System.out.println("child");
	}
}

public class Quickqns_Inharitence {
	public static void main(String[] args) {
		Child child = new Child();
		child.display();
	}
}

/*here we created object to ch class and calling the display() so, first will check the display() in ch class
 *if not available already ch extends pr so will print the pr display() from pr class. display() calling print() */
//for cross check make availability of display() inside ch class will print ch class print()