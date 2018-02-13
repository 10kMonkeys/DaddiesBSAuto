package DaddiesBoardShop.Steps.AtPage;


import DaddiesBoardShop.helper.UsersProperties;
import DaddiesBoardShop.pages.Page.CreateAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtCreateAccountPage {

    CreateAccountPage onPage;

    @Step
    public void openPage() {
        onPage.openCreateAccountPage();
    }

    @Step
    public void clickSubmitButton() {
        onPage.clickSubmitButton();
    }

    @Step
    public AtCreateAccountPage checkFirstNameInputIsDisplayed() {
        Assert.assertTrue(onPage.firstNameInputIsDisplayed());
        return this;
    }

    @Step
    public AtCreateAccountPage checkLastNameInputIsDisplayed() {
        Assert.assertTrue(onPage.lastNameInputIsDisplayed());
        return this;
    }

    @Step
    public AtCreateAccountPage checkEmailAddressInputIsDisplayed() {
        Assert.assertTrue(onPage.emailAddressInputIsDisplayed());
        return this;
    }

    @Step
    public AtCreateAccountPage checkPassInputIsDisplayed() {
        Assert.assertTrue(onPage.passwordInputIsDisplayed());
        return this;
    }

    @Step
    public AtCreateAccountPage checkConfirmPassInputIsDisplayed() {
        Assert.assertTrue(onPage.confirmPasswordIsDisplayed());
        return this;
    }

    @Step
    public AtCreateAccountPage checkBackLinkIsDisplayed() {
        Assert.assertTrue(onPage.backLinkIsDisplayed());
        return this;
    }

    @Step
    public void checkSubmitButtonIsDisplayed() {
        Assert.assertTrue(onPage.submitButtonIsDisplayed());
    }

    @Step
    public AtCreateAccountPage enterFirstName() {
        onPage.fillFirstName(UsersProperties.INSTANCE.getProperty("NewUserFirstName"));
        return this;
    }

    @Step
    public AtCreateAccountPage enterLastName() {
        onPage.fillLastName(UsersProperties.INSTANCE.getProperty("NewUserLastName"));
        return this;
    }

    @Step
    public AtCreateAccountPage enterEmailAddress() {
        onPage.fillEmailAddress(UsersProperties.INSTANCE.getProperty("NewUserEmail"));
        return this;
    }

    @Step
    public AtCreateAccountPage enterPassword() {
        onPage.fillPassword(UsersProperties.INSTANCE.getProperty("NewUserPassword"));
        return this;
    }

    @Step
    public AtCreateAccountPage enterConfirmedPassword() {
        onPage.fillConfirmPassword(UsersProperties.INSTANCE.getProperty("NewUserPassword"));
        return this;
    }
}
