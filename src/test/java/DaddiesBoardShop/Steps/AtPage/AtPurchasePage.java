package DaddiesBoardShop.Steps.AtPage;

import DaddiesBoardShop.Model.TextData;
import DaddiesBoardShop.Pages.Page.PurchasePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtPurchasePage {

    PurchasePage onPage;

    @Step
    public void addAdditionalPurchaseOption() {
        onPage.clickOnOptionsMenu();
        onPage.clickOnAddSkateToolMenu();
        onPage.clickOnDaddiesSkateTool();
        Assert.assertEquals(TextData.expectedDaddiesSkateToolText, onPage.getAddedSkateToolText());
    }

    @Step
    public void addPurchaseToCart() {
        onPage.clickOnAddToCartButton();
    }
}