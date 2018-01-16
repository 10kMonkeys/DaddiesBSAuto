package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Helper.JSExecuter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.daddiesboardshop.com/")
public class HomePage extends PageObject {

    @FindBy(css = "img[alt='Longboards']")
    public WebElement longboardsCategory;

    @Step
    public void openHomePage() {
        open();
    }

    @Step
    public void openLongboardsCategory() {
        openHomePage();
        JSExecuter.ScrollToElementOnPage(longboardsCategory);
        longboardsCategory.click();
    }
}
