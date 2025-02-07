package Static_nd_Dynamic_Bindings;

public class E1Static_Binding {
	void print() {
		System.out.println("Printing");
	}

	public static void main(String args[]) {

		E1Static_Binding mc = new E1Static_Binding();
		mc.print();

	}
}
