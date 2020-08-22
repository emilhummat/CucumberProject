package POM;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePOM {
    public WebDriver driver = Driver.getDriver();
    public WebDriverWait wait = new WebDriverWait(driver, 10);


    public void waitAndClick(WebElement element) {
        waitUntilVisible(element);
        element.click();
    }

    public void waitAndSendKeys(WebElement element, String text) {
        waitUntilVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    public void ElementContainsText(WebElement element, String myText) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(myText));
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public double StringToDouble(String str) {
        return Double.parseDouble(str.replace("$", ""));
    }
}

