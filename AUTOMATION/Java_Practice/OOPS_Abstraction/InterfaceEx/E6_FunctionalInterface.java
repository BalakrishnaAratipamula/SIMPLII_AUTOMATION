package InterfaceEx;

@FunctionalInterface
interface A5 {
	//abstract method
	void show();
}

//main class
public class E6_FunctionalInterface {
	public static void main(String[] args) {
		//Implementing Functional Interface using Lambda Expression  //sys: (parameters) -> Expression_or_Block
	
		/*/Approach 1
		A5 obj = () ->	
		{
			System.out.println("Implementing Functional Interface using Lambda Expression");
		};
		
		obj.show(); //*/
		
		//Approach 1
		A5 obj = () -> System.out.println("Implementing Functional Interface using Lambda Expression");
		
		obj.show(); //*/
	}
}
