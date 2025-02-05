package Practice;

public class E31_NestedTryBlock {
	/*/ Ex 1
	public static void main(String[] args) {
		try {
			try { //nested try
				int b = 10/0;
			} 
			catch(Exception e) {
				System.out.println("Parent Exception");
			}
		}
		catch(ArithmeticException ar) {
			System.out.println("ArithmeticException");
		}
	} //*/
	
	//Ex 2
	public static void main(String[] args) {
		try {
			int b = 10/0;
			try { //nested try
				int c = 10/0;
			} 
			catch(Exception e) {
				System.out.println("Parent Exception");
			}
		}
		catch(ArithmeticException ar) {
			System.out.println("ArithmeticException");
		}
	} //*/
}
