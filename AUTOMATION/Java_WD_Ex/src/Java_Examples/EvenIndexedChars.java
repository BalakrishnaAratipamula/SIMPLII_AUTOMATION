package Java_Examples;

public class EvenIndexedChars {
	public static void main(String[] args) {
		String input = "Automation";
		
		System.out.print("Even Indexed Characters in \""+input+"\":  ");
		
		for(int i=0; i<input.length(); i++) {
			if(i%2==0) 
				System.out.print(input.charAt(i));
		}
	}

}
