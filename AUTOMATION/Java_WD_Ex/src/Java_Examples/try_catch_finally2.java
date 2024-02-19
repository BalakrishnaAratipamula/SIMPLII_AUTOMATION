package Java_Examples;

public class try_catch_finally2 {
	
	public static void main(String[] args) {
		int i=1;
		try {
			i++;	//2
		}
		catch(Exception e) {
			i++;
		}
		finally {	//this block stmt will prints regardless of an exception
			i++;	//3
		}
		System.out.println(i);
	}
}
