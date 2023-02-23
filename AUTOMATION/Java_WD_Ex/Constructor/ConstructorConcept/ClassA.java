package ConstructorConcept;

public class ClassA { 

	public ClassA() { // a
		System.out.println("Parent class constructor"); 
	} 
	
	//after execution create this parameterized constructor //to call this method will use super KW
	public ClassA(int i) {
		System.out.println("Parent class constructor with value of i: "+i);
	}
	
	public ClassA(int i, int j) {
		System.out.println("Parent class constructor with value of i: "+i);
		System.out.println("Parent class constructor with value of j: "+j);
	} 
}

/*a. it will call by default bcz while u create the obj to ClassB control will goto ClassB and check for extends so jump into ClassA 
 * and print default contr(no para) bcz constructor will consider default in case of require and jump into ClassB and print
 */