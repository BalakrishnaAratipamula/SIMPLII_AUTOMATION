package A1_Types_of_Constructors;

public class E4_Parameterized_nd_NotParameterizedConstructor {

	private int number;
	private String text;
	
	// NotParameterized Constructor
	public E4_Parameterized_nd_NotParameterizedConstructor() {
		this.number = 0;
		this.text = "Simple Default Text";
		/*
		after code compilation java provides a default constructor in case of no constructor present 
		*/
	}
	
	// Parameterized Constructor
	public E4_Parameterized_nd_NotParameterizedConstructor(int number, String text) {
		this.number = number;
		this.text = text;
	}
	
	public void display() {
		System.out.println("number: " +number);
		System.out.println("text: " +text);
	}
	
	public static void main(String[] args) {
		E4_Parameterized_nd_NotParameterizedConstructor defaultExample = new E4_Parameterized_nd_NotParameterizedConstructor();
		E4_Parameterized_nd_NotParameterizedConstructor paraExample = new E4_Parameterized_nd_NotParameterizedConstructor(10, "Simple Parameterized Text");
		
		// Displaying details of both objects
		System.out.println("DefaultExample");
		defaultExample.display();
		
		System.out.println("\nParameterizedExample");
		paraExample.display();
		
	}
	
}
