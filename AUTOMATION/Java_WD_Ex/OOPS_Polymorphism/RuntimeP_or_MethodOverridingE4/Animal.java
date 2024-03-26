package RuntimeP_or_MethodOverridingE4;

class Animal {

	void makesound() {
		System.out.println("some generic animal sound");
	}
}

class Dog extends Animal {
	void makesound() {
		System.out.println("Bow!!!Bow!!!");
	}
}

class Cat extends Animal {
	void makesound() {
		System.out.println("Meow!!!Meow!!!");
	}
}
