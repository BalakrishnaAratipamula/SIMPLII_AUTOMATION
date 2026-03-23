package Java_Examples;

final class Employee5 {
    private final int id;
    private final String name;

    public Employee5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class ImmutableClass2 {
	public static void main(String[] args) {
		// Using Immutable Class
		Employee5 emp = new Employee5(1, "John");

		// No way to modify data
		System.out.println(emp.getName()); // John
	}
}
