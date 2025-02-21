package ShallowCopy_DeepCopy;

class Address {
	String city;

	Address(String city) {
		this.city = city;
	}
}

class Person implements Cloneable {
	String name;
	Address address;

	Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	// Overriding clone() to create a shallow copy
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class E1_ShallowCopyEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("New York");
		Person person1 = new Person("John", address);

		// Creating a shallow copy
		Person person2 = (Person) person1.clone();

		// Modifying the address of cloned object
		person2.address.city = "Los Angeles";

		// Changes reflect in original object
		System.out.println(person1.name + " lives in " + person1.address.city);
		System.out.println(person2.name + " lives in " + person2.address.city);
	}
}
