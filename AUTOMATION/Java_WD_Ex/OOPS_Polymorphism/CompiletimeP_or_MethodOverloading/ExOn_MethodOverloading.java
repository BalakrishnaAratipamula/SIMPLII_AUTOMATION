package CompiletimeP_or_MethodOverloading;

public class ExOn_MethodOverloading {

	void add(int a, int b) {
		System.out.println("sum: " + (a + b));
	}

	void add(double a, double b) {
		System.out.println("sum: " + (a + b));
	}

	public static void main(String[] args) {
		ExOn_MethodOverloading obj = new ExOn_MethodOverloading();
		obj.add(1, 2);
		obj.add(1.5, 2.7);
	}
}
