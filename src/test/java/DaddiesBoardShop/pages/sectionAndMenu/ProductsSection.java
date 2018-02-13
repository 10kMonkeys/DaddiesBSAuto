package DaddiesBoardShop.pages.sectionAndMenu;

import DaddiesBoardShop.helper.Scrolling;
import DaddiesBoardShop.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsSection extends BasePage {

    public static int pagesQty;

    Actions act = new Actions(getDriver());

    @FindBy(xpath = "//*[contains(@class,'products-grid')]/div")
    private List<WebElement> currentProductList;

    @FindBy(css = "div.price-box span.special-price, span.regular-price")
    private List<WebElement> productPricesList;

    @FindBy(css = "//*[contains(@class,'products-grid')]/div//h3//a")
    private List<WebElement> productTitleList;

    @FindBy(xpath = "//div[contains(@class,'pages')]//a[not(@title)]")
    private List<WebElement> pagesQtyList;

    @FindBy(xpath = "//*[contains(@class,'products-grid')]/div[1]")
    private WebElement firstProduct;

    @FindBy(css = "#amshopby-page-container > div.category-products > div.pager-bottom > div > div.pages > ol > li:last-child > a") // a.i-next
    private WebElement nextButton;

    @FindBy(css = "div.product-details")
    private WebElement productDetails;

    @FindBy(css = "div.VisibleOnHover")
    private WebElement extendedDetails;

    @WhenPageOpens
    public void waitCategoryAppears() {
        element(firstProduct);
    }

    public ProductsSection(WebDriver driver) {
        super(driver);
    }

    public boolean productDetailsAreDisplayed() {
        return element(productDetails).isDisplayed();
    }

    public boolean extendedDetailsAreNotDisplayed() {
        try {
            return element(extendedDetails).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void plcaeCursorOverProdDetail() {
        act.moveToElement(element(productDetails)).build().perform();
    }

    public List<WebElement> getCurrentProductList() {
        return currentProductList;
    }

    public List<WebElement> getProductPricesList() {
        return productPricesList;
    }

    public boolean productsAreDisplayed(List<WebElement> list) {
        if (list.size() != 0) {
            for (int i = 1; i < list.size(); i++) {
                return element(list.get(i)).isDisplayed();
            }
        }
        return false;
    }

    public void checkPagesQty() {
        String lastPageStringValue = pagesQtyList.get(pagesQtyList.size() - 1).getAttribute("innerText");
        pagesQty = Integer.parseInt(lastPageStringValue) - 1;
    }

    public void goToNextPage() {
        Scrolling.ScrollToElementOnPage(nextButton);

        element(nextButton).click();

        try {
            wait.until(ExpectedConditions.stalenessOf(nextButton));
        } catch (Exception e) {
        }
    }

    private List<Double> prepareAndGetPriceValues(List<WebElement> currentProductPricesList) {
        ArrayList<Double> tempPricesList = new ArrayList<>(currentProductPricesList.size());

        for (int i = 0; i < currentProductPricesList.size(); i++) {
            tempPricesList.add(Double.parseDouble(currentProductPricesList.get(i)
                    .getAttribute("innerText").replaceAll("[^\\d.]+", "")));
        }
        return tempPricesList;
    }

    private List<String> prepareTitleValues(List<WebElement> currentProductPricesList) {
        ArrayList<String> tempTitleList = new ArrayList<>(currentProductPricesList.size());

        for (int i = 0; i < currentProductPricesList.size(); i++) {
            tempTitleList.add(currentProductPricesList.get(i).getAttribute("title"));
        }
        return tempTitleList;
    }

    public boolean checkPriceLowToHighSort(List<WebElement> currentProductPricesList) {

        List<Double> PagePriceSorting = prepareAndGetPriceValues(currentProductPricesList);
        List<Double> PreparedSorting = prepareAndGetPriceValues(currentProductPricesList);

        Collections.sort(PreparedSorting);

        return PreparedSorting.equals(PagePriceSorting);
    }

    public boolean checkPriceHighToLowSort(List<WebElement> currentProductPricesList) {

        List<Double> PagePriceSorting = prepareAndGetPriceValues(currentProductPricesList);
        List<Double> PreparedSorting = prepareAndGetPriceValues(currentProductPricesList);

        PreparedSorting.sort(Collections.reverseOrder());

        return PreparedSorting.equals(PagePriceSorting);
    }

    public boolean checkAToZSort(List<WebElement> currentProductPricesList) {

        List<String> PageTitleSorting = prepareTitleValues(currentProductPricesList);
        List<String> PreparedSorting = prepareTitleValues(currentProductPricesList);

        Collections.sort(PreparedSorting);

        return PreparedSorting.equals(PageTitleSorting);
    }
}
