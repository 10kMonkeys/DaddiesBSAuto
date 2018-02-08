package DaddiesBoardShop.Pages.Page;

import DaddiesBoardShop.Pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PurchasePage extends BasePage{

    public PurchasePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div.acc-section-title")
    private WebElement optionsMenu;

    @FindBy(css = "div#dk_container_bundle-option-212927")
    private WebElement addSkateToolMenu;

    @FindBy(css = "div#dk_container_bundle-option-212927 li:nth-child(2)")
    private WebElement daddiesSkateTool;

    @FindBy(css = "button.btn-cart")
    private WebElement addToCartButton;

    @FindBy(css = "div#dk_container_bundle-option-212927 span.dk_label")
    private WebElement addedSkateTool;

    public void clickOnOptionsMenu() {
        element(optionsMenu).click();
    }

    public void clickOnAddSkateToolMenu() {
        element(addSkateToolMenu).click();
    }

    public void clickOnDaddiesSkateTool() {
        element(daddiesSkateTool).click();
    }

    public void clickOnAddToCartButton() {
        element(addToCartButton).click();
    }

    public String getAddedSkateToolText() {
        return element(addedSkateTool).getText();
    }
}
