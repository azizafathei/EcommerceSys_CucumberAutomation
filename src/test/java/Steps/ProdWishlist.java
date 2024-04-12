package Steps;

import Pages.Home;
import Pages.prodectDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class ProdWishlist extends TestBase


{
    prodectDetails prodobj;
    Home homeobj;

    @Given("I am on the product details page")
    public void iAmOnTheProductDetailsPage()
    {
        System.out.println("i am already in product details  page ");

        //driver.navigate().refresh();
    }

    @When("I click on the Add to Wishlist button")
    public void iClickOnAddToWishlistButton()
    {
        prodobj=new prodectDetails(driver);
        prodobj.ClickWishBTN();
    }

    @Then("the product should be added to my wishlist")
    public void theProductShouldBeAddedToMyWishlist()
    {
        System.out.println("prod added to wishlist");
        //Assert.assertTrue(prodobj.successmsg.getText().contains("The product has been added to your "));

    }

    }
