package ProFile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E1_CreateAndStore_Properties_in_propertiesFile {
	public static void main(String[] args) {
        Properties props = new Properties();

        // Add key-value pairs
        props.setProperty("username", "admin");
        props.setProperty("password", "123456");
        props.setProperty("url", "http://www.amazon.com/"); //it will create like 'url=http\://www.amazon.com/' in .properties file but at the time of getProperty we will get properly 'URL: http://www.amazon.com/' 

        try (FileOutputStream out = new FileOutputStream("config2.properties")) {
            props.store(out, "Configuration Settings");
            System.out.println("Properties file saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
