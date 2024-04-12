package Pages;

import dev.failsafe.internal.util.Durations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EmailProdFriend extends PageBase{
    WebDriverWait wait;
    public EmailProdFriend(WebDriver driver)
    {
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id ="FriendEmail")
    WebElement EmailTXT;


    @FindBy(id ="PersonalMessage")
    WebElement MSGStxt;

    @FindBy(name ="send-email")
    WebElement Submitbtn;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement back;

    @FindBy(css = "div.result")
    public  WebElement result;

    public void EmailFriend(String friendmail,String msg)
    {
        sendKeys(EmailTXT,friendmail);
        sendKeys(MSGStxt,msg);
        clickButton(Submitbtn);
    }

    public void backToProd()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
        clickButton(back);

    }

}
