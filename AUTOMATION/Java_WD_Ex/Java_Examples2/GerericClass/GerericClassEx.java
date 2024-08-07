package GerericClass;

class Generic_Class<T> {

	T obj;

	void add(T object) {
		this.obj = object;
	}

	T get() {
		return this.obj;
	}
}

class GerericClassEx {
	public static void main(String[] args) {
		// Pass Integer to Generic Class
		Generic_Class<Integer> integerObject = new Generic_Class<Integer>();
		integerObject.add(5);
		System.out.println("The Added Integer is : " + integerObject.get());

		// Pass String to Generic Class
		Generic_Class<String> stringObject = new Generic_Class<String>();
		stringObject.add("Selenium WebDriver");
		System.out.println("The Added String is : " + stringObject.get());

	}
}
