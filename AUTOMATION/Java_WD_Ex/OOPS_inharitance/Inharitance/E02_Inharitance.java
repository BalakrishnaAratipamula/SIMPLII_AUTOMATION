package Inharitance;

class Animal{
	String sound() {
		return "Generic Sound";
	}
}

class Dog extends Animal{
	String sound() {
		return "Barking";
	}
}
public class E02_Inharitance {
	public static void main(String[] args) {
		//Method 1
		Animal animal = new Dog();
		System.out.println(animal.sound());
		
		//Method 2
		System.out.println(new Dog().sound());
	}
}
