package RuntimeP_or_MethodOverriding;

class Animal{
	void makesound(){
		System.out.println("Animal - makesound");
	}
}

class Dog extends Animal{
	void makesound() {
		System.out.println("Dog - makesound");
	}
}

public class XEx2_MethodOverriding {
	public static void main(String[] args) {
		Animal dg = new Dog();
		dg.makesound();
	}
}
