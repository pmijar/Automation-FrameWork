package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_Page;
import pageObjects.ContactUs_Page;

public class ContactUs_Steps extends Base_Page {

    private final ContactUs_Page contactus_po;

    public ContactUs_Steps(ContactUs_Page contactus_po) {
        this.contactus_po = contactus_po;
    }

    @Given("<Gary> accesses the web-driver university contact-us page")
    public void gary_accesses_the_webdriver_university_contact_us_page() {
        contactus_po.navigateTo_ContactUsPage();
    }

    @When("<Gary> enters a unique first name")
    public void gary_enters_a_unique_first_name() {
        contactus_po.setFirstname("AutoFN_" + getRandomNumber(6));
    }

    @And("<Gary> enters a unique last name")
    public void gary_enters_a_unique_last_name() {
        contactus_po.setLastname("AutoLN_" + getRandomNumber(6));
    }

    @And("<Gary> enters a unique email address")
    public void gary_enters_a_unique_email_address() {// Write code here that turns the phrase above into concrete actions
        contactus_po.setEmail("Auto_" + getRandomNumber(6) + "@mail.com");
    }

    @And("<Gary> enters comments")
    public void gary_enters_comments() {
        contactus_po.setComments("Hello Sir/Madam, \n\n" + getRandomtext(30));
    }

    @And("<Gary> clicks on Submit button")
    public void gary_clicks_on_submit_button() {
        contactus_po.submitInfo();
    }

    @Then("<Gary> should be presented with successful contact us submission message")
    public void gary_should_be_presented_with_successful_contact_us_submission_message() {
        contactus_po.verifySubmitMessage();
    }

    @When("<Gary> enters a specific first name {word}")
    public void garyEntersASpecificFirstNameJoe(String specificFirstName) {
        contactus_po.setFirstname(specificFirstName);
    }

    @And("<Gary> enters a specific last name {word}")
    public void garyEntersASpecificLastNameBaker(String specificLastName) {
        contactus_po.setLastname(specificLastName);
    }

    @And("<Gary> enters a specific email address {string}")
    public void garyEntersASpecificEmailAddressJoeBakerMailCom(String specificEmail) {
        contactus_po.setEmail(specificEmail);
    }
}
