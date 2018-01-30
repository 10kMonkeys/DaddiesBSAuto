package DaddiesBoardShop.Tests.HomePageTests;

import DaddiesBoardShop.Pages.Page.BasePage;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;

//@WithTag(type = "Test", name = "Test")
@Ignore
public class Test1 extends BaseTest {

    @Test
    public void testmethod() {
        user.atLongboardsPage.openLongboardsPage();
////        user.inLongboardsCategorySection.clickOnDecksOnlyCategory();
//        user.inPurchaseSortBySection.clickOnPriceLowSort();
        user.inProductSection.checkPriceLowToHighSorting();
//        user.inProductSection.TEST();
    }
}
