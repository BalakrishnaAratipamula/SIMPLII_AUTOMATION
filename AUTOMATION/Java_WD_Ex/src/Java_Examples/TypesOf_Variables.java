package Java_Examples;


public class TypesOf_Variables {
	
	/*/ M1
	// instance variable
	String instaceVar = "I am instance variable";
	
	// class variable (static variable)
	static int staticVar = 20;
	
	public void method1() {
		// local variable
		int locatvar = 555;
		
		System.out.println("this is instance variable:    "+instaceVar);
		System.out.println("this is class variable:    "+staticVar);
		System.out.println("this is local variable:    "+locatvar);
	}
	
	public void method2() {
		// local variable
		int locatvar2 = 999;
		System.out.println("\n");
		System.out.println("this is instance variable:    "+instaceVar);
		System.out.println("this is class variable:    "+staticVar);
		System.out.println("this is local variable:    "+locatvar2);
	}
	
	public static void main(String args[]) {
		TypesOf_Variables test = new TypesOf_Variables();
		test.method1();
		test.method2();
	}
	
	//*/
	
	
	// M2
	//Local Variable (We can do declaration at class level)
	private int myLocalVar;
	
	//Instance Variable
	private int myInstanceVar;
	
	//Static Variable 
	private static int myStaticVar;
	
	public void myMethod() {
		//Local variable
		int myLocalVar = 10; //(LVs initialization can do inside the method only / Must be initialized before use)
		
		//Access Instance Variable
		myInstanceVar = 20;
		
		//Access Static Variable
		myStaticVar = 30;
		
	}
} 
