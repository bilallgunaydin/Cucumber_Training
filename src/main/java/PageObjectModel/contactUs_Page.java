package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class contactUs_Page extends AbstractClass {
    WebDriver driver;

    public contactUs_Page(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;
    public void clickContactUsButton()
    {
        clickFunction(contactUsButton);
    }

    @FindBy(name="id_contact")
    private WebElement subjectHeadingDropdown;
    public void selectFromDropdown()
    {
        selectElementFromDropdown(subjectHeadingDropdown, "Webmaster");
    }

    @FindBy(id = "email")
    private WebElement email;
    public void enterEmail()
    {
        sendKeysFunction(email,"bilal@gmail.com");
    }
    @FindBy(name = "id_order")
    private WebElement order;
    public void enterOrder()
    {
        sendKeysFunction(order,"bilal");
    }

    @FindBy(id = "message")
    private WebElement message;
    public void enterMessage()
    {
        sendKeysFunction(message,"asdsadsadsadsadasdsadsadsadsad");
    }
    @FindBy(id="submitMessage")
    private WebElement sendButton;
    public void clickOnSendButton()
    {
        clickFunction(sendButton);
    }
    @FindBy(xpath = "//p[contains(text(),'Your message has been successfully sent to our tea')]")
    private WebElement successMessage;
    public void assertMyMessage()
    {
        Assertion(successMessage,"Your message has been successfully sent to our team.");
    }
}
