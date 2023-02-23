package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
	(
	features =".//Features", //to run all FF && //".//Features/Customers.feature"---to run specific FF && {".//Features/Customers.feature",".//Features/Login.feature"} --- to run 2F
	glue ="stepDefinitions", 	//package name of stepDefinition file //execution is same as above we can modify
	dryRun = false, 	//true - it will cross check whether every step corresponding methods implemented or not & false - for execute
	monochrome = true, 	//remove unnecessary characters from console window
	plugin = {"pretty","html:test-output"} //pretty - to give clear output in console
	)

public class TestRunner {

}
