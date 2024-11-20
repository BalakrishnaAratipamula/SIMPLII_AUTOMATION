package Java_Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TransientKeyword2 implements Serializable {
	 private static final long serialVersionUID = 1L; // Recommended for Serializable classes
	    private String name; // Serializable
	    private transient String password; // Not Serializable

	    public TransientKeyword2(String name, String password) {
	        this.name = name;
	        this.password = password;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Password: " + password;
	    }
	    
	    public static void main(String[] args) {
	    	TransientKeyword2 obj = new TransientKeyword2("Alice", "secret123");

	        // Serialize the object
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("example.ser"))) {
	            oos.writeObject(obj);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Deserialize the object
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("example.ser"))) {
	        	TransientKeyword2 deserializedObj = (TransientKeyword2) ois.readObject();
	            System.out.println("Deserialized Object: " + deserializedObj);
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
}
