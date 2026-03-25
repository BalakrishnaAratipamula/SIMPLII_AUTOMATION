package PrivateConstructor;

class Vehicle {
    private String type;

    private Vehicle(String type) { // private constructor
        this.type = type;
    }

    public static Vehicle createCar() {
        return new Vehicle("Car");
    }

    public static Vehicle createBike() {
        return new Vehicle("Bike");
    }

    public void showType() {
        System.out.println("Vehicle type: " + type);
    }
}

public class E1b_PrivateConstructor_usedIn_FactoryMethod {
	public static void main(String[] args) {
        Vehicle car = Vehicle.createCar();
        Vehicle bike = Vehicle.createBike();

        car.showType(); // Vehicle type: Car
        bike.showType(); // Vehicle type: Bike
    }
}
