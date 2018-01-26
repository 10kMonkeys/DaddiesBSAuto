package DaddiesBoardShop.Pages.SectionAndMenu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PurchaseSortBySection extends PageObject {

    @FindBy(css = "div.sort-by")
    public WebElement sortByTitle;

    @FindBy(css = "a[data-order = 'position']")
    public WebElement bestSellersSort;

    @FindBy(css = "a[data-order = 'newest']")
    public WebElement newestSort;

    @FindBy(css = "a[data-order = 'name']")
    public WebElement aToZSort;

    @FindBy(css = "a[data-order = 'pricelow']")
    public WebElement priceLowSort;

    @FindBy(css = "a[data-order = 'pricehigh']")
    public WebElement priceHighSort;

    @FindBy(css = "li.selected a[data-order = 'position']")
    public WebElement selectedBestSellers;

    @FindBy(css = "li.selected a[data-order = 'newest']")
    public WebElement selectedNewestSort;

    @FindBy(css = "li.selected a[data-order = 'name']")
    public WebElement selectedAToZSort;

    @FindBy(css = "li.selected a[data-order = 'pricelow']")
    public WebElement selectedPriceLowSort;

    @FindBy(css = "li.selected a[data-order = 'pricehigh']")
    public WebElement selectedPriceHighSort;

    public void clickOnBestSellersSort() {
        bestSellersSort.click();
    }

    public void clickOnNewestSort() {
        newestSort.click();
    }

    public void clickOnAToZSort() {
        aToZSort.click();
    }

    public void clickOnpriceLowSort() {
        priceLowSort.click();
    }

    public void clickOnPriceLowSort() {
        priceLowSort.click();
    }

    public String getSortByTitleText() {
        return sortByTitle.getText();
    }

    public String getBestSellersSortText() {
        return bestSellersSort.getText();
    }

    public String getNewestSortText() {
        return newestSort.getText();
    }

    public String getAToZSortText() {
        return aToZSort.getText();
    }

    public String getPriceLowSortText() {
        return priceLowSort.getText();
    }

    public String getPriceHighSortText() {
        return priceHighSort.getText();
    }


}
