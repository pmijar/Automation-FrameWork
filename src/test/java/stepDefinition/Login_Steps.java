package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_Page;
import pageObjects.Login_Page;

public class Login_Steps extends Base_Page {

    private final WebDriver driver = getDriver();
    private final Login_Page login_po;

    //Dependency injection by using cucumber-jvm-picocontainer dependency
    public Login_Steps(Login_Page login_po) {
        this.login_po = login_po;
    }

    @Given("Gary accesses the web-driver university Login page")
    public void gary_accesses_the_web_driver_university_login_page() {
        login_po.navigateTo_LoginPage();
    }

    @When("Gary enters a username {word}")
    public void gary_enters_a_username(String username) {
        login_po.setUsername(username);
    }

    @And("Gary enters a password {word}")
    public void gary_enters_a_password(String password) {
        login_po.setPassword(password);
    }

    @And("Gary clicks on Login button")
    public void gary_clicks_on_login_button() {
        login_po.clickLogin();
    }

    @Then("Gary should be presented with successful Login submission message")
    public void gary_should_be_presented_with_successful_login_submission_message() {
        login_po.validateAlertMessage("validation succeeded");
    }

    @Then("Gary should be presented with un-successful Login submission message")
    public void garyShouldBePresentedWithUnSuccessfulLoginSubmissionMessage() {
        login_po.validateAlertMessage("validation failed");
    }

    @Then("Gary should be presented with message {}")
    public void garyShouldBePresentedWithMessageLoginValidationMessage(String message) {
        login_po.validateAlertMessage(message);
    }
}
