package Reflection;

import java.lang.reflect.Method;

public class Parameterized_Test_Execution_usingReflection {
	public void loginTest(String username, String password, int tokenId) {
		System.out.println("Logging in with Username: " + username + " , Password: " + password + " and tokenId: " + tokenId);
	}

	public static void main(String[] args) throws Exception {
		Parameterized_Test_Execution_usingReflection test = new Parameterized_Test_Execution_usingReflection();
		Method method = test.getClass().getMethod("loginTest", String.class, String.class, int.class);

		Object[][] testData = { { "user1", "pass1", 1234 }, { "user2", "pass2", 5678 }, };

		for (Object[] data : testData) {
			method.invoke(test, data); // Dynamically pass parameters to the method
		}
	}
}
