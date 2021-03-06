package DaddiesBoardShop.tests.checkElementsTests;

import DaddiesBoardShop.application.TestRunner;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class MyAccDashboardNavMenuTest extends TestRunner {

    @Test
    public void checkMyNavigationMenu() {
        user.atLoginOrCreateAccPage.openPage();
        user.atLoginOrCreateAccPage.logInRegisteredCustomer();
        user.inMyAccNavigationMenu.accountDashboardLinkIsDisplayed()
                .accountInformationLinkIsDisplayed()
                .addressBookLinkLinkIsDisplayed()
                .myOrdersLinkIsDisplayed()
                .myProductReviewsLinkIsDisplayed()
                .myWishlistLinkIsDisplayed()
                .storeCreditLinkIsDisplayed()
                .giftCardLinkIsDisplayed()
                .myReturnsLinkIsDisplayed();
    }
}
