package Java_Examples;

import java.io.Serializable;

public class TransientKeyword2 implements Serializable {
	private static final long serialVersionUID = 1L;

	private String username;
	private transient String password; // this field will not be serialized

	public TransientKeyword2(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User{" +
	               "username='" + username + '\'' +
	               ", password='" + password + '\'' +
	               '}';
	}
	
	public static void main(String[] args) {
		TransientKeyword2 obj = new TransientKeyword2("Bala", "Pass@1");
		System.out.println(obj.toString());
		
	}
}
