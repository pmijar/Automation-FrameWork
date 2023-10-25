package pageObjects;

import Utils.Global_Variables;
import driver.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Base_Page {

    public Base_Page() {
        PageFactory.initElements(getDriver(), this);
    }

    public WebDriver getDriver() {
        return DriverFactory.getDriver();
    }

    public String getRandomNumber(int length) {
        return RandomStringUtils.randomNumeric(length);
    }

    public String getRandomtext(int length) {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public void navigateTo_URL(String url) {
        getDriver().get(url);
    }

    public void sendKeys(By by, String textValue) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(textValue);
    }

    public void sendKeys(WebElement element, String textValue) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).sendKeys(textValue);
    }

    public void click(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void click(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void clickAlert_AssertMessage(String expected_message) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.alertIsPresent());
        String actual_message = getDriver().switchTo().alert().getText();
        Assert.assertEquals(actual_message, expected_message);
    }

    public String getText(By by) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
        return getDriver().findElement(by).getText();
    }

    public String getText(WebElement element) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(Global_Variables.EXPLICIT_TIMEOUT));
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

}
