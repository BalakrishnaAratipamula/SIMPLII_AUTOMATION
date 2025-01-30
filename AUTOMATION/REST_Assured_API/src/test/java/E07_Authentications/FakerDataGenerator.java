package E07_Authentications;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	@Test
	void testFakerDataaGenerator() {
		
		Faker faker = new Faker();	//check more in off page - https://github.com/DiUS/java-faker
		
		String fullName = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();
		String userName = faker.name().username();	//we can specify length also
		String password = faker.internet().password();	//we can specify length also
		String phoneNumber = faker.phoneNumber().cellPhone();
		String emailString = faker.internet().safeEmailAddress();
		
		System.out.println("Full Name  ----  "+fullName );
		System.out.println("First Name  ----  "+firstName );
		System.out.println("Last Name  ----  "+lastName );
		System.out.println("User Name  ----  "+userName);
		System.out.println("Password  ----  "+password );
		System.out.println("Phone Num  ----  "+phoneNumber );
		System.out.println("Email  ----  "+emailString );
		
	}
}
