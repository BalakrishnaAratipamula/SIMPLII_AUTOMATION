package Types_Of_Inheritance;

//class
class Animal5 {
	String sound() {
		return "Gereric sound";
	}
}

//class
class Dog5 extends Animal5{
	String sound() {
		return "Barking";
	}
}

//main
public class E7_Single_Inheritance {
	public static void main(String[] args) {
		//1
		Animal5 an5 = new Dog5();
		System.out.println(an5.sound()); //B
		
		//2
		System.out.println(new Dog5().sound()); //B
		System.out.println(new Animal5().sound()); //G
	}
}
