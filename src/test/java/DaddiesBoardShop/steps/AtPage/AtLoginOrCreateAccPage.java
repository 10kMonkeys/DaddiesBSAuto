package DaddiesBoardShop.steps.AtPage;

import DaddiesBoardShop.helper.UsersProperties;
import DaddiesBoardShop.pages.Page.LoginOrCreateAccPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtLoginOrCreateAccPage {

    LoginOrCreateAccPage onPage;

    @Step
    public void openPage() {
        onPage.openLoginAndCreateAccPage();
    }

    @Step
    public void logInRegisteredCustomer() {
        onPage.fillEmailAdress(UsersProperties.INSTANCE.getProperty("UserEmail"));
        onPage.fillPassword(UsersProperties.INSTANCE.getProperty("UserPassword"));
        onPage.clickLoginButton();
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
    public AtLoginOrCreateAccPage checkEmailAddressInputIsDisplayed() {
        Assert.assertTrue(onPage.emailAddressInputIsDisplayed());
        return this;
    }

    @Step
    public AtLoginOrCreateAccPage checkPasswordInputIsDisplayed() {
        Assert.assertTrue(onPage.passwordInputIsDisplayed());
        return this;
    }

    @Step
    public AtLoginOrCreateAccPage checkForgotTourPassIsDisplayed() {
        Assert.assertTrue(onPage.forgotTourPassIsDisplayed());
        return this;
    }

    @Step
    public AtLoginOrCreateAccPage checkLoginButtonIsDisplayed() {
        Assert.assertTrue(onPage.loginButtonIsDisplayed());
        return this;
    }

    @Step
    public void checkRegisterButtonIsDisplayed() {
        Assert.assertTrue(onPage.registerButtonIsDisplayed());
    }
}
