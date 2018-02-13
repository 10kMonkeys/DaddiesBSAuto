package DaddiesBoardShop.pages.page;

import DaddiesBoardShop.pages.BasePage;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.daddiesboardshop.com/customer/account/create")
public class CreateAccountPage extends BasePage {

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
        element(firstNameInput).sendKeys(firstName);
    }

    public void fillLastName(String lastName) {
        element(lastNameInput).sendKeys(lastName);
    }

    public void fillEmailAddress(String emailAddress) {
        element(emailAddressInput).sendKeys(emailAddress);
    }

    public void fillPassword(String emailAddress) {
        element(passwordInput).sendKeys(emailAddress);
    }

    public void fillConfirmPassword(String confirmPassword) {
        element(confirmPasswordInput).sendKeys(confirmPassword);
    }

    public void clickBackLink() {
        element(backLink).click();
    }

    public void clickSubmitButton() {
        element(submitButton).click();
    }

    public boolean firstNameInputIsDisplayed() {
        return element(firstNameInput).isDisplayed();
    }

    public boolean lastNameInputIsDisplayed() {
        return element(lastNameInput).isDisplayed();
    }

    public boolean emailAddressInputIsDisplayed() {
        return element(emailAddressInput).isDisplayed();
    }

    public boolean passwordInputIsDisplayed() {
        return element(passwordInput).isDisplayed();
    }

    public boolean confirmPasswordIsDisplayed() {
        return element(confirmPasswordInput).isDisplayed();
    }

    public boolean backLinkIsDisplayed() {
        return element(backLink).isDisplayed();
    }

    public boolean submitButtonIsDisplayed() {
        return element(submitButton).isDisplayed();
    }
}
