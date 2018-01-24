package DaddiesBoardShop.Steps.InSectionAndMenu;

import DaddiesBoardShop.Model.TextData;
import DaddiesBoardShop.Pages.SectionAndMenu.PurchaseSortBySection;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InPurchaseSortBySection {

    PurchaseSortBySection inSection;

    @Step
    public void checkSectionIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedSortBySectionValues[0], inSection.getSortByTitleText());
        Assert.assertEquals(TextData.expectedSortBySectionValues[1], inSection.getBestSellersSortText());
        Assert.assertEquals(TextData.expectedSortBySectionValues[2], inSection.getNewestSortText());
        Assert.assertEquals(TextData.expectedSortBySectionValues[3], inSection.getAToZSortText());
        Assert.assertEquals(TextData.expectedSortBySectionValues[4], inSection.getPriceLowSortText());
        Assert.assertEquals(TextData.expectedSortBySectionValues[5], inSection.getPriceHighSortText());
    }

    @Step
    public void clickOnPriceHighSort() {
        inSection.clickOnpriceHighSort();
    }
}
