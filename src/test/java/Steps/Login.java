package Steps;

import Pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class Login extends TestBase
{
    Pages.Login loginobj;
    Home homeobj;

    @Given("I navigate to the login page")
    public void navigateToLoginPage()
    {
        homeobj=new Home(driver);
        homeobj.OpenLoginPage();
    }

    @When("I enter valid email {string}  and password {string}  click login button")
    public void enterValidCredentials(String email, String pasword)
    {
        loginobj=new Pages.Login(driver);
        loginobj.UserLogin(email,pasword);
    }



    @Then("I should be logged in successfully")
    public void verifyLoginSuccess()
    {
        Assert.assertTrue(homeobj.logout.isDisplayed());
    }
}
