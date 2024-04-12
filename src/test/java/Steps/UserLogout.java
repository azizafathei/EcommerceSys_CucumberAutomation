package Steps;

import Pages.Home;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class UserLogout extends TestBase
{
    Home homeobj;
    @Given("User is logged in")
    public void user_is_logged_in()
    {
        homeobj=new Home(driver);
        Assert.assertTrue(homeobj.logout.isDisplayed());
    }
    @When("User clicks on the logout button")
    public void user_clicks_on_the_logout_button() {
        homeobj.logoutApp();

    }
    @Then("User is logged out successfully")
    public void user_is_logged_out_successfully()
    {
        Assert.assertTrue(homeobj.registelink.isDisplayed());
       // System.out.println("done");


    }

}
