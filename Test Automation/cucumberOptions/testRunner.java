package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "/home/cmdq3/IdeaProjects/WamlyUpdateUser/src/test/java/features", glue = "stepDefinition", monochrome = true, plugin = {"pretty", "html:target/Report/Test Report.html"})
public class testRunner extends AbstractTestNGCucumberTests {

}
