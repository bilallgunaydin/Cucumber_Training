package stepDefinition;

import PageObjectModel.contactUs_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contactUs_Steps {

    private WebDriver driver;
    contactUs_Page contactUs_page = new contactUs_Page();
    @Given("navigate to Website")
    public void navigate_to_Website() throws Throwable {

        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Given("click on contact us button")
    public void click_on_contact_us_button() {

        contactUs_page.clickContactUsButton();
    }
    @Given("select Subject Heading")
    public void select_subject_heading() {
        contactUs_page.selectFromDropdown();
    }
    @Given("type Email")
    public void type_email() {
        contactUs_page.enterEmail();
    }
    @Given("type Order reference")
    public void type_order_reference() {
        contactUs_page.enterOrder();
    }
    @Given("type a message")
    public void type_a_message() {
        contactUs_page.enterMessage();
    }
    @When("click on submit button")
    public void click_on_submit_button() {
        contactUs_page.clickOnSendButton();
    }
    @Then("verify success message")
    public void verify_success_message() {
        contactUs_page.assertMyMessage();
    }
}
