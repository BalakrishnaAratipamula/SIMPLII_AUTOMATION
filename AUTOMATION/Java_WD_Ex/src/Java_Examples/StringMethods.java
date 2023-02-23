package Java_Examples;

public class StringMethods {
public static void main(String args[]) {
	String str = "BalaKrishna";
	String str2 = "";
	String str3 = " ";
	String str4 = "Bhanu";
	String str5 = "Chander";
	String str6 = " Bhanu ";
	String str7 = "Bhanu Chander";
	
			//length()
			System.out.println("length()");
			System.out.println(str.length());
			System.out.println();
			//charAt()
			System.out.println("charAt()");
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));
			System.out.println(str.charAt(9));
			//indexOf()
			System.out.println("indexOf()");
			System.out.println(str.indexOf("i"));
			System.out.println();
			//toUpperCase()
			System.out.println("toUpperCase()");
			System.out.println(str.toUpperCase());
			System.out.println();
			//toLowerCase
			System.out.println("toLowerCase");
			System.out.println(str.toLowerCase());
			System.out.println();
			//equals()
			System.out.println("equals");
			System.out.println(str.equals("balakrishna"));
			System.out.println(str.equals("BalaKrishna"));
			System.out.println();
			//equalsIgnoreCase()
			System.out.println("equalsIgnoreCase()");
			System.out.println(str.equalsIgnoreCase("balakrishna"));
			System.out.println(str.equalsIgnoreCase("BalaKrishna"));
			System.out.println();
			//startsWith()
			System.out.println("startsWith()");
			System.out.println(str.startsWith("Bal"));
			System.out.println();
			//endsWith()
			System.out.println("endsWith()");
			System.out.println(str.endsWith("na"));
			System.out.println();
			//contains()
			System.out.println("contains()");
			System.out.println(str.contains("ri"));
			System.out.println(str.contains("la"));
			System.out.println();
			//isEmpty()
			System.out.println("isEmpty()");
			System.out.println(str.isEmpty());
			System.out.println(str2.isEmpty());
			System.out.println(str3.isEmpty());
			System.out.println();
			//concat()
			System.out.println("concat()");
			System.out.println(str4.concat(str5));
			System.out.println(str5+str4);
			System.out.println();
			//trim()
			System.out.println("trim()");
			System.out.println(str6.length());
			System.out.println(str6.trim().length());
			System.out.println(str7.length());
			System.out.println(str7.trim().length());
			System.out.println();
			//replace();
			System.out.println("replace()");
			System.out.println(str.replace("a", "@"));
			System.out.println(str7.replace(" ", ""));
			System.out.println();
			//substring()
			System.out.println("substring()");
			//To read Krishna
			System.out.println(str.substring(4));
			//To read BalaKrishna
			System.out.println(str.substring(0));
			//To read K
			System.out.println(str.substring(4,5));
			//To read Kri
			System.out.println(str.substring(4,7));
}
}
