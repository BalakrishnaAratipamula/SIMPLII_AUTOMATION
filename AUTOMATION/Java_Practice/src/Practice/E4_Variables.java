package Practice;

public class E4_Variables {
	//Global Variables - Global variables can access throughout the class. these are keep inside the class and out side the method
	int i = 10; //instance or non-static variable
	static int j = 30; //static variable
	
	//method 1
	public static void main(String[] args) {
		//Local Variable - Local variables can access throughout the method only. these are kept inside the method
		boolean result = false; //boolean-data type, false-value, result=variable
		
		System.out.println(result);
		
		E4_Variables obj = new E4_Variables();
		obj.m1();
	}
	
	
	//method 2
	void m1() {
		System.out.println(i); //Global variables can access throughout the class
		System.out.println(j); //Global variables can access throughout the class
		
//		System.out.println(result); //error bcz we cant able to access local methods
	}
}
