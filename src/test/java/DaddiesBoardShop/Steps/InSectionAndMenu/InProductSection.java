package DaddiesBoardShop.Steps.InSectionAndMenu;

import DaddiesBoardShop.Pages.SectionAndMenu.ProductsSection;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import static org.hamcrest.core.IsEqual.equalTo;


public class InProductSection {

    ProductsSection inSection;

    @Step
    public void detailsAreShownCorrectlyByDefault() {
        Assert.assertTrue(inSection.productDetailsAreDisplayed());
        Assert.assertFalse(inSection.extendedDetailsAreNotDisplayed());
    }

    @Step
    public void detailsAreShownCorrectlyUnderCusros() {
        inSection.plcaeCursorOverProdDetail();
        Assert.assertTrue(inSection.productDetailsAreDisplayed());
        Assert.assertTrue(inSection.extendedDetailsAreNotDisplayed());
    }

    @Step
    public void checkAllProductsAreDisplayed() {
        Assert.assertTrue(inSection.productsAreDisplayed(inSection.getCurrentProductList()));
    }

    @Step
    public void checkPriceLowToHighSorting() {
        inSection.checkPagesQty();
        for (int i = 0; i < ProductsSection.pagesQty; i++) {
            Assert.assertTrue(inSection.checkPriceLowToHighSort(inSection.getProductPricesList()));
            inSection.goToNextPage();
        }
    }
}
