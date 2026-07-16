package Casting;

class Animal2 {
    void sound() {
        System.out.println("Animal2 Sound");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog2 Barks");
    }
}

public class DownCasting {
	public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting

        Dog d = (Dog) a;      // Downcasting
        d.bark();
    }
}
