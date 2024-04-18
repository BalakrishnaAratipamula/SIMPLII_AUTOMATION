package Java_Examples;

import java.util.ArrayList;

public class Zigzag_Conversion {

	public static String convert(String str, int strRow) {
		if(strRow==1 || str.length()<strRow) {
			return str;
		}
		
		ArrayList<StringBuilder> al = new ArrayList<>();
		int k=0;
		for(int i=0; i<strRow; i++) {
			al.add(new StringBuilder());	//String Builder element (i.e., SB object)
		}
		
		boolean down = false;
		for(char ch : str.toCharArray()) {
			al.get(k).append(ch);
			if(k==0 || k==strRow-1) {
				down = !down;
			}				   
			int min = k+=down ? 1:-1;    //cond ? val1:val2	//if cond 'false' print 'min' value
			System.out.println(min);
		}					   						//if cond 'true' print 'max' value
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder str2 : al) {
			System.out.println(str2);
			sb.append(str2);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "BAL";
		int strRow = 2;
		
		System.out.print("\n"+convert(str, strRow));
	}
}
