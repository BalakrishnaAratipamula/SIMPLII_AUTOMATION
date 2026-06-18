package Java_Examples;

public class RecursionEx_staticRecursiveMethod {
	
	static int factorial(int n) {
	    if (n == 0) {      // Base condition
	        return 1;
	    }
	    return n * factorial(n - 1);  // Recursive call
	}

	public static void main(String[] args) {
        System.out.println(factorial(5)); // No object creation required
    }
}
