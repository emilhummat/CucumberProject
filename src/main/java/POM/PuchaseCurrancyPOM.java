package POM;

import Utilities.Driver;
import cucumber.api.java.eo.Se;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class PuchaseCurrancyPOM extends BasePOM {
    public PuchaseCurrancyPOM() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "pc_currency")
    public WebElement Currency;
    @FindBy(id = "pc_amount")
    private WebElement amount;
    @FindBy(id = "pc_inDollars_true")
    private WebElement dollarRadio;
    @FindBy(id = "pc_inDollars_false")
    private WebElement SelectedRadio;
    @FindBy(id = "pc_calculate_costs")
    private WebElement CalculateCostButton;
    @FindBy(id = "purchase_cash")
    private WebElement PurchaseButton;
    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    private WebElement PurchaseForeignCurrencyPage;
    @FindBy(id = "alert_content")
    public WebElement Alert2;

    WebElement myElement;

    public void findElementAndClick(String ElementName) {
        switch (ElementName) {
            case "PurchaseForeignCurrencyPage":
                myElement = PurchaseForeignCurrencyPage;
                break;
            case "dollarRadio":
                myElement = dollarRadio;
                break;
            case "SelectedRadio":
                myElement = SelectedRadio;
                break;
            case "CalculateCostButton":
                myElement = CalculateCostButton;
                break;
            case "PurchaseButton":
                myElement = PurchaseButton;
                break;
        }
        waitAndClick(myElement);
    }

    public void findElementAndSendKeys(String elementName, String value) {
        switch (elementName) {
            case "amount":
                myElement = amount;
                break;
        }
        waitAndSendKeys(myElement, value);
    }

    public void dropdownHandle() {
        Select select = new Select(Currency);
        Random random = new Random();
        int num = random.nextInt(select.getOptions().size());
        select.selectByIndex(num);

    }

    public void Verify() {
        try {
            wait.until(ExpectedConditions.visibilityOf(Alert2));
        } catch (Exception e) {
            System.out.println("Form is not filled properly");
        }
    }
}

