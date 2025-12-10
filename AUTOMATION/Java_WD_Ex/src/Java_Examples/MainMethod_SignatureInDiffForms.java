package Java_Examples;

public class MainMethod_SignatureInDiffForms {
//	public static void main(String[] args) { //valid
//	public static void main(String args[]) { //valid
//	public static void main(String[] a) { //valid
	public static void main(String a[]) { //valid
//	static public void main(String a[]) { //valid
//	static void public main(String a[]) { //in-valid --- Show compile-time error
//	public static void main(int a[]) { //in-valid --- Doesn't show any compile-time error
//	void main(String a[]) public static { //in-valid --- Show compile-time error
		
		System.out.println("Main method executed");
	}
}
