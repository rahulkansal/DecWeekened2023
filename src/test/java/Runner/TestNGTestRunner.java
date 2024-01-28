package Runner;

import Capability.CapabilityBase;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features/Login.feature",
glue ="stepsDefinition", tags = "@Sanity",
plugin= {"pretty","html:target/cucumber.html","json:target/Cucumber.json","junit:target/Cucumber.xml"})

public class TestNGTestRunner extends CapabilityBase{

}
