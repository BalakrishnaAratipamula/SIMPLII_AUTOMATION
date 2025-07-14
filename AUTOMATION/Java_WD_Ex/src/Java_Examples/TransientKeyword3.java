package Java_Examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class TransientKeyword3 implements Serializable{
	String firstName;
	String secondName;
	transient String fullName;
	String email;
	String password;
	Date dob;
	
	TransientKeyword3(String firstName, String secondName, String email, String password, Date dob){
		this.firstName=firstName;
		this.secondName=secondName;
		this.fullName=firstName+" "+secondName;
		this.email=email;
		this.password=password;
		this.dob=dob;
	}
	
	public static void main(String[] args) {
		TransientKeyword3 student = new TransientKeyword3("Salman", "Khan", "salman.khan@gmail.com", "student@123", new Date());
		
		serialize(student);
		deserialize();
	}
	
	//Method to Serialize object
	private static void serialize(TransientKeyword3 student) {
		try {
			System.out.println("TransientKeyword3 Serializing"+student.toString());
			FileOutputStream fos = new FileOutputStream("student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
			fos.close();
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	//Method to De-serialize object
	private static void deserialize() {
		try {
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransientKeyword3 student2 = (TransientKeyword3)ois.readObject();
			System.out.println("TransientKeyword3 De-serializing"+student2.toString());
			ois.close();
			fis.close();
		} catch(IOException | ClassNotFoundException ioe) {
			ioe.printStackTrace();
		}	
	}
	
	@Override
	public String toString() {
		return(
				"Student{"+
				"firstName="+firstName+
				", secondName="+secondName+
				", fullName="+fullName+
				", email="+email+
				", password="+password+
				", dob="+dob+
				"}"
				);
	}
}
