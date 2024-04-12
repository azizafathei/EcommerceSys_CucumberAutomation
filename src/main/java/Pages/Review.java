package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Review extends PageBase
{
    private WebDriverWait wait;

    public Review(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver,Duration.ofSeconds(15));
    }

    @FindBy(name = "AddProductReview.Title")
    WebElement Titletxt;

    @FindBy(id = "AddProductReview_ReviewText")
    WebElement texttxt;


    @FindBy(name = "add-review")
    WebElement submitbtn;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement back;

    @FindBy(css = "div.result")
   public  WebElement result;

    public void addReview(String title,String TEXT)
    {
        sendKeys(Titletxt,title);
        sendKeys(texttxt,TEXT);
        clickButton(submitbtn);

    }

    public void backToProd()
    {
               //Thread.sleep(15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
               clickButton(back);

    }
}
