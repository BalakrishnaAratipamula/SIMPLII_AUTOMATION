package Practice;

import java.io.FileNotFoundException;

public class E30_try_with_MultipleCatchBlocks {
	/*/ Ex 1
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = Integer.parseInt("ABCD"); //Exception
			System.out.println(2);
		} 
		
		catch(NumberFormatException e) {
			System.out.println(3);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(4);
		}
		catch(Exception e) {
			System.out.println(5);
		}

		System.out.println("Due to proper catch block is present program get executed successfully");
	} //*/
	
	
	
	/*/  Ex 2 
	public static void main(String[] args) {
		try {
			int[] a = new int[15];
			a[10] = 99/0; 
		} 
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		} 
		catch(ArrayIndexOutOfBoundsException arrexcp) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Parent Exception");
		}
		
		System.out.println("Due to proper catch block is present program get executed successfully");
	} //*/
	
	
	//Ex 3
	public static void main(String[] args) {
		try {
			int[] a = new int[15];
			System.out.println(a[20]);
		} 
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		} 
		catch(ArrayIndexOutOfBoundsException arrexcp) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Parent Exception");
		}
		
		System.out.println("Due to proper catch block is present program get executed successfully");
	}
}












