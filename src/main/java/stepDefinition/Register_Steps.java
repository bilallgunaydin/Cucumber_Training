package stepDefinition;

import PageObjectModel.register_Page;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Register_Steps {

    register_Page register_page = new register_Page();
    private WebDriver driver;
    @Given("Navigate to Website")
    public void navigateToWebsite() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @And("click Sign in button")
    public void clickSignInButton() {
        register_page.clickOnSignInButton();
    }

    @And("type email {string}")
    public void typeEmail(String email) {
        register_page.typeMail(email);
    }

    @And("click on Create an Account button")
    public void clickOnCreateAnAccountButton() {
        register_page.clickOnSubmitButton();
    }

    @And("choose title")
    public void chooseTitle() {
    }

    @And("type firstname {string} and lastname {string}")
    public void typeFirstnameAndLastname(String firstname, String lastname) {
        register_page.typeFirstNameAndLastName(firstname,lastname);

    }

    @And("type password {string}")
    public void typePassword(String password) {
        register_page.typePassword(password);
    }

    @And("type Company {string}")
    public void typeCompany(String Company) {
        register_page.typeCompany(Company);
    }

    @And("type address {string}")
    public void typeAddress(String address) {
        register_page.typeAddress(address);
    }

    @After
    public void Quit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.closeDriver();

    }
}
