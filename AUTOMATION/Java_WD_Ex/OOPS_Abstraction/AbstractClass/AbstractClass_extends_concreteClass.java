package AbstractClass;

class Vehicle3 {  // Concrete class
    void start() {
        System.out.println("Vehicle started");
    }
}

abstract class Car3 extends Vehicle3 {  // Abstract class extending concrete class
    abstract void openSunroof();  // Abstract method

    void honk() {                 // Concrete method
        System.out.println("Car honks");
    }
}

class Sedan extends Car3 {          // Concrete subclass
    @Override
    void openSunroof() {
        System.out.println("Sunroof opened");
    }
}

public class AbstractClass_extends_concreteClass {
	public static void main(String[] args) {
        Sedan myCar = new Sedan();
        myCar.start();       // From Vehicle
        myCar.honk();        // From Car
        myCar.openSunroof(); // Implemented in Sedan
    }
}
