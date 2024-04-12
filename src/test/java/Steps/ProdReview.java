package Steps;

import Pages.Review;
import Pages.prodectDetails;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import tests.TestBase;

import java.time.Duration;

public class ProdReview extends TestBase
{
    prodectDetails prodDetailobj;
    Review reviewobj;

    WebDriverWait wait;

    @Given("I am on the product details page and click review link")
    public void iAmOnTheProductDetailsPageAndClickRevuiewLink()
    {
       System.out.println("i am already in product  page ");
    }

    @When("I submit a review with the following details review_title {string} and review_text {string}")
    public void iSubmitAReviewWithTheFollowingDetails(String review_title, String review_text) throws InterruptedException {
          prodDetailobj=new prodectDetails(driver);
          prodDetailobj.ClickLinkReview();
          reviewobj=new Review(driver);
          reviewobj.addReview(review_title, review_text);

    }

    @Then("the review should be successfully added")
    public void theReviewShouldBeSuccessfullyAdded()
    {
        Assert.assertTrue(reviewobj.result.getText().contains("Product review is successfully added"));
        reviewobj.backToProd();
    }


}
