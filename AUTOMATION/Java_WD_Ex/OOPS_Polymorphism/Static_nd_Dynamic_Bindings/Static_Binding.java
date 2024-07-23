package Static_nd_Dynamic_Bindings;

public class Static_Binding {
	void print() {
		System.out.println("Printing");
	}

	public static void main(String args[]) {

		Static_Binding mc = new Static_Binding();
		mc.print();

	}
}
