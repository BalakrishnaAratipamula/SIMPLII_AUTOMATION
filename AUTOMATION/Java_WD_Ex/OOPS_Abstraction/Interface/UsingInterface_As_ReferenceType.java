package Interface;
interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}

class Bike implements Vehicle {
    public void drive() {
        System.out.println("Bike is driving");
    }
}

public class UsingInterface_As_ReferenceType {
    public static void main(String[] args) {
        Vehicle myCar = new Car();   // Interface reference pointing to Car
        Vehicle myBike = new Bike(); // Interface reference pointing to Bike

        myCar.drive();  // Output: Car is driving
        myBike.drive(); // Output: Bike is driving
    }
}

