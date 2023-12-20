package myTestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
*/

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features",//Features file folder name (or) u can give Features file folder path of also 
		glue="stepDefinitions", //always in which package 'stepdefinitions' was there
		dryRun = false,	//true - it will cross check whether every step corresponding methods implemented or not & false - for execute
		///,tags= {"@tag2"}//package name where my stepDefinitions are there
		plugin = {"pretty","html:test-output"} //pretty - to give clear Result /// plugin = {"pretty", "html:target/Destination"})
		)

public class TestRunner {
	
}
