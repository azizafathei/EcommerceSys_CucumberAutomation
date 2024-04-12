package Runneres;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import tests.TestBase;


@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner extends TestBase
{

}
