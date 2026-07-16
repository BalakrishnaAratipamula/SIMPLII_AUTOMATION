package Java_Examples;

/* A covariant return type in Java allows an overriding method in a subclass to return 
 * a type that is a subclass of the return type declared in the superclass method. */

class SuperClass2 {
	SuperClass2 getObject() {
        return new SuperClass2();
    }
}

class SubClass2 extends SuperClass2 {
    @Override
    SubClass2 getObject() {   // Covariant return type
        return new SubClass2();
    }
}

public class CovarientReturnType4 {

}
