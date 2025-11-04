package Java_Examples;

import java.util.Objects;

//@. Which two methods are overridden by an object, intented to be used as key in HashMap
class Employee3 {
    private int id;
    private String name;

    public Employee3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee3)) return false;
        Employee3 emp = (Employee3) o;
        return id == emp.id && Objects.equals(name, emp.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class HashMap_MethodsOverriddenByAnObjectIntendedToBeUsedAsKeyInHashMap {
	//no need to execute 
}
