package DaddiesBoardShop.Steps;

import DaddiesBoardShop.Pages.ApplicationHeader;
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
