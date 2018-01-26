package DaddiesBoardShop.Steps.InSectionAndMenu;

import DaddiesBoardShop.Pages.SectionAndMenu.ProductsSection;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InProductSection {

    ProductsSection inSection;

    @Step
    public void checkAllProductsAreDisplayed() {
        inSection.productsAreDisplayed(inSection.getCurrentProductList());
    }

    @Step
    public void checkPriceLowToHighSorting() {
        inSection.checkPagesQty();
        for (int i = 0; i < ProductsSection.pagesQty; i++) {
            Assert.assertTrue(inSection.checkPriceLowToHighSort(inSection.getProductPricesList()));
            inSection.goToNextPage();
        }
    }

    @Step
    public void TEST() {
        for(int i = 0; i < 20; i++) {
            inSection.goToNextPage();
        }
    }
}
