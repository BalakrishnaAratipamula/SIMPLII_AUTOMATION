package AbstractClass;

//Constructor in Abstract class runs when subclass objects are created.
abstract class Parent {
    Parent() {
        System.out.println("Parent constructor called");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor called");
    }
}

public class AbstractClassConstructor_calling {
    public static void main(String[] args) {
        Child ch = new Child();
    }
}