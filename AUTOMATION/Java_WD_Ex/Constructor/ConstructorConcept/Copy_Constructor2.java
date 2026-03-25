package ConstructorConcept;

class Employee {
    int id;
    String name;

    // Regular constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    Employee(Employee emp) {
        this.id = emp.id;
        this.name = emp.name;
    }
}

public class Copy_Constructor2 {
	public static void main(String[] args) {
        Employee e1 = new Employee(101, "John");
        Employee e2 = new Employee(e1);  // using copy constructor

        System.out.println(e2.id);   // 101
        System.out.println(e2.name); // John
    }
}
