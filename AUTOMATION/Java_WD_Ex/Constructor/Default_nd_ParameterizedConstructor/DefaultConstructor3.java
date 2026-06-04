package Default_nd_ParameterizedConstructor;

class Student {
    int id;
    String name;
}

public class DefaultConstructor3 {
    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor is called automatically
        System.out.println(s1.id);   // 0
        System.out.println(s1.name); // null
    }
}

