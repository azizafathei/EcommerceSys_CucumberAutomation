package Runneres;

import org.testng.annotations.Test;
import tests.TestBase;

// here i was trying to order the execution of features files but i handled this point via rename features
// files alphabetically



public class TestRunner3  extends TestBase  {

    @Test(priority = 1)
    public void executeRegisterFeature() {
        runCucumberTests("features/1_Register.feature");
    }

    @Test(priority = 2)
    public void executeLoginFeature() {
        runCucumberTests("features/2_Login.feature");
    }

    // Method to run Cucumber tests
    private void runCucumberTests(String featurePath)
    {
        // Define CucumberOptions
        String[] cucumberOptions = {
                "plugin", "pretty",
                "glue", "Steps", // Specify package containing step definitions
                featurePath // Path to feature file
        };


    }
}
