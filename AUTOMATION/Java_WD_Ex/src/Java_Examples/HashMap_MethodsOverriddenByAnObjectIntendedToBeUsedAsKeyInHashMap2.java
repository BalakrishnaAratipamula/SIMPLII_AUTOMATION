package Java_Examples;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id;
    }
}

public class HashMap_MethodsOverriddenByAnObjectIntendedToBeUsedAsKeyInHashMap2 {

}
