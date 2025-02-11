package Types_Of_Inheritance;

//class
class Animal3{
	void eat() {
		System.out.println("The Animal3 is eating");
	}
}

//class
class Dog3 extends Animal3{
	void eat() {
		System.out.println("The Dog3 is eating");
	}
}

//class
class Monkey3 extends Animal3{
	void eat() {
		System.out.println("The Monkey3 is eating");
	}
}

//main
public class E3_Hierarchical_Inheritance {
	public static void main(String[] args) {
		Animal3 hi1 = new Dog3();
		Animal3 hi2 = new Monkey3();
		
		hi1.eat();
		hi2.eat();
	}
}
