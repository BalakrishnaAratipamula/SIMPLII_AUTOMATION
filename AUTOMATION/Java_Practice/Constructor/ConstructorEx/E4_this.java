package ConstructorEx;

public class E4_this {
	int a, b; //declaration
	
	//parameterized constructor
	E4_this(int a, int b){
		this.a=a; //initializing local values with 'global' variables
		this.b=b;
		System.out.println("Constructor called");
	}
	
	//method
	void display() {
		System.out.println("a= "+a+"\nb= "+b); //\n- new line
	}
	
	
	public static void main(String[] args) {
		//create object to call constructor
		E4_this obj = new E4_this(10, 20);
		obj.display();
	}
}
