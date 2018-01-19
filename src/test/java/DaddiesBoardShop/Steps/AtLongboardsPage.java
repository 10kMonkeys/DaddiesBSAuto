package DaddiesBoardShop.Steps;

import DaddiesBoardShop.Helper.Scroll;
import DaddiesBoardShop.Pages.LongboardsPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtLongboardsPage {

    LongboardsPage onPage;

    @Step
    public void openLongboardsPage() {
        onPage.openLongboardsPage();
    }


    @Step
    public void checkPageNavigation() {
        Assert.assertEquals("Home > Longboards",onPage.getPageNavigation().getText());
    }

    @Step
    public void checkCategoryName() {
        Assert.assertEquals("LONGBOARDS FROM DADDIESBOARDSHOP.COM", onPage.getCategoryName().getText());
    }


    public void TEST() {
        onPage.TEST();
    }
}
