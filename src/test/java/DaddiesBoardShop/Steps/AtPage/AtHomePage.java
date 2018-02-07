package DaddiesBoardShop.Steps.AtPage;

import DaddiesBoardShop.Model.TextData;
import DaddiesBoardShop.Pages.Page.HomePage;
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
        Assert.assertTrue(onPage.homePageBannerIsDisplayed());
        Assert.assertTrue(onPage.homePageDealsPictureIsDisplayed());
        Assert.assertTrue(onPage.homePageBrandsListIsDisplayed());
        Assert.assertTrue(onPage.partnerPicsListIsDisplayed());
        Assert.assertTrue(onPage.partnerTitlesListIsDisplayed());
        Assert.assertTrue(onPage.popularCategoriesPicsListIsDisplayed());
        Assert.assertTrue(onPage.popularCategoriesTitlesListIsDisplayed());
        Assert.assertTrue(onPage.bottomSectionFlagPicsListIsDisplayed());
        Assert.assertTrue(onPage.aboutDaddiesSectionIsDisplayed());
        Assert.assertTrue(onPage.teamRidersSectionIsDisplayed());
        Assert.assertTrue(onPage.checkItLinkIsDisplayed());
        Assert.assertTrue(onPage.sectionTitlesListIsDisplayed());
    }

    @Step
    public void checkAllElementsTextData() {
        Assert.assertEquals(TextData.expectedSectionTitles[0], onPage.getSectionTitlesListText(0));
        Assert.assertEquals(TextData.expectedSectionTitles[1], onPage.getSectionTitlesListText(1));

        Assert.assertEquals(TextData.expectedPartnerTitles[0], onPage.getPartnerTitlesListText(0));
        Assert.assertEquals(TextData.expectedPartnerTitles[1], onPage.getPartnerTitlesListText(1));
        Assert.assertEquals(TextData.expectedPartnerTitles[2], onPage.getPartnerTitlesListText(2));
        Assert.assertEquals(TextData.expectedPartnerTitles[3], onPage.getPartnerTitlesListText(3));

        Assert.assertEquals(TextData.expectedPopularCategoriesTitles[0], onPage.getPopularCategoriesTitlesListText(0));
        Assert.assertEquals(TextData.expectedPopularCategoriesTitles[1], onPage.getPopularCategoriesTitlesListText(1));
        Assert.assertEquals(TextData.expectedPopularCategoriesTitles[2], onPage.getPopularCategoriesTitlesListText(2));
        Assert.assertEquals(TextData.expectedPopularCategoriesTitles[3], onPage.getPopularCategoriesTitlesListText(3));
        Assert.assertEquals(TextData.expectedPopularCategoriesTitles[4], onPage.getPopularCategoriesTitlesListText(4));
        Assert.assertEquals(TextData.expectedPopularCategoriesTitles[5], onPage.getPopularCategoriesTitlesListText(5));
    }
}
