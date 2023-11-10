package pageObjects;

import Utils.Global_Variables;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page extends Base_Page {

    private @FindBy(xpath = "//input[@id='text']")
    WebElement username_TextBox;

    private @FindBy(id = "password")
    WebElement password_TextBox;

    private @FindBy(xpath = "//button[@id='login-button']")
    WebElement login_Button;

    public Login_Page() {
        super();
    }

    public void navigateTo_LoginPage() {
        navigateTo_URL(Global_Variables.BASE_URL + "/Login-Portal/index.html");
    }

    public void setUsername(String username) {
        sendKeys(username_TextBox, username);
    }

    public void setPassword(String password) {
        sendKeys(password_TextBox, password);
    }

    public void clickLogin() {
        click(login_Button);
    }

    public void validateAlertMessage(String message) {
        clickAlert_AssertMessage(message);
    }


}
