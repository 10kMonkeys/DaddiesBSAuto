package DaddiesBoardShop.Pages.SectionAndMenu;

import DaddiesBoardShop.Pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountNavigationMenu extends BasePage {

    public MyAccountNavigationMenu(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.block-content li:first-child")
    public WebElement accountDashboardLink;

    @FindBy(css = "div.block-content li:nth-child(2)")
    public WebElement accountInformationLink;

    @FindBy(css = "div.block-content li:nth-child(3)")
    public WebElement addressBookLink;

    @FindBy(css = "div.block-content li:nth-child(4)")
    public WebElement myOrdersLink;

    @FindBy(css = "div.block-content li:nth-child(5)")
    public WebElement myProductReviewsLink;

    @FindBy(css = "div.block-content li:nth-child(6)")
    public WebElement myWishlistLink;

    @FindBy(css = "div.block-content li:nth-child(7)")
    public WebElement storeCreditLink;

    @FindBy(css = "div.block-content li:nth-child(8)")
    public WebElement giftCardLink;

    @FindBy(css = "div.block-content li:last-child")
    public WebElement myReturnsLink;

    public boolean accountDashboardLinkIsDisplayed() {
        return element(accountDashboardLink).isDisplayed();
    }

    public boolean accountInformationLinkIsDisplayed() {
        return element(accountInformationLink).isDisplayed();
    }

    public boolean addressBookLinkLinkIsDisplayed() {
        return element(addressBookLink).isDisplayed();
    }

    public boolean myOrdersLinkIsDisplayed() {
        return element(myOrdersLink).isDisplayed();
    }

    public boolean myProductReviewsLinkIsDisplayed() {
        return element(myProductReviewsLink).isDisplayed();
    }

    public boolean myWishlistLinkIsDisplayed() {
        return element(myWishlistLink).isDisplayed();
    }

    public boolean storeCreditLinkIsDisplayed() {
        return element(storeCreditLink).isDisplayed();
    }

    public boolean giftCardLinkIsDisplayed() {
        return element(giftCardLink).isDisplayed();
    }

    public boolean myReturnsLinkIsDisplayed() {
        return element(myReturnsLink).isDisplayed();
    }
}
