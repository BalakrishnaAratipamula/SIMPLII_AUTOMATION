package Custom_TestNGAnnotation;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.model.Author;

public class C3_AnnotationReader {
	@BeforeClass
	public void readAnnotations() {
		Method[] methods = C2_SimpleTest.class.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(C1_Author.class)) {
				C1_Author author = method.getAnnotation(C1_Author.class);
				System.out.println("Test: " + method.getName() + ", C1_Author: " + author.name() + ", Created On: "
						+ author.createdOn());
			}
		}
	}
}
