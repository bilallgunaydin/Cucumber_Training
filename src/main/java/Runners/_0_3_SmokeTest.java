package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import io.cucumber.testng.CucumberOptions;
import com.vimalselvam.cucumber.listener.Reporter;




@CucumberOptions(
        plugin ={
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"

        },
        features = {"src/test/java"},
        glue = {"stepDefinition"},
        dryRun = false,
        tags = "@SmokeTest"
)
public class _0_3_SmokeTest extends AbstractTestNGCucumberTests {
    @AfterClass
    public void afterClass(){
        Reporter.loadXMLConfig("src/main/java/XMLFiles/extendReportSet.xml");
        Reporter.setSystemInfo("QA Tester : ", "Omer Ozdemir");//kendi bilgilerinizi ekleyin.
        Reporter.setSystemInfo("Application name : ", "Your Store Test  ");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber Report");
    }
}
