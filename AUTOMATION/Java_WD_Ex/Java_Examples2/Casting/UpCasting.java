package Casting;

class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog Barks");
    }
}

public class UpCasting {
	public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();
    }
}
