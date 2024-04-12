package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.PanelUI;
import java.time.Duration;

public class Checkout extends PageBase
{
    WebDriverWait wait;
    JavascriptExecutor js;

    public Checkout(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(150));
         js = (JavascriptExecutor) driver;

    }
     Cart cartobj;
    @FindBy(name="BillingNewAddress.FirstName")
    WebElement fnametxt;
    @FindBy(id="BillingNewAddress_LastName")
    WebElement lnametxt;
    @FindBy(id="BillingNewAddress_Email")
    WebElement emailtxt;

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryddl;

    @FindBy(id = "BillingNewAddress_City")
    WebElement cityddl;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addresstxt;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement codetxt;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phonetxt;

    @FindBy(name = "save")
    WebElement savebtn;

    @FindBy(id = "shippingoption_1")
    WebElement shipping_method;
    @FindBy(css = "button.button-1.shipping-method-next-step-button")
    WebElement CONTINUE2;

    @FindBy(id = "paymentmethod_1")
    WebElement creditcard;

    @FindBy(css = "button.button-1.payment-method-next-step-button")
    WebElement continue3;

    @FindBy(id="CardholderName")
    WebElement cardname;
    @FindBy(id="CardNumber")
    WebElement cardnumber;

    @FindBy(id="ExpireMonth")
    WebElement month;

    @FindBy(id="ExpireYear")
    WebElement year;

    @FindBy(id="CardCode")
    WebElement code3;

    @FindBy(css="button.button-1.payment-info-next-step-button")
    WebElement continue4;



    @FindBy(css = "button.button-1.confirm-order-next-step-button")
    WebElement confirmbtn;

    @FindBy(css = "div.title")
   public WebElement ordersuccess;

    @FindBy(css ="button.button-1.order-completed-continue-button")
   public WebElement continuebtn;
    Select selectddl;



    public void checkoutfunction(String city,String address,String code,String holder,
                                 String phone , String creditnumber,String cardcode) throws InterruptedException {



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("BillingNewAddress_CountryId")));
        selectddl=new Select(countryddl);
       selectddl.selectByIndex(2);
        sendKeys(cityddl,city);
        sendKeys(addresstxt,address);
        sendKeys(codetxt,code);
        sendKeys(phonetxt,phone);
        clickButton(savebtn);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("shippingoption_1")));
        clickButton(shipping_method);
        clickButton(CONTINUE2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("paymentmethod_1")));
        clickButton(creditcard);
        clickButton(continue3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CardholderName")));
        sendKeys(cardname,holder);
        sendKeys(cardnumber,creditnumber);
        selectddl=new Select(month);
        selectddl.selectByIndex(1);
        selectddl=new Select(year);
        selectddl.selectByIndex(2);
        sendKeys(code3,cardcode);
        clickButton(continue4);

        // js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
       // js.executeScript("arguments[0].scrollIntoView(true);",confirm);
        //wait.until(ExpectedConditions.elementToBeClickable(By.className("button-1.confirm-order-next-step-button")));
        Thread.sleep(3000);
      clickButton(confirmbtn);


    }



}
