package ConstructorConcept;

class Student2 {
    int id;
    String name;

    // normal constructor
    Student2(int i, String n) {
        id = i;
        name = n;
    }

    // copy constructor
    Student2(Student2 s) {
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

}

public class Copy_Constructor3 {
	public static void main(String[] args) {
        Student2 s1 = new Student2(1, "Ravi"); //normal constructor will call
        Student2 s2 = new Student2(s1); // copy constructor will call

        s1.display();
        s2.display();
    }
}
