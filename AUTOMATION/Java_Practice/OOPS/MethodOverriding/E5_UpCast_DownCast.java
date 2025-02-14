package MethodOverriding;

class Animal2 {
	void sound() {
		System.out.println("Animal Sound");
	}
}

class Dog2 extends Animal2{
	void barking() {
		System.out.println("Dog Sound");
	}
}

public class E5_UpCast_DownCast {
	public static void main(String[] args) {
		Animal2 animal = new Dog2(); //Upcast //Syn: Pr pr = new Ch();
		Dog2 dog = (Dog2) animal; //Downcast //Syn: Ch ch = (Ch) pr
		
		animal.sound();
		dog.barking();
	}
}
