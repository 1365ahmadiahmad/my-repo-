package copstonetests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features  = "Features",
		glue      = "copstonetests"
		
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
