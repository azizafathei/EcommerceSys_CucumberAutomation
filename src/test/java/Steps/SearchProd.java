package Steps;

import Pages.Home;
import Pages.prodectDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class SearchProd  extends TestBase
{
    Home homeobj;
    prodectDetails prodobj;
    String proName= "Apple MacBook Pro 13-inch";

    @Given("I am on the home page")
    public void iAmOnHomePage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @When("I search for {string}")
    public void iSearchForProduct(String proName) throws InterruptedException
    {
        prodobj=new prodectDetails(driver);
           prodobj.SearchProductAutoComplete(proName);
    }

    @Then("I should see search results for {string}")
    public void iShouldSeeSearchResults(String ExpectedProd)
    {
        prodobj=new prodectDetails(driver);
        Assert.assertTrue(prodobj.prodName.getText().equalsIgnoreCase(ExpectedProd));

    }

}
