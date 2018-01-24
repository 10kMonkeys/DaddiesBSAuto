package DaddiesBoardShop.Pages.Page;

import DaddiesBoardShop.Model.Customer;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.daddiesboardshop.com/customer/account/create")
public class CreateAccountPage extends BasePage {

    public static Customer justRegCustomer;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#firstname")
    public WebElement firstNameInput;

    @FindBy(css = "input#lastname")
    public WebElement lastNameInput;

    @FindBy(css = "input#email_address")
    public WebElement emailAddressInput;

    @FindBy(css = "input#password")
    public WebElement passwordInput;

    @FindBy(css = "input#confirmation")
    public WebElement confirmPasswordInput;

    @FindBy(css = "p.back-link > a")
    public WebElement backLink;

    @FindBy(css = "button[title='Submit']")
    public WebElement submitButton;

    public void openCreateAccountPage() {
        open();
    }

    public void fillFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    public void fillEmailAddress(String emailAddress) {
        emailAddressInput.sendKeys(emailAddress);
    }

    public void fillPassword(String emailAddress) {
        passwordInput.sendKeys(emailAddress);
    }

    public void fillConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    public void clickBackLink() {
        backLink.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void firstNameInputIsDisplayed() {
        Assert.assertTrue(firstNameInput.isDisplayed());
    }

    public void lastNameInputIsDisplayed() {
        Assert.assertTrue(lastNameInput.isDisplayed());
    }

    public void emailAddressInputIsDisplayed() {
        Assert.assertTrue(emailAddressInput.isDisplayed());
    }

    public void passwordInputIsDisplayed() {
        Assert.assertTrue(passwordInput.isDisplayed());
    }

    public void confirmPasswordIsDisplayed() {
        Assert.assertTrue(confirmPasswordInput.isDisplayed());
    }

    public void backLinkIsDisplayed() {
        Assert.assertTrue(backLink.isDisplayed());
    }

    public void submitButtonIsDisplayed() {
        Assert.assertTrue((submitButton.isDisplayed()));
    }

    public void createCustomer() {
        Customer customer = Customer.newEntity();
        justRegCustomer = customer;

        fillFirstName(customer.getFirstName());
        fillLastName(customer.getLastName());
        fillEmailAddress(customer.getEmailAddress());
        fillPassword(customer.getPassword());
        fillConfirmPassword(customer.getPassword());
        clickSubmitButton();
    }
}
