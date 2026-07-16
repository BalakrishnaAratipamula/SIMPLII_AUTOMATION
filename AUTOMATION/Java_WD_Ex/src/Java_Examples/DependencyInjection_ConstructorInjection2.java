package Java_Examples;

class Engine2 {
    void start() {
        System.out.println("Engine Started");
    }
}

class Car2 {
    private Engine2 engine;

    // Dependency injected through constructor
    Car2(Engine2 engine) {
        this.engine = engine;
    }

    void drive() {
        engine.start();
    }
}

public class DependencyInjection_ConstructorInjection2 {
	public static void main(String[] args) {
        Engine2 engine = new Engine2();
        Car2 car = new Car2(engine); // Injecting dependency
        car.drive();
    }
}
