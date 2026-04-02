package ConstructorConcept;

class Car {
    String color;
}

public class CompilerProviding_DefaultConstructor {
	public static void main(String[] args) {
        Car myCar = new Car(); // Calls compiler-generated default constructor
        System.out.println(myCar.color); // null (default value)
    }
	//Here, Car() is the default constructor automatically provided by the compiler.
}
