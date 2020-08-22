package StepDefinitions;

import POM.PayBillsPOM;
import POM.PuchaseCurrancyPOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PurchaseCurrency {
    PuchaseCurrancyPOM purchase=new PuchaseCurrancyPOM();

    @And("^Choose random currency$")
    public void chooseRandomCurrency() {
        purchase.dropdownHandle();
    }

    @And("^Insert \"([^\"]*)\"$")
    public void insert(String amount) {
    purchase.findElementAndSendKeys("amount",amount);
    }

    @And("^select radio \"([^\"]*)\"$")
    public void selectRadio(String option)  {
    purchase.findElementAndClick(option);
    }

    @And("^Click on calculate cost$")
    public void clickOnCalculateCost() throws InterruptedException {

        purchase.findElementAndClick("CalculateCostButton");
        try {
            purchase.wait.until(ExpectedConditions.alertIsPresent());
            purchase.driver.switchTo().alert().accept();
        }catch (Exception e){
            System.out.println("There is not alert");
        }
        Thread.sleep(3000);
    }

    @And("^Click on Purchase$")
    public void clickOnPurchase() throws InterruptedException {
        purchase.findElementAndClick("PurchaseButton");
        Thread.sleep(3000);
    }

    @And("^Click on PurchaseForeignCurrencyPage$")
    public void clickOnPurchaseForeignCurrencyPage() throws InterruptedException {
        purchase.findElementAndClick("PurchaseForeignCurrencyPage");
        Thread.sleep(3000);
    }

    @Then("^Verify purchase$")
    public void verifyPurchase() {
        purchase.Verify();
    }
}
