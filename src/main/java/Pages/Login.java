package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends PageBase{
    public Login(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "Email")
    WebElement EmailTXT;

    @FindBy (id = "Password")
    WebElement PasswordTXT;

    @FindBy(css="button.button-1.login-button")
    WebElement LoginButton;

    public void UserLogin(String Email, String Password)
    {
        sendKeys(EmailTXT, Email);
        sendKeys(PasswordTXT,Password);
        clickButton(LoginButton);

    }
}
