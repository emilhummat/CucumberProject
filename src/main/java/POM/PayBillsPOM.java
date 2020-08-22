package POM;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class PayBillsPOM extends BasePOM {
    public PayBillsPOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Pay Bills']")
    private WebElement PayBillsPage;
    @FindBy(xpath = "//a[text()='Add New Payee']")
    private WebElement AddNewPayeePage;
    @FindBy(id = "np_new_payee_name")
    private WebElement PayeeName;
    @FindBy(id = "np_new_payee_address")
    private WebElement PayeeAddress;
    @FindBy(id = "np_new_payee_account")
    private WebElement Account;
    @FindBy(id = "np_new_payee_details")
    private WebElement PayeeDetails;
    @FindBy(id = "add_new_payee")
    private WebElement AddButton;
    @FindBy(id = "alert_container")
    public WebElement Alert;




    WebElement myElement;

    public void findElementAndClick(String ElementName) {
        switch (ElementName) {
            case "AddNewPayeePage":
                myElement = AddNewPayeePage;
                break;

            case "AddButton":
                myElement = AddButton;
                break;
            case "PayBillsPage":
                myElement = PayBillsPage;
                break;
        }
        waitAndClick(myElement);
    }

    public void FindElementAndSendKeys(String ElementName, String value) {
        switch (ElementName) {
            case "PayeeName":
                myElement = PayeeName;
                break;
            case "PayeeAddress":
                myElement = PayeeAddress;
                break;
            case "Account":
                myElement = Account;
                break;
            case "PayeeDetails":
                myElement = PayeeDetails;
                break;

        }
        waitAndSendKeys(myElement, value);
    }

    public void Verify() {
        try {
            wait.until(ExpectedConditions.visibilityOf(Alert));
        } catch (Exception e) {
            System.out.println("Form is not filled properly");
        }
    }


}
