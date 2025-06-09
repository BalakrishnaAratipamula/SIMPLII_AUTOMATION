package Interface_IQ;

// @We have 2 interfaces and both have print methods, in my class I have implemented the print method , how you will get to know that I have implemented the first interface and how you will use it .. if you want to use it?
//Ans: If we assign 'MyClass' object to 'IneterfaceA' MyClass implemented method will get print.--- 
	//---and If we assign 'MyClass' object to 'IneterfaceB' MyClass implemented method will get print.
interface InterfaceA {
	void print();
}

interface InterfaceB {
	void print();
}

class MyClass implements InterfaceA, InterfaceB {
	public void print() {
		System.out.println("MyClass print");
	}
}

public class Test {
	//Ans: Since the method signature is the same, and both are merged in the class, you can cast the object to the desired interface and call the method.
	public static void main(String[] args) {
		InterfaceA obj = new MyClass();
		obj.print(); //This will call MyClass's print() method
		
		InterfaceB obj2 = new MyClass();
		obj.print(); //Also calls MyClass's print() method
	}
}