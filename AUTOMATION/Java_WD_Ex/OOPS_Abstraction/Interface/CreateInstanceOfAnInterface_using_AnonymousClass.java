package Interface;

interface Greet{
	void sayHello();
}

public class CreateInstanceOfAnInterface_using_AnonymousClass {
	public static void main(String[] args) {
		//Anonymous class
		Greet g = new Greet() { 
			public void sayHello() {
				System.out.println("Hello");
			}
		};
		g.sayHello();
	}
}
