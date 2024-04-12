package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.plaf.PanelUI;
import java.time.Duration;
import java.util.List;

public class Home extends PageBase
{
    WebDriverWait wait;
    public Home(WebDriver driver)
    {
        super(driver);
        action= new Actions(driver);
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(30));

    }
    @FindBy(linkText ="Register")
   public WebElement registelink;
    @FindBy(linkText = "Log in")
    WebElement login;
    @FindBy(linkText = "Log out")
    public WebElement logout;

    @FindBy(linkText = "Contact us")
    WebElement ContactLink;
    public void OpenLoginPage()
    {
        clickButton(login);
    }

    @FindBy(linkText = "My account")
    WebElement MyAccountButton;

    @FindBy(id="customerCurrency")
    WebElement currency;
    @FindBy(css = "span.price.actual-price")
    public WebElement SIGN;

    @FindBy(linkText = "Computers ")
    WebElement computermenu;

    @FindBy(linkText = "Notebooks")
    WebElement noteboos;
    @FindBy(id = "small-searchterms")
    WebElement SearchTXT;

    @FindBy(css ="button.button-1.search-box-button")
    WebElement SearchBTN;

    @FindBy(id = "ui-id-1")
    List<WebElement> ProductList;

       @FindBy(css = "span.wishlist-qty")
       public WebElement wishlist_qty;
    public void OPenRegisterPage()
    {
        wait.until(ExpectedConditions.elementToBeClickable(registelink));
        clickButton(registelink);
    }
    public void OPenHomePage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");

    }


    public  void ChangeCurrency()
    {
        select=new Select(currency);
        select.selectByIndex(1);

    }
    public  void OpenMyAccountPage()
    {
        clickButton(MyAccountButton);
    }

    public void OpenContactUSPage( WebDriver driver)
    {
        scrollToBottom(driver);
        clickButton(ContactLink);

    }

    public void logoutApp() {
        clickButton(logout);
    }

    public void Hover()
    {
        action.moveToElement(computermenu).moveToElement(noteboos).click().build().perform();
    }
}
