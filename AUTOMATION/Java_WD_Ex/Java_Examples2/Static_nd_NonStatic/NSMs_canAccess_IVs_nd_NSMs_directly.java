package Static_nd_NonStatic;

class Person {
    String name; // instance variable
    int age;     // instance variable

    // non-static method
    void displayInfo() {
        System.out.println("Name: " + name); // accessing instance variable directly
        System.out.println("Age: " + age);   // accessing instance variable directly
        greet(); // calling another non-static method directly
    }

    // another non-static method
    void greet() {
        System.out.println("Hello " + name);
    }
}

public class NSMs_canAccess_IVs_nd_NSMs_directly {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Bala";
        p.age = 25;
        p.displayInfo(); // works fine
    }
}

