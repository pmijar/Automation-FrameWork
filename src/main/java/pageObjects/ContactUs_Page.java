package pageObjects;

import Utils.Global_Variables;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUs_Page extends Base_Page {

    private static final String expectedSubmitMessage = "Thank You for your Message!";
    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName;
    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName;
    private @FindBy(xpath = "//input[@name='email']")
    WebElement email;
    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comments;
    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit;
    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement submitMessage;

    public ContactUs_Page() {
        super();
    }

    public void navigateTo_ContactUsPage() {
        navigateTo_URL(Global_Variables.BASE_URL + "/Contact-Us/contactus.html");
    }

    public void setFirstname(String firstname) {
        sendKeys(this.firstName, firstname);
    }

    public void setLastname(String lastname) {
        sendKeys(this.lastName, lastname);
    }

    public void setEmail(String email) {
        sendKeys(this.email, email);
    }

    public void setComments(String message) {
        sendKeys(this.comments, message);
    }

    public void submitInfo() {
        click(this.submit);
    }

    public void verifySubmitMessage() {
        Assert.assertEquals(getText(submitMessage), expectedSubmitMessage);
    }


}
