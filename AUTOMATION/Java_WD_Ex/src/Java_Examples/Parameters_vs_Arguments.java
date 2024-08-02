package Java_Examples;

public class Parameters_vs_Arguments {
	
	public static int multiply(int a, int b) { // the variables a and b are Parameters
		return a * b;
	}

	public static void main(String[] args) {
		int x = 2, y=5;
		
		int product = multiply(x, y); // the variables x and y are Arguments
									  //(or) int product = multiply(2, 5);
		System.out.println("PRODUCT IS: " + product);
	}
}
