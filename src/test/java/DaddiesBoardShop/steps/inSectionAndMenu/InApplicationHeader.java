package DaddiesBoardShop.steps.inSectionAndMenu;

import DaddiesBoardShop.pages.sectionAndMenu.ApplicationHeader;
import net.thucydides.core.annotations.Step;

public class InApplicationHeader {

    ApplicationHeader inHeader;

    @Step
    public void checkUserIsLogIn() {
        inHeader.userIsLoggedInVerification();
    }

    @Step
    public void checkUserIsLogOut() {
        inHeader.userIsLoggedOutVerification();
    }

    @Step
    public void searchPurchase(String searchRequest) {
        inHeader.typeSearchRequest(searchRequest);
        inHeader.clickOnGoButton();
    }
}
