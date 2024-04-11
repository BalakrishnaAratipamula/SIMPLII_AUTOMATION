package ExceptionHandling;

public class code_with_and_without_ExcpHand {
	/*/code without Exception Handling
	public static void main(String[] args) {
		int a=0,
		b=42/a;
	} //*/
	
	
	//code with Exception Handling
	public static void main(String[] args) {
		int a, b;
		
		try {
			a=0;
			b=42/a;
			System.out.println("this will not be printed");
		}catch(ArithmeticException ae) {
			System.out.println("division by zero");
		}
		System.out.println("after catch statement");
	} //*/
}
