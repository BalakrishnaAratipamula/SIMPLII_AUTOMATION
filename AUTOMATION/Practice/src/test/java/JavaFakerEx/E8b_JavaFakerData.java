package JavaFakerEx;

import com.github.javafaker.Faker;

public class E8b_JavaFakerData { //faker class is used to generate dummy/fake data
	public static void main(String[] args) {
		Faker faker = new Faker();

		String fullname = faker.name().fullName();
		String firstname = faker.name().firstName();
		String lastname = faker.name().lastName();
		String password = faker.internet().password();
		String phonenumber = faker.phoneNumber().cellPhone();
		String emailId = faker.internet().safeEmailAddress();
		
		System.out.println("Full Name ---- "+fullname);
		System.out.println("First Name --- "+firstname);
		System.out.println("Last Name ---- "+lastname);
		System.out.println("Password --- "+password);
		System.out.println("Phone Num ---- "+phonenumber);
		System.out.println("Phone Num --s-- "+emailId);
	}
}
