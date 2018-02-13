package DaddiesBoardShop.steps.AtPage;

import DaddiesBoardShop.pages.Page.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtHomePage {

    HomePage onPage;

    @Step
    public void openPage() {
        onPage.openHomePage();
    }

    @Step
    public void checkElementsAreDisplayed() {
        checkHomePageBannerIsDisplayed();
        checkHomePageDealsPictureIsDisplayed();
        checkHomePageBrandsListIsDisplayed();
        checkPartnerPicsListIsDisplayed();
        checkPartnerTitlesListIsDisplayed();
        checkPopularCategoriesPicsListIsDisplayed();
        checkPopularCategoriesTitlesListIsDisplayed();
        checkBottomSectionFlagPicsListIsDisplayed();
        checkAboutDaddiesSectionIsDisplayed();
        checkTeamRidersSectionIsDisplayed();
        checkCheckItLinkIsDisplayed();
        checkSectionTitlesListIsDisplayed();
    }

    @Step
    public void checkHomePageBannerIsDisplayed() {
        Assert.assertTrue(onPage.homePageBannerIsDisplayed());
    }

    @Step
    public void checkHomePageDealsPictureIsDisplayed() {
        Assert.assertTrue(onPage.homePageDealsPictureIsDisplayed());
    }

    @Step
    public void checkHomePageBrandsListIsDisplayed() {
        Assert.assertTrue(onPage.homePageBrandsListIsDisplayed());
    }

    @Step
    public void checkPartnerPicsListIsDisplayed() {
        Assert.assertTrue(onPage.partnerPicsListIsDisplayed());
    }

    @Step
    public void checkPartnerTitlesListIsDisplayed() {
        Assert.assertTrue(onPage.partnerTitlesListIsDisplayed());
    }

    @Step
    public void checkPopularCategoriesPicsListIsDisplayed() {
        Assert.assertTrue(onPage.popularCategoriesPicsListIsDisplayed());
    }

    @Step
    public void checkPopularCategoriesTitlesListIsDisplayed() {
        Assert.assertTrue(onPage.popularCategoriesTitlesListIsDisplayed());
    }

    @Step
    public void checkBottomSectionFlagPicsListIsDisplayed() {
        Assert.assertTrue(onPage.bottomSectionFlagPicsListIsDisplayed());
    }

    @Step
    public void checkAboutDaddiesSectionIsDisplayed() {
        Assert.assertTrue(onPage.aboutDaddiesSectionIsDisplayed());
    }

    @Step
    public void checkTeamRidersSectionIsDisplayed() {
        Assert.assertTrue(onPage.teamRidersSectionIsDisplayed());
    }

    @Step
    public void checkCheckItLinkIsDisplayed() {
        Assert.assertTrue(onPage.checkItLinkIsDisplayed());
    }

    @Step
    public void checkSectionTitlesListIsDisplayed() {
        Assert.assertTrue(onPage.sectionTitlesListIsDisplayed());
    }
}
