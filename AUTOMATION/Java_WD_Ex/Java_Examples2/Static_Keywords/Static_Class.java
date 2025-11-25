package Static_Keywords;

//@: Can we have static class in java - Only inner classes can be static
class Outer2{ //Outer Class
	static class Inner2{ //Inner Class
		void show() {
			System.out.println("static inner class");
		}
	}
}

public class Static_Class {

}
