package ConstructorConcept;

public class ClassB extends ClassA{

	/*/1st scenario ---- Pass values by super()
	public ClassB() {
		super(10); //b
		//super(10, 20); //c
		System.out.println("Child class constructor");
	} 

	public static void main(String[] args) {
		ClassB obj1 = new ClassB();

	} */

	/*b. at this time default constr will not execute bcz explicitly we are trying to execute some parameterized constr with the help of 
	 * super KW
	 * 
	 * c. 2nd statement is not possible because 2nd statement can able to write in next line and super keyword will always write at only 
	 * one time in a child class and will always write first line of the function. 
	 */



	//2nd scenario - constr to constr maping ---- Pass values By class
	public ClassB() {
		super(); //b
		//super(10, 20); //c
		System.out.println("Child class constructor");
	}

	public ClassB(int i) {
		super(i); //b
		//super(10, 20); //c
		System.out.println("Child class constructor");
	}

	public ClassB(int i, int j) {
		super(i , j); //b
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		ClassB obj = new ClassB();
		ClassB obj1 = new ClassB(10);
		ClassB obj2 = new ClassB(20, 30); 
	} 

}

