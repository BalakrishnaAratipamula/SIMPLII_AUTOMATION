package ShallowCopy_DeepCopy;

class Address implements Cloneable {
	String city;

	Address(String city) {
		this.city = city;
	}

	// Overriding clone() to create a Deep copy
	public Object clone() throws CloneNotSupportedException {
		return super.clone(); // Clone Address object
	}
}

class Employee implements Cloneable {
	String name;
	Address address;

	Employee(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	// Overriding clone() to create a Deep copy
	public Object clone() throws CloneNotSupportedException {
		Employee cloned = (Employee) super.clone();
		cloned.address = (Address) address.clone(); // Cloning inner object
		return cloned;
	}
}

public class E2_DeepCopyEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address("New York");
		Employee e1 = new Employee("Alice", addr);
		
		// Creating a deep copy
		Employee e2 = (Employee) e1.clone(); // Cloning e1

		System.out.println("Original Address: " + e1.address.city);
		System.out.println("Cloned Address: " + e2.address.city);

		// Modifying the address of cloned object
		e2.address.city = "Los Angeles"; // Change in cloned object

		System.out.println("After modification:");
		System.out.println("Original Address: " + e1.address.city);
		System.out.println("Cloned Address: " + e2.address.city);

	}
}
