package Static_Keywords;

class Outer {
	class Inner {
		void display() {
			System.out.println("Non-static inner class");
		}
	}
}

public class InnerClassRequires_OuterClassReference {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); // Associated with the outer instance
		inner.display();
	}
}
