package ReRun_Failed_TCs_using_IAnnotationTransformer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class S2_ImplementingIAnntationTransformer implements IAnnotationTransformer {
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(S1_RetryAnalyzerDemo.class);	//IRetryAnalyzer implementation class
	}
}
