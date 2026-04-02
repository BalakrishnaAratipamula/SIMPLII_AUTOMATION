package Java_Examples;

public class coypArray_mtd {
	public static void main(String[] args) {
		int[] source = {1, 2, 3, 4, 5};
        int[] dest = new int[source.length];

		// Copy 3 elements from source starting at index 1 to dest starting at index 0
//		System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        System.arraycopy(source, 0, dest, 0, source.length);

		for(int i : dest) {
		    System.out.print(i + " ");
		}
	}
}
