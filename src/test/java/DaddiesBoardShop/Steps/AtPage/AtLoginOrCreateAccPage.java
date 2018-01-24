package DaddiesBoardShop.Steps.AtPage;

import DaddiesBoardShop.Pages.Page.LoginOrCreateAccPage;
import net.thucydides.core.annotations.Step;

public class AtLoginOrCreateAccPage {

    LoginOrCreateAccPage onPage;

    @Step
    public void openPage() {
        onPage.openLoginAndCreateAccPage();
    }

    @Step
    public void logInRegisteredCustomer() {
        onPage.logInUser();
    }

    @Step
    public void fillEmailAddress(String email) {
        onPage.fillEmailAdress(email);
    }

    @Step
    public void fillPassword(String password) {
        onPage.fillPassword(password);
    }

    @Step
    public void clickLoginButton() {
        onPage.clickLoginButton();
    }

    @Step
    public void clickRegistrationButton() {
        onPage.clickRegistrationButton();
    }

    @Step
    public void checkEmailAddressInputIsDisplayed() {
        onPage.emailAddressInputIsDisplayed();
    }

    @Step
    public void checkPasswordInputIsDisplayed() {
        onPage.passwordInputIsDisplayed();
    }

    @Step
    public void checkForgotTourPassIsDisplayed() {
        onPage.forgotTourPassIsDisplayed();
    }

    @Step
    public void checkLoginButtonIsDisplayed() {
        onPage.loginButtonIsDisplayed();
    }

    @Step
    public void checkRegisterButtonIsDisplayed() {
        onPage.registerButtonIsDisplayed();
    }
}
