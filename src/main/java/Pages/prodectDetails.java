package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class prodectDetails extends PageBase{
    public prodectDetails(WebDriver driver) {
        super(driver);
    }

    @FindBy(css ="strong.current-item")
    public WebElement prodName;

    @FindBy(id = "small-searchterms")
    WebElement SearchTXT;
    @FindBy(css ="button.button-1.search-box-button")
    WebElement SearchBTN;

    @FindBy(id = "ui-id-1")
    List<WebElement> ProductList;
    @FindBy(id = "add-to-wishlist-button-4")
    WebElement wishlistlink;

    @FindBy(css ="div.bar-notification.success > p" )
     public WebElement successmsg ;

    @FindBy(linkText ="Add your review")
    public WebElement linkreview;

    @FindBy(css = "button.button-2.email-a-friend-button")
    WebElement EmailprodBTN;
    @FindBy(id = "add-to-cart-button-4")
    WebElement addcardbtn;

    @FindBy(css = "a.ico-cart")
    WebElement cardlist;

    public  void clickcardbtn()
    {
        clickButton(addcardbtn);
    }

    public void opencardlist()
    {
        clickButton(cardlist);
    }

    public void ClickEmailProdBTN()
    {
        clickButton(EmailprodBTN);
    }

    public void ClickLinkReview()
    {
        clickButton(linkreview);
    }
    public void ClickWishBTN()
    {
        clickButton(wishlistlink);

    }


    public void SearchProductAutoComplete(String PROName) throws InterruptedException {
        sendKeys(SearchTXT,PROName);
        Thread.sleep(3000);
        ProductList.get(0).click();
    }

}
