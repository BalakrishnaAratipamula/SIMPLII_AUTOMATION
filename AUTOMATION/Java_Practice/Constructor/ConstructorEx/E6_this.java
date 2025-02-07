package ConstructorEx;

public class E6_this {
	void strat() {
		System.out.println("start() method calling");
	}
	
	void drive() {
		System.out.println("driver() method calling");
		this.strat(); //calling current class method 
	}
	
	public static void main(String[] args) {
		E6_this obj = new E6_this();
		
		obj.drive();
	}
}
