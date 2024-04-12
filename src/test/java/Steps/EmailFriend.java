package Steps;

import Pages.EmailProdFriend;
import Pages.prodectDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import tests.TestBase;

public class EmailFriend extends TestBase
{
    prodectDetails prodobj;
    EmailProdFriend mailobj;

    @Given("I am on the product details page to email friend")
    public void iAmOnTheProductDetailsPagetoemailfriend()
    {
        System.out.println(" i am already in prod details page");
    }

    @When("I enter friend's  email {string}  and  message {string}  click on the send button")
    public void i_enter_friend_s_email_and_message_click_on_the_send_button(String email, String message)

    {
        prodobj=new prodectDetails(driver);
        prodobj.ClickEmailProdBTN();
        mailobj=new EmailProdFriend(driver);
        mailobj.EmailFriend(email, message);
    }



    @Then("the email should be sent successfully")
    public void emailShouldBeSentSuccessfully()
    {
        Assert.assertTrue(mailobj.result.getText().contains("Your message has been sent."));
        mailobj.backToProd();
    }
}
