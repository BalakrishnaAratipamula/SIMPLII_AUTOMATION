package Custom_TestNGAnnotation;

import org.testng.annotations.Test;

public class C2_SimpleTest extends C3_AnnotationReader{
	@C1_Author(name = "Balakrishna", createdOn = "25-July-2025")
	@Test
	public void testLogin() {
		System.out.println("Executing login test");
	}

	@C1_Author(name = "John Doe")
	@Test
	public void testSearch() {
		System.out.println("Executing search test");
	}
}
