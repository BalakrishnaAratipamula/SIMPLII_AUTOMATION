package Java_Examples;

public class try_catch {
public static void main(String[] args) {
	/*int a=10;
	int b=0;
	int c=a/b;//here arithmetic exception is there so hole program can terminate
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);*/
	
	
	try {
	int a=10;
	int b=0;
	int c=a/b;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	catch(Exception e) {
		e.printStackTrace();//this is one type of method to trace exception
		System.out.println("inside of catch block");
	}
	System.out.println("outside of catch block");
	System.out.println("outside of catch block");
}
}
