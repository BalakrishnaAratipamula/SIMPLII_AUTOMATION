package Java_Examples;

public class try_catch_finally {
public static void main(String[] args) {
	try {
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		System.out.println("from try block");
		}
	catch(Exception e) {
		e.printStackTrace();//this is one type of method to trace exception
		System.out.println("from catch block");
	}
	finally {
		System.out.println("from finally block");
	}
	System.out.println("out side of finally block stmt will print bcz of after catch block stmt is there");
}
}
