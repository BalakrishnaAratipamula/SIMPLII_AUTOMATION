package Java_Examples;

//making Read-only class
class Fruit {
	private String fruitName = "Apple";

	public String getFruitName() {

		return fruitName;
	}
}

public class Read_Only_Class {
	public static void main(String[] args) {

		Fruit f = new Fruit();

		String result = f.getFruitName();
		System.out.println("Name of the Fruit:" + " " + result);
	}
}
