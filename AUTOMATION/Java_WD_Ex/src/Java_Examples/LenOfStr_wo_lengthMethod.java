package Java_Examples;

public class LenOfStr_wo_lengthMethod {

	public static void main(String[] args) {
		String str = "Balakrishna";
		int i=0;
		for(char ch : str.toCharArray()) {
			i++;
		}
		System.out.println("Length of strinhg is:  "+i);
	}

}