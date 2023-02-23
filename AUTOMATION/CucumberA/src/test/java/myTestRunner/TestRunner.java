package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",//Features file folder name (or) u can give Features file folder path of also 
		glue="stepDefinitions"
	///,tags= {"@tag2"}//package name where my stepDefinitions are there
		)
public class TestRunner {
	
}
