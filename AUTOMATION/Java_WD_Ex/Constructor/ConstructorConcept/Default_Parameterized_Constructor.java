package ConstructorConcept;

public class Default_Parameterized_Constructor {

	private int number;
	private String text;
	
	// Default Constructor
	public Default_Parameterized_Constructor() {
		this.number = 0;
		this.text = "Simple Default Text";
		/*
		after code compilation java provides a default constructor in case of no constructor present 
		*/
	}
	
	// Parameterized Constructor
	public Default_Parameterized_Constructor(int number, String text) {
		this.number = number;
		this.text = text;
	}
	
	public void display() {
		System.out.println("number: " +number);
		System.out.println("text: " +text);
	}
	
	public static void main(String[] args) {
		Default_Parameterized_Constructor defaultExample = new Default_Parameterized_Constructor();
		Default_Parameterized_Constructor paraExample = new Default_Parameterized_Constructor(10, "Simple Parameterized Text");
		
		// Displaying details of both objects
		System.out.println("DefaultExample");
		defaultExample.display();
		
		System.out.println("\nParameterizedExample");
		paraExample.display();
		
	}
	
}
