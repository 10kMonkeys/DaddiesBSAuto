package DaddiesBoardShop.tests.checkElementsTests;

import DaddiesBoardShop.application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class LoginOrCreateAccPageElementsTest extends Application {

    @Before
    public void checkUserIsLogOut() {
        user.atCreateAccountPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
    }

    @Test
    public void checkLoginOrCreateAccPageElement() {
        user.atLoginOrCreateAccPage.openPage();
        user.atLoginOrCreateAccPage.checkEmailAddressInputIsDisplayed()
                .checkPasswordInputIsDisplayed()
                .checkForgotTourPassIsDisplayed()
                .checkLoginButtonIsDisplayed()
                .checkRegisterButtonIsDisplayed();
    }
}
