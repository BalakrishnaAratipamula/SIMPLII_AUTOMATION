package Practice;

public class E26_Code_with_nd_without_ExceptionHandling {
	/*/Code without Exception Handling
	public static void main(String[] args) {
		int a=0;
		int b=42/a; //ArithmeticException: / by zero
		
		System.out.println(b);
	} //*/
	
	
	//Code with Exception Handling
	public static void main(String[] args) {
		int a, b; 
		
		try {
			a=0;
			b=42/a;
		} catch(ArithmeticException ae) {
			//we can try any one of the following
			System.out.println("Divison by zero");
//			System.out.println(ae.getMessage());
//			ae.printStackTrace();
		}
		
		System.out.println("after catch block");
		
	} //*/
}
