package pageObjects;

import Utils.Global_Variables;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUs_Page extends Base_Page {

    private static final String expectedSubmitMessage = "Thank You for your Message!";
    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstName_TextBox;
    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastName_TextBox;
    private @FindBy(xpath = "//input[@name='email']")
    WebElement email_TextBox;
    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement comments_TextBox;
    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submit_Button;
    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement submitMessage_TextElement;

    public ContactUs_Page() {
        super();
    }

    public void navigateTo_ContactUsPage() {
        navigateTo_URL(Global_Variables.BASE_URL + "/Contact-Us/contactus.html");
    }

    public void setFirstname(String firstname) {
        sendKeys(this.firstName_TextBox, firstname);
    }

    public void setLastname(String lastname) {
        sendKeys(this.lastName_TextBox, lastname);
    }

    public void setEmail(String email_TextBox) {
        sendKeys(this.email_TextBox, email_TextBox);
    }

    public void setComments(String message) {
        sendKeys(this.comments_TextBox, message);
    }

    public void submitInfo() {
        click(this.submit_Button);
    }

    public void verifySubmitMessage() {
        Assert.assertEquals(getText(submitMessage_TextElement), expectedSubmitMessage);
    }


}
