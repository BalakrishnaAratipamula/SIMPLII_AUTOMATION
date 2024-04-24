package Java_Examples;

import java.util.ArrayList;

public class Zigzag_Conversion {

	public static String convert(String str, int strRow) {
		if(strRow==1 || str.length()<strRow) {
			return str;
		}
		
		ArrayList<StringBuilder> al = new ArrayList<>();	//or can take all time 'StringBuffer' also
		for(int i=0; i<strRow; i++) {
			//al.add(new StringBuilder());   //String Builder element (i.e., SB object)  //or can take 'StringBuffer' obj also
			System.out.println(al.add(new StringBuilder()));  //'add()' belongs to ArrayList and return boolean result after adding 'StringBuilder objects' into 'ArrayList'  
		}
		System.out.print("\n");
		
		int k=0; 
		
		boolean down = false;
		for(char ch : str.toCharArray()) {
			System.out.println("ch: at k="+k+" : "+ch);
			System.out.println("append: "+al.get(k).append(ch));
			if(k==0 || k==strRow-1) {	// 0 'or' strRow-1	//// 0 || 2
//				down = !down;
				System.out.println(down = !down);
			}								// taking false-true from down i.e. if down is 'false' ==> then cond is 'false' (or) if down is 'true' ==> then cond is 'true'		   				
			int value = k+= down ? 1:-1;    //cond ? val1:val2	//if cond 'false' print 'min' value  //simply if 'true' +1 will add to 'k' value  
			System.out.println("value: "+value);	//value = k+1 or k-1							 //simply if 'false' -1 will add to 'k' value
			System.out.println();
		}					   						//if cond 'true' print 'max' value
		
		StringBuilder sb = new StringBuilder();
		for(StringBuilder str2 : al) {
			System.out.println(str2);
			sb.append(str2);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "BALAKRISHNAARATIPAMULA123";
		int strRow = 7;
		
		System.out.print("\n"+convert(str, strRow));
	}
}
