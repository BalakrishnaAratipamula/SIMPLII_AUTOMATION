package Types_Of_Inheritance;

//class 
class Animal2 {
	void eat() {
		System.out.println("The Animal2 is eating");
	}
}

//class 
class Dog2 extends Animal2 {
	void eat() {
		System.out.println("The Dog2 is eating");
	}
}

//class 
class Monkey2 extends Dog2 {
	void eat() {
		System.out.println("The Monkey2 is eating");
	}
}

//main class
public class E2_Multilevel_Inheritance {
	public static void main(String[] args) {
		Animal2 mi1 = new Dog2();
		Animal2 mi2 = new Monkey2();
		Animal2 mi3 = new Animal2();
		mi1.eat();
		mi2.eat();
		mi3.eat();
	}

}
