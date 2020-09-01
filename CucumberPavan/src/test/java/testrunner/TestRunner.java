package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\Selenium Testing\\SkillDrive\\CucumberPavan\\Feature\\login.feature" //path of the feature file
		,glue= {"stepdefinitions"} //the path of the step definition file
		//,monochrome = true   // Display output in a proper readable format
		//,plugin={"pretty","html:target/reports.html", "json:target/JsonReports/cucumber.json", "junit:target/Junitreports/cucumber.xml"}
		//,dryRun = false
		)
public class TestRunner {

}
