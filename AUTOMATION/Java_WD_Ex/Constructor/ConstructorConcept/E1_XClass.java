package ConstructorConcept;

public class E1_XClass extends E1_SuperClass{

	/*/1st scenario ---- Pass values by super()
	public XClass() {
		//super(10); //b
		//super(10, 20); //c
		//super();
		System.out.println("msg from Child class constructor");
	} 

	public static void main(String[] args) {
		XClass obj1 = new XClass();

	} */

	/*b. at this time default constr will not execute bcz explicitly we are trying to execute some parameterized constr with the help of 
	 * super KW
	 * 
	 * c. 2nd statement is not possible because 2nd statement can able to write in next line and super keyword will always write at only 
	 * one time in a child class and will always write first line of the function. 
	 */



	//2nd scenario - constr to constr maping ---- Pass values By class
	public E1_XClass() {
		super(); //b
		//super(10, 20); //c
		System.out.println("msg from Child class constructor\n");
	}

	public E1_XClass(int i) {
		super(i); //b
		//super(10, 20); //c
		System.out.println("msg from Child class constructor\n");
	}

	public E1_XClass(int i, int j) {
		super(i , j); //b
		System.out.println("msg from Child class constructor");
	}

	public static void main(String[] args) {
		E1_XClass obj = new E1_XClass();
		E1_XClass obj1 = new E1_XClass(10);
		E1_XClass obj2 = new E1_XClass(20, 30); 
	}

}

