package Java_Examples;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Override toString()
	@Override
	public String toString() {
		return "Person{name='"+ name +"', age="+ age + "}";
	}
}

public class toString_Ex {
	public static void main(String[] args) {
		Person p = new Person("John", 25);
		System.out.println(p); // prints: Person{name='John', age=25}
	}
}
