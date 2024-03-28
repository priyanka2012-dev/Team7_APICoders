package api.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(features ={"src/test/resources/Features/01UserLogin.feature"}, 
glue = {"api.StepDefinition"}, 
strict = true,
monochrome = true
/*plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm",
		"html:target/Cucumber.html",
		"json:target/cucumber.json",
		"junit:target/JUNITReports/reports.xml"}
*/
)
public class TestRunner 
{

}
