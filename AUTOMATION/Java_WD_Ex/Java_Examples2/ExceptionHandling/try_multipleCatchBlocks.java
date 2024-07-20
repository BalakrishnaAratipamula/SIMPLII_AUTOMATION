package ExceptionHandling;

public class try_multipleCatchBlocks {
	/*/
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = Integer.parseInt("ABC");
			System.out.println(2);
		}
		catch(NumberFormatException e) {	//proper catch block to above code
			System.out.println(3);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(4);
		}
		catch(Exception e) {	//it can handle all types of exceptions
			System.out.println(5);
		}
		
		System.out.println("Due to proper & mul catch blocks prog executed successfully");
	} //*/
	
	
	/*/
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[4]=30/0;
		}catch(ArithmeticException e) {
			System.out.println("---ArithmeticException---");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("---ArrayIndexOutOfBoundsException---");
		}catch(Exception e) {
			System.out.println("---Exception---");
		}
		
		System.out.println("Due to proper & mul catch blocks prog executed successfully");
	} //*/
	
	
	public static void main(String[] args) {
        try {
              int a[] = new int[15];
              a[15] = 99 / 0;
        } catch (ArithmeticException e) {
              System.out.println("Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
              System.out.println("ArrayIndexOutOfBounds Exception");
        } catch (Exception e) {
              System.out.println("Parent Exception");
        }
        System.out.println("Prints at the end");
  }
		
}











