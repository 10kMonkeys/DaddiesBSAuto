package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class AtLoginOrCreateAccPageElementsTest extends Application {

    @Test
    public void checkLoginOrCreateAccPageElement() {
        atLoginOrCreateAccPage.openPage();
        inApplicationHeader.checkUserIsLogOut();
        atLoginOrCreateAccPage.checkEmailAddressInputIsDisplayed();
        atLoginOrCreateAccPage.checkPasswordInputIsDisplayed();
        atLoginOrCreateAccPage.checkForgotTourPassIsDisplayed();
        atLoginOrCreateAccPage.checkLoginButtonIsDisplayed();
        atLoginOrCreateAccPage.checkRegisterButtonIsDisplayed();
    }
}
