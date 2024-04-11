package ExceptionHandling;

public class try_finally {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		}
	finally {
		System.out.println("inside of finally block");
	}
	System.out.println("out side of finally block");//this is not print bcz there is no catch block
	System.out.println("out side of finally block");//this is not print bcz there is no catch block
	
}
}
