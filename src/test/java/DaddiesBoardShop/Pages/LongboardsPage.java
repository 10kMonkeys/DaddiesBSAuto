package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Helper.Scroll;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

@DefaultUrl("https://www.daddiesboardshop.com/longboards")
public class LongboardsPage extends PageObject {

    @FindBy(css = "div#Brand_content li a")
    public List<WebElement> brandList;

    @FindBy(css = "div#Brand_content li:nth-child(56) a")
    public WebElement brandOmen;

    @FindBy(css = "div#Mounting_title")
    public WebElement mountainTitle;

    @FindBy(css = "div.jspHorizontalBar div.jspDrag")
    public WebElement scrollHoriz;

    @Step
    public void openLongboardsPage() {
        open();
    }

    @Step
    public void scrollToOmenBrand() {
        Scroll.ScrollToElementOnPage(brandList.get(55));
        Assert.assertTrue(brandOmen.isDisplayed());
    }

    @Step
    public void horizScrollToMountainTitle() {
        Scroll.tableDragAndDropScroll(scrollHoriz, 250,0);
        Assert.assertTrue(mountainTitle.isDisplayed());
    }

}
