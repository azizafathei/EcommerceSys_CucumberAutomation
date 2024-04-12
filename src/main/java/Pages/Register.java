package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register extends PageBase
{

    @FindBy(id = "gender-male")
    WebElement genderRadioBUtton;
    @FindBy(id = "FirstName")
    WebElement FirstNameTXT;

    @FindBy(id = "LastName")
    WebElement LastNameTXT;

    @FindBy(id = "Email")
    WebElement EmailTXT;

    @FindBy(id = "Password")
    WebElement PasswordTXT;

    @FindBy(id = "ConfirmPassword")
    WebElement ConfirmPasswordTXT;

    @FindBy(id = "register-button")
    WebElement RegisterButton;
    @FindBy(css ="div.result")
    public WebElement RegisterSuccess;

    @FindBy(linkText = "CONTINUE")
    WebElement ContinueButon;

    public Register(WebDriver driver) {
        super(driver);
    }

    public void userRegister(String fnamevalue,String lnamevalue,String emailvalue,  String passwordvalue)
    {
        clickButton(genderRadioBUtton);
        sendKeys(FirstNameTXT,fnamevalue);
        sendKeys(LastNameTXT,lnamevalue);
        sendKeys(EmailTXT,emailvalue);
        sendKeys(PasswordTXT,passwordvalue);
        sendKeys(ConfirmPasswordTXT,passwordvalue);
        clickButton(RegisterButton);


    }
    public void Continue()
    {
        clickButton(ContinueButon);
    }

}
