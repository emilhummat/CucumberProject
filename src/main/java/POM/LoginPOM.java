package POM;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM extends BasePOM {
    public LoginPOM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id="user_login")
    private WebElement username;
    @FindBy (id="user_password")
    private WebElement password;
    @FindBy(css = "input[name='submit']")
    private WebElement signInButton;

    WebElement myElement;
    public void findElementAndClick(String elementName){
        switch (elementName){
            case "signInButton":
                myElement=signInButton;
                break;
        }
        waitAndClick(myElement);
    }
    public void findElementAndSendKeys(String elementName, String value){
        switch (elementName){
            case "username":
                myElement=username;
                break;
            case "password":
                myElement=password;
                break;
        }
        waitAndSendKeys(myElement,value);
    }
}
