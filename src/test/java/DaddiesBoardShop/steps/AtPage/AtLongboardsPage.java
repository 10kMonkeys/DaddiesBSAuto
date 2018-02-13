package DaddiesBoardShop.steps.AtPage;

import DaddiesBoardShop.pages.Page.LongboardsPage;
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
        Assert.assertEquals("Home > Longboards",onPage.getPageNavigationText());
    }

    @Step
    public void checkCategoryName() {
        Assert.assertEquals("LONGBOARDS FROM DADDIESBOARDSHOP.COM", onPage.getCategoryNameText());
    }
}
