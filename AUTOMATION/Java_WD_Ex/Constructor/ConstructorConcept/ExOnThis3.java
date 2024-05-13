package ConstructorConcept;

public class ExOnThis3 {

	void start(){
		System.out.println("start() stmt");
	}
	
	void drive(){
		this.start();
		System.out.println("dive() stmt");
	}
	
	public static void main(String[] args) {
		ExOnThis3 obj = new ExOnThis3();
		obj.drive();
	}
}
