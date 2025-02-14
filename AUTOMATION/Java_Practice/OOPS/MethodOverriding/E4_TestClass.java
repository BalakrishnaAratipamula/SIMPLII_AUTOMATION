package MethodOverriding;
//class
class Animal{
	void makeSound() {
		System.out.println("Some generic sound from Animal");
	}
}

//class
class Dog extends Animal{ 
	void makeSound() {
		System.out.println("Bow!!Boww!!");
	}
}

//class
class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow!!Meow!!");
	}
}

//main
public class E4_TestClass {
	public static void main(String[] args) {
		Animal myAnimal = new Animal(); 
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		myAnimal.makeSound(); //Animal stmt
		myDog.makeSound(); //Dog stmt
		myCat.makeSound(); //Cat stmt
	}
}
