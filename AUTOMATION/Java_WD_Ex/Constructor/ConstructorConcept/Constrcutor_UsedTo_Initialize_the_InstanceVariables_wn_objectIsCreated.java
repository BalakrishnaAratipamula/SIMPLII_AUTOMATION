package ConstructorConcept;

class Student {
    int id;           // instance variable
    String name;      // instance variable

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Constrcutor_UsedTo_Initialize_the_InstanceVariables_wn_objectIsCreated {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ram");
		Student s2 = new Student(2, "Krishna");
		
		System.out.println(s1.id+"\t"+s1.name);
		System.out.println(s2.id+"\t"+s2.name);
	}
}
