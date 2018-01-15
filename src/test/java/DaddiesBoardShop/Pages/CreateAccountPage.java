package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Model.Customer;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
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

    @Step
    public void fillFirstName(String firstName) {
        firstNameInput.sendKeys(firstName);
    }

    @Step
    public void fillLastName(String lastName) {
        lastNameInput.sendKeys(lastName);
    }

    @Step
    public void fillEmailAddress(String emailAddress) {
        emailAddressInput.sendKeys(emailAddress);
    }

    @Step
    public void fillPassword(String emailAddress) {
        passwordInput.sendKeys(emailAddress);
    }

    @Step
    public void fillConfirmPassword(String confirmPassword) {
        confirmPasswordInput.sendKeys(confirmPassword);
    }

    @Step
    public void clickBackLink() {
        backLink.click();
    }

    @Step
    public void clickSubmitButton() {
        submitButton.click();
    }

    @Step
    public void firstNameInputIsDisplayed() {
        Assert.assertTrue(firstNameInput.isDisplayed());
    }

    @Step
    public void lastNameInputIsDisplayed() {
        Assert.assertTrue(lastNameInput.isDisplayed());
    }

    @Step
    public void emailAddressInputIsDisplayed() {
        Assert.assertTrue(emailAddressInput.isDisplayed());
    }

    @Step
    public void passwordInputIsDisplayed() {
        Assert.assertTrue(passwordInput.isDisplayed());
    }

    @Step
    public void confirmPasswordIsDisplayed() {
        Assert.assertTrue(confirmPasswordInput.isDisplayed());
    }

    @Step
    public void backLinkIsDisplayed() {
        Assert.assertTrue(backLink.isDisplayed());
    }

    @Step
    public void submitButtonIsDisplayed() {
        Assert.assertTrue((submitButton.isDisplayed()));
    }

    @Step
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
