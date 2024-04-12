package Steps;

import Pages.Cart;
import Pages.EmailProdFriend;
import Pages.prodectDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class AddToCart extends TestBase
{
    prodectDetails prodobj;
   Cart cartobj;

    @Given("I am on the product details page to add prod to cart")
    public void i_am_on_the_product_details_page_to_add_prod_to_cart()
    {
        System.out.println("i am already in prod details page ");
    }

    @When("I click on the add to cart button")
    public void iClickOnAddToCartButton()
    {
        prodobj=new prodectDetails(driver);
        prodobj.clickcardbtn();;
        prodobj.opencardlist();


    }

    @Then("the product should be added to the shopping cart")
    public void productShouldBeAddedToShoppingCart()
    {
          cartobj=new Cart(driver);
         Assert.assertTrue(cartobj.prodName.getText().contains("Apple MacBook Pro 13-inch"));
         cartobj.Precheckout();

    }
}
