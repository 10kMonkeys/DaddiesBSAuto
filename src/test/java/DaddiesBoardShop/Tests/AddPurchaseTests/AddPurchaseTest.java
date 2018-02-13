package DaddiesBoardShop.Tests.AddPurchaseTests;

import DaddiesBoardShop.application.TestRunner;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class AddPurchaseTest extends TestRunner {
    private final String SEARCH_CRITERIA = "Omen Longboard";
    private final String SEARCH_RESULT = "Omen Grim Longboard Deck - 2017";

    @Test
    public void checkPurchaseAdding() {
        user.atHomePage.openPage();
        user.inApplicationHeader.searchPurchase(SEARCH_CRITERIA);
        user.atSearchResultPage.selectPurchase(SEARCH_RESULT);
        user.atPurchasePage.addAdditionalPurchaseOption();
        user.atPurchasePage.addPurchaseToCart();
        user.inCartDialog.checkJustAddedPurchase();
    }
}
