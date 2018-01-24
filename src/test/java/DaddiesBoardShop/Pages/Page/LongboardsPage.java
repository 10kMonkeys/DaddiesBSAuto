package DaddiesBoardShop.Pages.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.daddiesboardshop.com/longboards")
public class LongboardsPage extends PageObject {

    @FindBy(css = "div.breadcrumbs ul")
    public WebElement pageNavigation;

    @FindBy(css = "h1.category-name")
    public WebElement categoryName;

    public void openLongboardsPage() {
        open();
    }

    public WebElement getPageNavigation() {
        return pageNavigation;
    }

    public WebElement getCategoryName() {
        return categoryName;
    }


}
