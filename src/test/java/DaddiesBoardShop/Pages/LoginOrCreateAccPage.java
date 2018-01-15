package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Model.MyRegisteredCustomer;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.daddiesboardshop.com/customer/account/login/")
public class LoginOrCreateAccPage extends BasePage {

    MyRegisteredCustomer regCustomer = new MyRegisteredCustomer();

    public LoginOrCreateAccPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input#email")
    public WebElement emailAddressInput;

    @FindBy(css = "input#pass")
    public WebElement passwordInput;

    @FindBy(css = "div.form-buttons :nth-child(2)")
    public WebElement forgotYourPassLink;

    @FindBy(css = "button#send2")
    public WebElement loginButton;

    @FindBy(css = "button.button[type=button]")
    public WebElement registerButton;

    @Step
    public void openLoginAndCreateAccPage() {
        open();
    }

    @Step
    public void fillEmailAdress(String email) {
        emailAddressInput.sendKeys(email);
    }

    @Step
    public void fillPassword(String password) {
        passwordInput.sendKeys(password);
    }

    @Step
    public void clickLoginButton() {
        loginButton.click();
    }

    @Step
    public void clickRegistrationButton() {
        registerButton.click();
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
    public void forgotTourPassIsDisplayed() {
        Assert.assertTrue(forgotYourPassLink.isDisplayed());
    }

    @Step
    public void loginButtonIsDisplayed() {
        Assert.assertTrue(loginButton.isDisplayed());
    }

    @Step
    public void registerButtonIsDisplayed() {
        Assert.assertTrue(registerButton.isDisplayed());
    }

    @Step
    public void logInUser() {
        fillEmailAdress(regCustomer.getEmailAddress());
        fillPassword(regCustomer.getPassword());
        clickLoginButton();
    }
}
