package Java_Quizs;

public class OrderOfExecution {
	
	public void myMethod() {
		System.out.println("myMethod");
	}
	
	{
		System.out.println("Instance block");
	}
	
	public void myMethod2() {
		System.out.println("myMethod2");
	}
	
	static {
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		OrderOfExecution obj = new OrderOfExecution();
		obj.myMethod();
		obj.myMethod2();
	}
	
}
