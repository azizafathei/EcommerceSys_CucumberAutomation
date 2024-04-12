package Steps;

import Pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import tests.TestBase;

import java.sql.DriverManager;

public class Register extends TestBase
{
    public Pages.Register registrationPage;
    public Home homepage;

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page()
    {
        homepage=new Home(driver);
        homepage.OPenRegisterPage();

    }
    @When("I register with firstname {string} and lastname {string} and email {string} and password {string}")
    public void i_register_with_firstname_and_lastname_and_email_and_password(String fname, String lname, String email, String password)
    {
        registrationPage= new Pages.Register(driver);
        registrationPage.userRegister(fname, lname,email,password);

    }
    @Then("I should see a successful registration message")
    public void i_should_see_a_successful_registration_message()
    {
        Assert.assertTrue(registrationPage.RegisterSuccess.getText().equalsIgnoreCase("Your registration completed"));
    }
}
