package Inheritance;

public class E01_Chclass extends E01_Parclass {
	
public void userLogin() {
	System.out.println("to validate login fuctionality.....from childClass");
}

public static void main(String[] args) {
	E01_Chclass obj = new E01_Chclass();
	obj.setUp();
	obj.tearDown();
	obj.userLogin();
}
}
