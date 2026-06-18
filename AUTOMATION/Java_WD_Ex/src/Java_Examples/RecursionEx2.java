package Java_Examples;

public class RecursionEx2 {
	int factorial(int n) {
	    if (n == 0) {          // Base condition
	        return 1;
	    }
	    return n * factorial(n - 1);  // Recursive call
	}
	
	public static void main(String[] args) {
		int result = new RecursionEx2().factorial(4);
		System.out.println(result);
	}
}
