package TestNG_with_WD;

public class EX_setSpeed_method {
	public Selenium selenium;
	public SeleniumServer seleniumserver;

	@Before
	    public void setUp() throws Exception
	{
	        seleniumserver=new SeleniumServer();
	        selenium=new DefaultSelenium("localhost",4444,"*iexplore","http://");
	        selenium.start();
	}

	@Test
	public void testlogin() throws Exception
	        {
	selenium.setSpeed("2000"); 
	}
}
