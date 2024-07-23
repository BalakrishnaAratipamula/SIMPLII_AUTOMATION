package Static_nd_Dynamic_Bindings;

class Fruit {

	void print() {
		System.out.println("This is fruit class");
	}

}

public class Dynamic_Binding_Apple extends Fruit { // Apple

	void print() {
		System.out.println("This is Apple");
	}

	public static void main(String args[]) {

		Fruit f = new Dynamic_Binding_Apple();
		f.print();

	}
}
