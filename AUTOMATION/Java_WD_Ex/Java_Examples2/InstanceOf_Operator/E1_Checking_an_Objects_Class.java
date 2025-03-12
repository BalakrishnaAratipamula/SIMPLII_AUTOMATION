package InstanceOf_Operator;

class Animal {
}

class Dog extends Animal {
}

public class E1_Checking_an_Objects_Class {
	public static void main(String[] args) {
		Dog myDog = new Dog();
		System.out.println(myDog instanceof Dog); // true
		System.out.println(myDog instanceof Animal); // true
		System.out.println(myDog instanceof Object); // true //Object class is a base class of all java classes
	}
}
