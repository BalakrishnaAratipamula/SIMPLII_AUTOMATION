package Listener_Use_IExecutionListener_to_Mark_Executed_TCs2;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(X2_SkipTestByNameUsingListener.class)
public class X4_MyTests extends X3_BaseClass{

	@Test
    public void m1() {
        System.out.println("m1 Executed--");
    }

    @Test
    public void m2() {
        System.out.println("m2 Executed--");
    }
    
    @Test
    public void m3() {
        System.out.println("m3 Executed--");
    }
    
    @Test
    public void m4() {
        System.out.println("m4 Executed--");
    }
    
    @Test
    public void m5() {
        System.out.println("m5 Executed--");
    }
}
