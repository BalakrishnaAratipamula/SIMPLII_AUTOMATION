package ProFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E2_Load_or_Read_Data_from_propertiesFile {
	public static void main(String[] args) {
		Properties props = new Properties();

		try (FileInputStream in = new FileInputStream("config2.properties")) {
			props.load(in);
			System.out.println("Username: " + props.getProperty("username"));
			System.out.println("Password: " + props.getProperty("password"));
			System.out.println("URL: " + props.getProperty("url"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
