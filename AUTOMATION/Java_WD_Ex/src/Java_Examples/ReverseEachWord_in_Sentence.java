package Java_Examples;
//Java int coding qns : #1 Reverse Each Word In a Sentence
public class ReverseEachWord_in_Sentence {
	public static void main(String[] args) {
		String str = "Reverse Each Word In a String";
		String[] words = str.split(" "); //or "\\s"
		
		String revWord = "";
		for(String word: words) {
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			revWord = revWord + sb.toString() + " ";
		}
		System.out.println(revWord.trim());
	}
}
