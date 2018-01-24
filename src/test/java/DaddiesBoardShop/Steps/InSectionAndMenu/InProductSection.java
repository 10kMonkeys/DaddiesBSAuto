package DaddiesBoardShop.Steps.InSectionAndMenu;

import DaddiesBoardShop.Pages.SectionAndMenu.ProductsSection;
import net.thucydides.core.annotations.Step;

public class InProductSection {

    ProductsSection inSection;

//    @Step
//    public void checkAllProductsAreDisplayed() {
//        inSection.productsAreDisplayed(inSection.getCurrentProductList());
//    }

    @Step
    public void checkPriceHighToLowSorting() {

    }

    @Step
    public void TEST() {
//        for (int i = 0; i < inSection.getCurrentProductList().size(); i++) {
//            System.out.println(i);
//        }
//        inSection.checkPriceHighToLowSort();
//        System.out.println("================================================================================");
        inSection.goToNextPage();

    }
}
