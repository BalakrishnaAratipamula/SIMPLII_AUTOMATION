package ExceptionHandling;

public class try_catch_finally {
	public static void main(String[] args) {
		try {
			int c = 10/0;
			System.out.println(c);
			System.out.println("from try block");
		} catch (Exception e) { // Different ways to trace/print Exception message
			System.out.println("e:  " + e);
			e.printStackTrace(); // type 1
			System.out.println("e.toString()  " + e.toString()); // type 2
			System.out.println("e.getMessage()  " + e.getMessage()); // type 3
			System.out.println("from catch block");
		} finally {
			System.out.println("from finally block");
		}
		
		System.out.println("out side of finally block stmt will print bcz of after catch block stmt is there");
	}
}
