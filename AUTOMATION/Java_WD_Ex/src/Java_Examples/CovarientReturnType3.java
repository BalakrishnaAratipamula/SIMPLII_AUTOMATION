package Java_Examples;

/* A covariant return type in Java allows an overriding method in a subclass to return 
 * a type that is a subclass of the return type declared in the superclass method. */

class Animal3 {
}

class Dog3 extends Animal3 {
}

class Parent3 {
    Animal3 getObject() {
        return new Animal3();
    }
}

class Child3 extends Parent3 {
    @Override
    Dog3 getObject() {    // Covariant return type  
        return new Dog3(); 
    }
}

public class CovarientReturnType3 {

}
