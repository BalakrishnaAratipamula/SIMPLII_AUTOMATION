package Return_Keyword;

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
}

public class c_ReturnObjects {
	static Person createPerson(String name) {
		return new Person(name);
	}
	
	public static void main(String[] args) {
		Person p = createPerson("Ramesh");
		System.out.println(p);
		System.out.println(p.name);
	}
}
