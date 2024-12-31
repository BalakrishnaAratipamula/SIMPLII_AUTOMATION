package Interface_MarkerInterface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class NotSerializableClass {
	private String data = "not searializable";

	public String getData() {
		return data;
	}
}

public class MerkerInterface_NotSerializableClass {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		NotSerializableClass obj = new NotSerializableClass();
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("output.txt"))){
			oos.writeObject(obj); //throws NotSerializableException
		} catch(Exception e) {
			System.out.println("searialization failed: "+e);
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("*****Check the doenloaded file in project folder*****");
		}
	}
}
