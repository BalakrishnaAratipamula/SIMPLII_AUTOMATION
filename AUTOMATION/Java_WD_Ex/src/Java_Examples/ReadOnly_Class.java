package Java_Examples;

//making Read-only class
class Fruit {
	private String fruitName = "Apple";

	public String getFruitName() {

		return fruitName;
	}
}

public class ReadOnly_Class {
	public static void main(String[] args) {

		Fruit fruit = new Fruit();

		String result = fruit.getFruitName();
		System.out.println("Name of the Fruit:" + " " + result);
	}
}
