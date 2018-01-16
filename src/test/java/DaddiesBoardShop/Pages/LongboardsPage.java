package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Helper.JSExecuter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

@DefaultUrl("https://www.daddiesboardshop.com/longboards")
public class LongboardsPage extends PageObject {

    @FindBy(css = "div#Brand_content li")
    public List<WebElement> brandList;

    @Step
    public void openLongboardsPage() {
        open();
    }

    @Step
    public boolean omenBrandIsDisplayed() {
        return brandList.get(55).isDisplayed();
    }

    @Step
    public void checkOmenBrand() {
        Assert.assertFalse(omenBrandIsDisplayed());
        JSExecuter.ScrollToElementOnPage(brandList.get(55));
        Assert.assertTrue(omenBrandIsDisplayed());
    }
}
