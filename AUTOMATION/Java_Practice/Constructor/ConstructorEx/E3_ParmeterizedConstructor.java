package ConstructorEx;

public class E3_ParmeterizedConstructor {
	
	//parameterized constructor
	E3_ParmeterizedConstructor(int a, int b){
		System.out.println("addition of a and b values: "+ (a+b));
	}
	
	public static void main(String[] args) {
		E3_ParmeterizedConstructor obj = new E3_ParmeterizedConstructor(12, 9); 
	}
}
