package DaddiesBoardShop.Steps.AtPage;


import DaddiesBoardShop.Pages.Page.CreateAccountPage;
import net.thucydides.core.annotations.Step;

public class AtCreateAccountPage {

    CreateAccountPage onPage;

    @Step
    public void openPage() {
        onPage.openCreateAccountPage();
    }

    @Step
    public void registerNewCustomer() {
        onPage.createCustomer();
    }

    @Step
    public void clickSubmitButton() {
        onPage.clickSubmitButton();
    }

    @Step
    public void checkFirstNameInputIsDisplayed() {
        onPage.firstNameInputIsDisplayed();
    }

    @Step
    public void checkLastNameInputIsDisplayed() {
        onPage.lastNameInputIsDisplayed();
    }

    @Step
    public void checkEmailAddressInputIsDisplayed() {
        onPage.emailAddressInputIsDisplayed();
    }

    @Step
    public void checkPassInputIsDisplayed() {
        onPage.passwordInputIsDisplayed();
    }

    @Step
    public void checkConfirmPassInputIsDisplayed() {
        onPage.confirmPasswordIsDisplayed();
    }

    @Step
    public void checkBackLinkIsDisplayed() {
        onPage.backLinkIsDisplayed();
    }

    @Step
    public void checkSubmitButtonIsDisplayed() {
        onPage.submitButtonIsDisplayed();
    }
}
