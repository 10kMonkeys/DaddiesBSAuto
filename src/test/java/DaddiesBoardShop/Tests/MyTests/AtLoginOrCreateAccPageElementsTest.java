package DaddiesBoardShop.Tests.MyTests;

import DaddiesBoardShop.Application.Application;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class AtLoginOrCreateAccPageElementsTest extends Application {

    @Test
    public void checkLoginOrCreateAccPageElement() {
        user.atLoginOrCreateAccPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
        user.atLoginOrCreateAccPage.checkEmailAddressInputIsDisplayed();
        user.atLoginOrCreateAccPage.checkPasswordInputIsDisplayed();
        user.atLoginOrCreateAccPage.checkForgotTourPassIsDisplayed();
        user.atLoginOrCreateAccPage.checkLoginButtonIsDisplayed();
        user.atLoginOrCreateAccPage.checkRegisterButtonIsDisplayed();
    }
}
