package Interface_DefaultMtd;

interface Animal {
	default void sound() {
		System.out.println("sound() from Animal Interface");
	}
}

class Dog implements Animal {
	// Overriding default method
	public void sound() {
		System.out.println("sound() from Dog Class");
	}
}

public class E2_Overriding_Default_Method {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		myDog.sound(); //Calls overridden method
	}
}
