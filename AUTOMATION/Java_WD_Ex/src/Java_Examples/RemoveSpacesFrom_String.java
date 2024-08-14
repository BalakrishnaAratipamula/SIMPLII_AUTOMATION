package Java_Examples;

public class RemoveSpacesFrom_String {
	public static void main(String[] args) {
		String str = "Trail V ersion";
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ')
				sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}

}
