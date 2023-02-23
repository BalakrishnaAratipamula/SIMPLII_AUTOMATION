package Java_Quizs;

public class OrderOfExecution2 {
	
	public static void main(String[] args) {
		OrderOfExecution2 obj = new OrderOfExecution2(n);
		
	}
	
	public OrderOfExecution2(int m) {
		System.out.println(a+", "+b+", "+c+", "+n+", "+m);//not initialized means Zero
	}
	
	static int a=10;
	static int n;
	int b=5;
	int c;
	
	//Instance block
	{
		b=30;
		n=20;
	}
	
	//static block
	static {
		a=60;
	}
	
}
