package InstanceOf_Operator;

class Animal2 {}
class Dog3 extends Animal2 {}

public class E4_Checking_Parent_Reference_ie_Upcasting {
	public static void main(String[] args) {
        Animal2 a = new Dog3();

        System.out.println(a instanceof Dog3);     // true
        System.out.println(a instanceof Animal2);  // true
    }
}
