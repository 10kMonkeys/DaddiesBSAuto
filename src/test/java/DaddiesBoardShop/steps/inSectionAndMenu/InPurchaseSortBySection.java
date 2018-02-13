package DaddiesBoardShop.steps.inSectionAndMenu;

import DaddiesBoardShop.model.TextData;
import DaddiesBoardShop.pages.sectionAndMenu.PurchaseSortBySection;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InPurchaseSortBySection {

    PurchaseSortBySection inSection;

    @Step
    public void checkSortSectionIsCorrectAndDisplayed() {
        checkSortByTitleIsCorrectAndDisplayed();
        checkBestSellersSortCorrectAndDisplayed();
        checkNewestSortIsCorrectAndDisplayed();
        checkAToZSortIsCorrectAndDisplayed();
        checkPriceLowSortIsCorrectAndDisplayed();
        checkPriceHighSortIsCorrectAndDisplayed();
    }

    @Step
    public void checkSortByTitleIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[0], inSection.getSortByTitleText());
    }

    @Step
    public void checkBestSellersSortCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[1], inSection.getBestSellersSortText());
    }

    @Step
    public void checkNewestSortIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[2], inSection.getNewestSortText());
    }

    @Step
    public void checkAToZSortIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[3], inSection.getAToZSortText());
    }

    @Step
    public void checkPriceLowSortIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[4], inSection.getPriceLowSortText());
    }

    @Step
    public void checkPriceHighSortIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[5], inSection.getPriceHighSortText());
    }

    @Step
    public void clickOnPriceLowSort() {
        inSection.clickOnPriceLowSort();
    }
}
