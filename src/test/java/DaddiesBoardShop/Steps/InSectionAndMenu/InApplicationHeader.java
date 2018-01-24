package DaddiesBoardShop.Steps.InSectionAndMenu;

import DaddiesBoardShop.Pages.Page.ApplicationHeader;
import net.thucydides.core.annotations.Step;

public class InApplicationHeader {

    ApplicationHeader inHeader;

    @Step
    public void checkUserIsLogIn() {
        inHeader.userIsLogedInVerification();
    }

    @Step
    public void checkUserIsLogOut() {
        inHeader.userIsLogedOutVerification();
    }

}
