package StepDefinitions;

import POM.PayBillsPOM;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class MyStepdefs {
    PayBillsPOM pay=new PayBillsPOM();
    @Given("^Navigate to Pay Bills$")
    public void navigateToPayBills() {
        pay.findElementAndClick("PayBillsPage");

    }

    @And("^Click on Add New Payee$")
    public void clickOnAdd() {
        pay.findElementAndClick("AddNewPayeePage");

    }

    @And("^Fill out the form \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void fillOutTheForm(String PayeeName, String PayeeAddress, String Account, String PayeeDetails)  {
        pay.FindElementAndSendKeys("PayeeName",PayeeName);
        pay.FindElementAndSendKeys("PayeeAddress",PayeeAddress);
        pay.FindElementAndSendKeys("Account",Account);
        pay.FindElementAndSendKeys("PayeeDetails",PayeeDetails);


    }

    @Then("^Verify adding the Payee Account$")
    public void verifyAddingThePayeeAccount() {
        pay.findElementAndClick("AddButton");
        pay.Verify();
    }
}
