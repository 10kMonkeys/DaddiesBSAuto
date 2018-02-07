package DaddiesBoardShop.Steps.InDialogs;

import DaddiesBoardShop.Pages.Dialogs.CartDialog;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InCartDialog {

    CartDialog inDialog;

    @Step
    public void checkJustAddedPurchase() {
        Assert.assertTrue(inDialog.checkCartOpening());
        Assert.assertTrue(inDialog.justAddedPurchaseIsDisplayed());
    }
}
