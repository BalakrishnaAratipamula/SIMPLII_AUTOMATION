package Java_Examples;

public class try_multipleCatchBlocks {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = Integer.parseInt("ABC");
			System.out.println(2);
		}
		catch(NumberFormatException e) {	//proper catch block to above code
			System.out.println(3);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(4);
		}
		catch(Exception e) {	//it can handle all types of exceptions
			System.out.println(5);
		}
		
		System.out.println("Due to proper & mul catch blocks prog executed successfully");
	}
}
