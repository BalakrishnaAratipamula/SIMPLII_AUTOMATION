package Java_Examples;

public class EX_Static_methods {

	//to perform addition operation
	public static void addOf() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum of a & b is: "+c);
	}
	//to perform multiplication operation
	public static void multiplicationOf(int x, int y) {
		int z=x*y;
		System.out.println("multiplication of a & b is: "+z);
	}
	//to perform multiplication operation
	public static int mult(int x, int y) {
		int result = x*y;
		return result;
	}

	//to call above sub methods into main method
	public static void main(String[] args) {
		addOf();
		multiplicationOf(4, 5);
		int z = mult(9, 9);
		System.out.println("mult of a & b is: "+z);
	}
}
