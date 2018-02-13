package DaddiesBoardShop.Steps.AtPage;

import DaddiesBoardShop.Pages.Page.SearchResultPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtSearchResultPage {

    SearchResultPage onPage;

    @Step
    public void selectPurchase(String purchase) {
        Assert.assertTrue(onPage.findPurchaseInResult(purchase));
        onPage.clickOnPurchase();
    }
}