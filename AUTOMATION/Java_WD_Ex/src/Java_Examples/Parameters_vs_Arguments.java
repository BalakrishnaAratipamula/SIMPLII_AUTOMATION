package Java_Examples;

public class Parameters_vs_Arguments {
	
	// the variables a and b are Parameters
	public static int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {

		// the variables x and y are Arguments
		int product = multiply(2, 5);

		System.out.println("PRODUCT IS: " + product);
	}
}