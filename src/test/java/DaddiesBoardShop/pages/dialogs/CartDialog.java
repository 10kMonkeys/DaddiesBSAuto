package DaddiesBoardShop.pages.dialogs;

import DaddiesBoardShop.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CartDialog extends BasePage {

    public CartDialog(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div#topCartContent")
    private WebElement cartDialog;

    @FindBy(css = "a.action-link-remove")
    private WebElement removeLink;

    @FindBy(css = "div#mini-cart td")
    private List<WebElement> addedPurchase;

    public boolean checkCartOpening() {
        wait.until(ExpectedConditions.visibilityOf(removeLink));

        return element(cartDialog).isDisplayed();
    }

    public boolean justAddedPurchaseIsDisplayed() {
        for (int i = 0; i < 3; i++) {
            if(addedPurchase.get(i).isDisplayed()) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}
