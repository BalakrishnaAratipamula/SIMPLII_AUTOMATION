package Java_Examples;

class GenericClass<T> {
	
	T obj;

	void add(T object) {
		this.obj = object;
	}

	T get() {
		return this.obj;
	}
}

class GerericClass {
	public static void main(String[] args) {
		// Pass Integer to Generic Class
		GenericClass<Integer> integerObject = new GenericClass<Integer>();
		integerObject.add(5);
		System.out.println("The Added Integer is : " + integerObject.get());

		// Pass String to Generic Class
		GenericClass<String> stringObject = new GenericClass<String>();
		stringObject.add("Selenium WebDriver");
		System.out.println("The Added String is : " + stringObject.get());

	}

}
