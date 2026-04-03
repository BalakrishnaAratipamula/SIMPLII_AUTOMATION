package Java_Examples;

//Base class
class Animal {
 void sound() {
     System.out.println("Some generic animal sound");
 }
}

//Subclass of Animal
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Bark");
 }
}

//Parent class with a method returning Animal
class Parent {
 Animal getAnimal() {
     System.out.println("Parent: Returning Animal");
     return new Animal();
 }
}

//Child class overriding method with covariant return type (returns Dog)
class Child extends Parent {
 @Override
 Dog getAnimal() {
     System.out.println("Child: Returning Dog");
     return new Dog();
 }
}


public class CovarientReturnType2 extends Animal {
	public static void main(String[] args) {
        Parent parentRef = new Parent();
        Animal a1 = parentRef.getAnimal(); // returns Animal
        a1.sound();                        // Output: Some generic animal sound

        Parent childRef = new Child();
        Animal a2 = childRef.getAnimal();  // returns Dog (covariant)
        a2.sound();                        // Output: Bark
    }
}
