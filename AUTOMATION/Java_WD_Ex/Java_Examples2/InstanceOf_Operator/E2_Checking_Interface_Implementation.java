package InstanceOf_Operator;

interface Pet {
}

class Cat implements Pet {
}

public class E2_Checking_Interface_Implementation {
	public static void main(String[] args) {
		Cat myCat = new Cat();
		System.out.println(myCat instanceof Pet); // true
	}
}
