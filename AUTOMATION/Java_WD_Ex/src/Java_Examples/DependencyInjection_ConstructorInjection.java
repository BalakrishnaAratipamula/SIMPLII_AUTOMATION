package Java_Examples;

////////////////Constructor Injection

interface Engine {
    void start();
}

// Dependency
class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol engine started");
    }
}

// Dependent class
class Car {
    private Engine engine;

    // Dependency is injected via constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running");
    }
}

// Test class
public class DependencyInjection_ConstructorInjection {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();  // Create dependency
        Car car = new Car(engine);           // Inject dependency
        car.startCar();
    }
}

