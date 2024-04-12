package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Cart extends PageBase
{
    WebDriverWait wait;
    public Cart(WebDriver driver) {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id="checkout")
    WebElement checkoutbtn;
    @FindBy(id="termsofservice")
    WebElement servicerbtn;

    @FindBy(css="a.product-name")
     public   WebElement prodName;


    public void Precheckout()
    {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("product-name")));
        clickButton(servicerbtn);
        clickButton(checkoutbtn);
    }
}
