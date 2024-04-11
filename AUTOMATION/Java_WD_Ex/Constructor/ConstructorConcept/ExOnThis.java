package ConstructorConcept;

public class ExOnThis {
	/*/ EX1 - to refer current class instance variable
	int a;
	int b;
	ExOnThis(int a, int b){
		this.a = a;		/////to refer current class instance variable
		this.b = b;		/////to refer current class instance variable
	}
	
	void display() {
		System.out.println("a=  "+a+"\nb=  "+b);
	}
	
	public static void main(String[] args) {
		ExOnThis obj = new ExOnThis(10, 20);
		obj.display();
	} //*/
	
	
	
	
	/*/ EX2 - to invoke current class method
	void display() {
		this.show();	/////to invoke current class method
		System.out.println("this is inside display() function");
	}
	
	void show() {
		System.out.println("this is inside show() function");
	}
	
	public static void main(String[] args) {
		ExOnThis obj = new ExOnThis();
		obj.display();
	} //*/
	
	
	
	
	/*/ EX3 - to invoke current class constructor
	int a, b;
	ExOnThis(){	//default constructor  	  ///////to invoke current class constructor
		this(10, 20);
		System.out.println("this is inside default constructor \n");
	}
	
	ExOnThis(int a, int b){	//parameterized constructor		///////to invoke current class constructor
		this.a = a;
		this.b = b;
		System.out.println("this is inside parameterized constructors");
	}
		
	public static void main(String[] args) {
		ExOnThis obj = new ExOnThis();			//both will call
//		ExOnThis obj2 = new ExOnThis(40, 50);	//parameterized constructor only will call
	} //*/
	
	
	
	
	/*/ EX4 - to pass as an argument in the method call
	int a, b;
	ExOnThis(){
		a = 10;
		b = 20;
	}
	
	void display() {
		System.out.println("a=  "+a+"\nb=  "+b);
	}
	 
	void get() {
		this.display();		/////to pass as an argument in the method call
	}
	 
	public static void main(String[] args) {
		ExOnThis obj = new ExOnThis();
		obj.get();
	} //*/
	
	
	
	/*/ EX5 - to pass as an argument in the constructor call
	look this path - Java_WD_Ex/Constructor/ConstructorConcept/B.java
	//*/
		
	
	
	/*/ EX6 - can be used to return current class instance
	int a, b;
	ExOnThis(){
		a = 10;
		b = 70;
	}
	
	ExOnThis get() {
		return this;	/////can be used to return current class instance
	}
	
	void display() {
		System.out.println("a=  "+a+"\nb=  "+b);
	}
	
	public static void main(String[] args) {
		ExOnThis obj = new ExOnThis();
		obj.get().display();
	} //*/
	
}
