package DaddiesBoardShop.tests.checkElementsTests;

import DaddiesBoardShop.application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class CreateAccPageElementTest extends Application {

    @Before
    public void checkUserIsLogOut() {
        user.atCreateAccountPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
    }

    @Test
    public void checkCreateAccPageElements() {
        user.atCreateAccountPage.openPage();
        user.atCreateAccountPage.checkFirstNameInputIsDisplayed()
                .checkLastNameInputIsDisplayed()
                .checkEmailAddressInputIsDisplayed()
                .checkPassInputIsDisplayed()
                .checkConfirmPassInputIsDisplayed()
                .checkBackLinkIsDisplayed()
                .checkSubmitButtonIsDisplayed();
    }
}
