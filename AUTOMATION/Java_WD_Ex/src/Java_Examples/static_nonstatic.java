package Java_Examples;

//Execution - 1 ----- Static block
class static_block{
	static { //static block
		System.out.println("static block - 1");
	}
	
	static { //static block
		System.out.println("static block - 2");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
	
	static { //static block
		System.out.println("static block - 3");
	}
}




//Execution - 2 ----- Non-static block
class nonstatic_block{
	{
		System.out.println("non-static block - 1");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
		nonstatic_block obj1 = new nonstatic_block();
		System.out.println("==============");
		nonstatic_block obj2 = new nonstatic_block();
		System.out.println("==============");
		nonstatic_block obj3 = new nonstatic_block();
	}
	static { //static block
		System.out.println("static block - 1");
	}
	
	static { //static block
		System.out.println("static block - 2");
	}
	
}




//Execution - 3 ----- static and Non-static methods
public class static_nonstatic {
	String name = "Tom"; //non-static global var
	static int age = 25; //static global var

	
	public void sendMail() { //non-static method
		System.out.println("non-static method called" );
	}
	
	public static void sum() { //static method
		System.out.println("static method called");
	}
	
	
	public static void main(String[] args) {
		//to call static methods //no need to create object to class we call directly
		sum(); //1. direct calling
		static_nonstatic.sum(); //2. call by class_name
		
		//to call static variables
		System.out.println(age);
		System.out.println(static_nonstatic.age);
		
		//to call non-static methods
		static_nonstatic obj = new static_nonstatic();
		obj.sendMail();
		
		//to call non-static variables
		System.out.println(obj.age);
		
		static_block obj2 = new static_block();
	}
}
