package DaddiesBoardShop.pages.Page;

import DaddiesBoardShop.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.daddiesboardshop.com/customer/account/login/")
public class LoginOrCreateAccPage extends BasePage {

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

    public void openLoginAndCreateAccPage() {
        open();
    }

    public void fillEmailAdress(String email) {
        element(emailAddressInput).sendKeys(email);
    }

    public void fillPassword(String password) {
        element(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        element(loginButton).click();
    }

    public void clickRegistrationButton() {
        element(registerButton).click();
    }

    public boolean emailAddressInputIsDisplayed() {
        return element(emailAddressInput).isDisplayed();
    }

    public boolean passwordInputIsDisplayed() {
        return element(passwordInput).isDisplayed();
    }

    public boolean forgotTourPassIsDisplayed() {
        return element(forgotYourPassLink).isDisplayed();
    }

    public boolean loginButtonIsDisplayed() {
        return element(loginButton).isDisplayed();
    }

    public boolean registerButtonIsDisplayed() {
        return element(registerButton).isDisplayed();
    }
}
