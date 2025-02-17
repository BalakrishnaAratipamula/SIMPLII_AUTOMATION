package Interface;

/*////Ex1 without Lambda Expression
interface Greeting {
	void sayHello(); // Functional interface having only Single Abstract Method
}

public class Z1E_FunctionalInteface_LambdaExp {
	public static void main(String[] args) {
		Greeting greet = new Greeting() {
			public void sayHello() {
				System.out.println("Hello Selenium WebDriver");
			}
		};

		// calling abstract method
		greet.sayHello();
	}
} //*/


/*////Ex2 with Lambda Expression
interface Greeting {
	void sayHello(); // Functional interface having only Single Abstract Method
}

public class Z1E_FunctionalInteface_LambdaExp {
	public static void main(String[] args) {
		Greeting greet = () -> System.out.println("Hello Selenium WebDriver"); //syn: (Parameters) -> Exression_or_Block

		// calling abstract method
		greet.sayHello();
	}
} //*/



/////Ex2 with Lambda Expression
interface Adder {
	int add(int a, int b); // Functional interface having only Single Abstract Method
}

public class Z1E1_FunctionalInteface_LambdaExp {
	public static void main(String[] args) {
		Adder adder = (a, b) -> a+b; //syn: (Parameters) -> Exression_or_Block
		System.out.println("Sum: "+adder.add(5, 10));
	}
}

