package ConstructorEx;

public class E1_Parameter_vs_Argument {
	/*
	public static int multiply(int a, int b) { //Parameters: Parameters are variables these are declared in method signature
		return a*b;
	}
	
	public static void main(String[] args) {
		int a=4, b=5;
		
		int product = multiply(a, b); //Arguments: Arguments are variables or values are declared at the time of method calling.
		System.out.println("After multiply a and b value:  "+product);
	} //*/
	
	
	
	
	void m1() {
		System.out.println("method m1() is calling");
	}
	
	public static void main(String[] args) {
		E1_Parameter_vs_Argument obj = new E1_Parameter_vs_Argument();
		obj.m1();
	}
	
}
