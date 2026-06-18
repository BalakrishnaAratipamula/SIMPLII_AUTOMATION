package Java_Examples;

public class RecursionEx_instanceRecursiveMethod {
	int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(new RecursionEx_instanceRecursiveMethod().factorial(5)); // Object creation required
    }
}
