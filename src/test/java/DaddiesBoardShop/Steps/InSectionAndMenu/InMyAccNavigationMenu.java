package DaddiesBoardShop.Steps.InSectionAndMenu;

import DaddiesBoardShop.pages.SectionAndMenu.MyAccountNavigationMenu;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InMyAccNavigationMenu {

    MyAccountNavigationMenu inMenu;

    @Step
    public InMyAccNavigationMenu accountDashboardLinkIsDisplayed() {
        Assert.assertTrue(inMenu.accountDashboardLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu accountInformationLinkIsDisplayed() {
        Assert.assertTrue(inMenu.accountInformationLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu addressBookLinkLinkIsDisplayed() {
        Assert.assertTrue(inMenu.addressBookLinkLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu myOrdersLinkIsDisplayed() {
        Assert.assertTrue(inMenu.myOrdersLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu myProductReviewsLinkIsDisplayed() {
        Assert.assertTrue(inMenu.myProductReviewsLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu myWishlistLinkIsDisplayed() {
        Assert.assertTrue(inMenu.myWishlistLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu storeCreditLinkIsDisplayed() {
        Assert.assertTrue(inMenu.storeCreditLinkIsDisplayed());
        return this;
    }

    @Step
    public InMyAccNavigationMenu giftCardLinkIsDisplayed() {
        Assert.assertTrue(inMenu.giftCardLinkIsDisplayed());
        return this;
    }

    @Step
    public void myReturnsLinkIsDisplayed() {
        Assert.assertTrue(inMenu.myReturnsLinkIsDisplayed());
    }
}
