package DaddiesBoardShop.Tests.AddPurchaseTests;

import DaddiesBoardShop.Application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class AddPurchaseTest extends Application {

    @Test
    public void checkPurchaseAdding() {
        user.atHomePage.openPage();
        user.inApplicationHeader.searchPurchase("Omen Longboard");
        user.atSearchResultPage.selectPurchase("Omen Grim Longboard Deck - 2017");
        user.atPurchasePage.addAdditionalPurchaseOption();
        user.atPurchasePage.addPurchaseToCart();
        user.inCartDialog.checkJustAddedPurchase();
    }
}
