package ShallowCopy_DeepCopy;

class Address2 implements Cloneable {
	String city;

	Address2(String city) {
		this.city = city;
	}

	protected Object clone() throws CloneNotSupportedException {
		return new Address2(this.city);
	}
}

class Person2 implements Cloneable {
	String name;
	Address2 address;

	Person2(String name, Address2 address) {
		this.name = name;
		this.address = address;
	}

	// Overriding clone() to create a deep copy
	protected Object clone() throws CloneNotSupportedException {
		Person2 cloned = (Person2) super.clone();
		cloned.address = (Address2) address.clone(); // Copying inner object
		return cloned;
	}
}

public class E2_DeepCopyEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address2 address = new Address2("New York");
		Person2 person1 = new Person2("John", address);

		// Creating a deep copy
		Person2 person2 = (Person2) person1.clone();

		// Modifying the address of cloned object
		person2.address.city = "Los Angeles";

		// Changes do not reflect in the original object
		System.out.println(person1.name + " lives in " + person1.address.city);
		System.out.println(person2.name + " lives in " + person2.address.city);
	}
}
