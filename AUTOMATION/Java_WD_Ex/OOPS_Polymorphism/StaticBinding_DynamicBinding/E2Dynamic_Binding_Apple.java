package StaticBinding_DynamicBinding;

class Fruit {

	void print() {
		System.out.println("This is fruit class");
	}

}

public class E2Dynamic_Binding_Apple extends Fruit { // Apple //same as OOPS_Polymorphism\EarlyBinding_LateBinding\LateBinding

	void print() {
		System.out.println("This is Apple");
	}

	public static void main(String args[]) {

		Fruit f = new E2Dynamic_Binding_Apple();
		f.print();

	}
}
