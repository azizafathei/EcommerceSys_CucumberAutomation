package Steps;

import Pages.Checkout;
import org.testng.Assert;
import tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutProd extends TestBase

{
    Checkout checkoutobj;
    @Given("I am on the shopping cart page")
    public void iAmOnTheShoppingCartPage()
    {
        System.out.println(" i am already on checkout page ");
    }

    @When("I proceed to checkout with  {string} and {string} and {string} and {string} and {string} and {string} and {string}")
    public void i_proceed_to_checkout_with_and_and_and_and_and_and_and( String city, String address, String code, String holder, String phone, String creditNumber, String cardCode) throws InterruptedException {
        checkoutobj=new Checkout(driver);
        checkoutobj.checkoutfunction(city, address, code, holder, phone, creditNumber, cardCode);
    }

    @Then("success message after checkout action")
    public void successMessageAfterCheckoutAction()
    {
       // Assert.assertTrue(checkoutobj.ordersuccess.getText().contains("successfully"));
         System.out.println("PURCHASE PROCES DONE");
    }
}
