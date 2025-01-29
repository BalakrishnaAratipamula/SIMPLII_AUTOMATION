package Practice;

public class E3_UserDefinedMethods {

	String str = "StringContent"; // this can hold only single value or content
	String[] str2 = { "Apple", "Mango", "Orange" }; // this can hold multiple values value or content

	// method 1
	void subMethod1() {
		System.out.println("subMethod2() is calling");
	}

	// method 2
	void subMethod2() {
		System.out.println("subMethod2() is calling");
	}

	// method 3
	public static void main(String[] args) {
		System.out.println("main() is calling");
		
		//creating object to the class using class_name
		//sysntax for creating object to class: Class_Name object_Name = new Class_Name();
		E3_UserDefinedMethods obj1 = new E3_UserDefinedMethods();
		obj1.subMethod1();
		obj1.subMethod2();
		
	}
}
