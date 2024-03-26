package ConstructorConcept;

public class E2_Default_Parameterized_Constructor {

	private int number;
	private String text;
	
	// Default Constructor
	public E2_Default_Parameterized_Constructor() {
		this.number = 0;
		this.text = "Simple Default Text";
	}
	
	// Parameterized Constructor
	public E2_Default_Parameterized_Constructor(int number, String text) {
		this.number = number;
		this.text = text;
	}
	
	public void display() {
		System.out.println("number: " +number);
		System.out.println("text: " +text);
	}
	
	public static void main(String[] args) {
		E2_Default_Parameterized_Constructor defaultExample = new E2_Default_Parameterized_Constructor();
		E2_Default_Parameterized_Constructor paraExample = new E2_Default_Parameterized_Constructor(10, "Simple Parameterized Text");
		
		// Displaying details of both objects
		System.out.println("DefaultExample");
		defaultExample.display();
		
		System.out.println("\nParameterizedExample");
		paraExample.display();
		
	}
	
}
