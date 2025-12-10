package Static_nd_NonStatic;

public class EX_nonstatic_methods {

	//to perform addition operation
	public void sumOf() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum of a & b is: "+c);
	}
	//to perform multiplication operation
	public void multiplicationOf(int x, int y) {
		int z=x*y;
		System.out.println("multiplication of x & y is: "+z);
	}
	//to perform multiplication operation
	public int mult(int x, int y) {
		int result = x*y;
		return result;
	}
	// Driver function
	public static void main(String[] args) {
		EX_nonstatic_methods obj = new EX_nonstatic_methods();
		obj.sumOf();
		obj.multiplicationOf(4, 5);
		int z = obj.mult(5, 5);
		System.out.println("mult of x & y is: "+z);
	}
}
