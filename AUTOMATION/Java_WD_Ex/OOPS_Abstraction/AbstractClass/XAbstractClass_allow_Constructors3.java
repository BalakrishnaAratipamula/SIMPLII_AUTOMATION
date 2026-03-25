package AbstractClass;

abstract class Vehicle2 {
    String color;

    // Constructor
    Vehicle2(String color) {
        this.color = color;
    }

    //Abstract Method
    abstract void start();
}

class Car2 extends Vehicle2 {
    Car2(String color) {
        super(color);  // call abstract class constructor
    }

    void start() {
        System.out.println("Car started in color: " + color);
    }
}

public class XAbstractClass_allow_Constructors3 {
	public static void main(String[] args) {
        Car2 c = new Car2("Red");
        c.start();  // Output: Car started in color: Red
    }
}
