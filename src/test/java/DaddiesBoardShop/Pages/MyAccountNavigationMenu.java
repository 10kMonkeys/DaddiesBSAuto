package DaddiesBoardShop.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.Step;
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

    @Step
    public void accountDashboardLinkIsDisplayed() {
        Assert.assertTrue(accountDashboardLink.isDisplayed());
    }

    @Step
    public void accountInformationLinkIsDisplayed() {
        Assert.assertTrue(accountInformationLink.isDisplayed());
    }

    @Step
    public void addressBookLinkLinkIsDisplayed() {
        Assert.assertTrue(addressBookLink.isDisplayed());
    }

    @Step
    public void myOrdersLinkIsDisplayed() {
        Assert.assertTrue(myOrdersLink.isDisplayed());
    }

    @Step
    public void myProductReviewsLinkIsDisplayed() {
        Assert.assertTrue(myProductReviewsLink.isDisplayed());
    }

    @Step
    public void myWishlistLinkIsDisplayed() {
        Assert.assertTrue(myWishlistLink.isDisplayed());
    }

    @Step
    public void storeCreditLinkIsDisplayed() {
        Assert.assertTrue(storeCreditLink.isDisplayed());
    }

    @Step
    public void giftCardLinkIsDisplayed() {
        Assert.assertTrue(giftCardLink.isDisplayed());
    }

    @Step
    public void myReturnsLinkIsDisplayed() {
        Assert.assertTrue(myReturnsLink.isDisplayed());
    }

    @Step
    public void myAccNavigationMenuIsDisplayed() {
        accountDashboardLinkIsDisplayed();
        accountInformationLinkIsDisplayed();
        addressBookLinkLinkIsDisplayed();
        myOrdersLinkIsDisplayed();
        myProductReviewsLinkIsDisplayed();
        myWishlistLinkIsDisplayed();
        storeCreditLinkIsDisplayed();
        giftCardLinkIsDisplayed();
        myReturnsLinkIsDisplayed();
    }
}
