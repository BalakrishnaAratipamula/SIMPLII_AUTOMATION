package Interface;

@FunctionalInterface
interface A {
	void show();	//If we declare Interface KW it will consider all the methods by default abstract
	// void show2(); //above we declared @FunctionalInterface so it will allow only one Abstract method inside Interface
}

public class Z1E2_FunctionalInteface {
	
	/*/ method implementation without using Lambda Expression
	public static void main(String[] args) {
		// Functional Interface feature: we can implement the unimplemented method as below
		A obj = new A() {
			@Override
			public void show() {
				System.out.println("method implementation by using Functional Interface - without Lambda Expression");
			}
		};

		obj.show();
	} //*/
	
	
	//method implementation without using Lambda Expression
	//Lambda Expression only works with 'Functional Interface'
	//main use of Lambda Expression is to reduce the lines of code
	public static void main(String[] args) {
		/*/ Functional Interface feature: we can implement the unimplemented method as below
		A obj = ()-> 
		{
				System.out.println("method implementation by using Functional Interface - Lambda Expression");
		};

		obj.show(); //*/
		
		
		//----------------or--------------or---------------//
		A obj = ()-> System.out.println("method implementation by using Functional Interface - Lambda Expression");
		
		obj.show();
	}

}
