package Return_Keyword;

public class d_ReturnMultipleValues {
	static int[] getCoordinates() {
		return new int[] {10, 20};
	}
	
	public static void main(String[] args) {
		int[] coords = getCoordinates();
		
		System.out.println(coords[0]+", "+coords[1]);
	}
}
