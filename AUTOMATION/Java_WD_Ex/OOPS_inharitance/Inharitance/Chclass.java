package Inharitance;

public class Chclass extends Parclass {
	
public void userLogin() {
	System.out.println("to validate login fuctionality.....from childClass");
}

public static void main(String[] args) {
	Chclass obj = new Chclass();
	obj.setUp();
	obj.tearDown();
	obj.userLogin();
}
}
