package Java_Examples;

import java.util.Date;

final class Employee4 {
    private final String name;
    private final int id;
    private final Date joiningDate; // mutable object

    public Employee4(String name, int id, Date joiningDate) {
        this.name = name;
        this.id = id;
        // Defensive copy for mutable field
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getJoiningDate() {
        // Return a defensive copy
        return new Date(joiningDate.getTime());
    }
}

public class ImmutableClass {

}
