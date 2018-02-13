package DaddiesBoardShop.steps.InSectionAndMenu;

import DaddiesBoardShop.Model.TextData;
import DaddiesBoardShop.Pages.SectionAndMenu.PurchaseCategorySection;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InPurchaseCategorySection {

    PurchaseCategorySection inSection;

    @Step
    public void checkSectionIsCorrectAndDisplayed() {
        Assert.assertEquals(TextData.expectedCategoriesTitle, inSection.getCategoriesTitleText());

        Assert.assertTrue(inSection.checkQtyOfCotegories(TextData.expectedLongboardCategories, inSection.getCategoriesList()));

        inSection.compareActualAndExpectedCategories(TextData.expectedLongboardCategories, inSection.getCategoriesList());
    }

    @Step
    public void clickOnDecksOnlyCategory() {
        inSection.clickOnDecksOnlyCategory();
    }
}
