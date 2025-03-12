package ShallowCopy_DeepCopy;

class Person implements Cloneable {
	String name;
    
    Person(String name) {
        this.name = name;
    }

	// Overriding clone() to create a shallow copy
	protected Object clone() throws CloneNotSupportedException {
		return super.clone(); // Calls Object class clone()
	}
}

public class E1_ShallowCopyEx {
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("John");

		// Creating a shallow copy
		Person p2 = (Person) p1.clone(); // Cloning p1 into p2

		System.out.println("Original: " + p1.name);
        System.out.println("Clone: " + p2.name);
	}
}
