package WD_Examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;

public class EX86_ManageTestData_nd_EnvironmentConfiguration_inAutomation {
	// Using Properties file
	private static Properties properties = new Properties();

	static {
		try {
			FileInputStream file = new FileInputStream("./src/test/resources/config.properties");
			properties.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String key) {
		return properties.getProperty(key);
	}

	// Usage
	String url = EX86_ManageTestData_nd_EnvironmentConfiguration_inAutomation.getProperty("base.url");
	String username = EX86_ManageTestData_nd_EnvironmentConfiguration_inAutomation.getProperty("test.username");
	String password = EX86_ManageTestData_nd_EnvironmentConfiguration_inAutomation.getProperty("test.password");

	// Using JSON for test data
	public static class TestDataReader {
		public static Map<String, Object> readTestData(String testDataFile) throws IOException {
			String content = new String(Files.readAllBytes(Paths.get(testDataFile)));
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(content, Map.class);
		}
	}
}

// If u want to execute create properties file ---P Properties file example (config.properties)
/*
 * base.url=https://example.com 
 * browser=chrome 
 * wait.timeout=10
 * test.username=user@example.com 
 * test.password=password123 
 * environment=staging*
 */
