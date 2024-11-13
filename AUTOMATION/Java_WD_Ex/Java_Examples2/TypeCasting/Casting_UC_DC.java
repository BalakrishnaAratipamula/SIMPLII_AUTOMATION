package TypeCasting;

class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

public class Casting_UC_DC {
	public static void main(String[] args) {
		Animal animal = new Dog(); // Upcasting
		Dog dog = (Dog) animal; // Downcasting

		dog.sound(); // Access superclass method
		dog.bark(); // Access subclass-specific method
	}
}
