package Java_Examples;
//Java int coding qns : #23 Remove Spaces From String
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
