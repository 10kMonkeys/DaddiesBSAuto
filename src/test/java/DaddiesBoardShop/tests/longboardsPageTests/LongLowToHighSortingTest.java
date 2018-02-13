package DaddiesBoardShop.tests.longboardsPageTests;

import DaddiesBoardShop.application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class LongLowToHighSortingTest extends Application {

    @Test
    public void checkLongToHighSorting() {
        user.atLongboardsPage.openLongboardsPage();
        user.inPurchaseSortBySection.checkSortSectionIsCorrectAndDisplayed();
        user.inPurchaseSortBySection.clickOnPriceLowSort();
        user.inProductSection.checkPriceLowToHighSorting();
    }
}
