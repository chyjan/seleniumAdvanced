package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Feature",
		glue = "stepDefinition",
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
	    monochrome = true
	    )
		
		
		
	public class MyRunnerAdvanced extends AbstractTestNGCucumberTests {
	
	

	
	
}
