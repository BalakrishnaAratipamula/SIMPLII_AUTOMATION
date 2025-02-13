package Java_Examples;

public class RecursionEx {
	/*/ Recursive function to calculate factorial
	public static int factorial(int n) {
		if (n == 0) { // Base case
			return 1;
		}
		return n * factorial(n - 1); // Recursive call
	}

	public static void main(String[] args) {
		int num = 5;
		System.out.println("Factorial of " + num + " is: " + factorial(num));
	} */
	
	
	
	// Recursive function for Fibonacci sequence
    public static int fibonacci(int n) {
        if (n <= 1) {  // Base case
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive call
    }

    public static void main(String[] args) {
        int terms = 7;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
