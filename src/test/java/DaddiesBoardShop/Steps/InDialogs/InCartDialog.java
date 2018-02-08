package DaddiesBoardShop.Steps.InDialogs;

import DaddiesBoardShop.Pages.Dialogs.CartDialog;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class InCartDialog {

    CartDialog inDialog;

    @Step
    public void checkJustAddedPurchase() {
        checkCartIsOpened();
        checkPuchaseIsAdded();
    }

    @Step
    public void checkCartIsOpened() {
        Assert.assertTrue(inDialog.checkCartOpening());
    }

    @Step
    public void checkPuchaseIsAdded() {
        Assert.assertTrue(inDialog.justAddedPurchaseIsDisplayed());
    }
}
