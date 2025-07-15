package Java_Examples;

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class equals_nd_hashCode_diff {
	public static void main(String[] args) {
        Person2 p1 = new Person2("John", 25);
        Person2 p2 = new Person2("John", 25);

        System.out.println(p1.equals(p2)); // false (different objects)
        System.out.println(p1.hashCode()); // different hash codes
        System.out.println(p2.hashCode());
    }
}
