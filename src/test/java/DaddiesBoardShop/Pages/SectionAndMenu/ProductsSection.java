package DaddiesBoardShop.Pages.SectionAndMenu;


import DaddiesBoardShop.Helper.Scrolling;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductsSection extends PageObject {

    public static int pagesQty;
    WebDriver driver = getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 5);
//                wait.until(ExpectedConditions.elementToBeClickable(nextButton));

    @FindBy(xpath = "//*[contains(@class,'products-grid')]/div")
    private List<WebElement> currentProductList;

    @FindBy(css = "div.price-box span.special-price, span.regular-price")
    private List<WebElement> productPricesList;

    @FindBy(css = "//*[contains(@class,'products-grid')]/div//h3//a")
    private List<WebElement> productTitleList;

        @FindBy(xpath = "//a[contains(@title,'Next')]")
    private WebElement nextPageArrow;

    @FindBy(xpath = "//a[contains(@title,'Previous')]")
    private WebElement previousPageArrow;

    @FindBy(xpath = "//div[contains(@class,'pages')]//a[not(@title)]")
    private List<WebElement> pagesQtyList;

    @FindBy(xpath = "//*[contains(@class,'products-grid')]/div[1]")
    private WebElement firstProduct;

    @FindBy(css = "#amshopby-page-container > div.category-products > div.pager-bottom > div > div.pages > ol > li:last-child > a")
    private WebElement nextButton;

    @WhenPageOpens
    public void waitCategoryAppears() {
        element(firstProduct).waitUntilVisible();
    }

    public ProductsSection(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getCurrentProductList() {
        return currentProductList;
    }

    public List<WebElement> getProductPricesList() {
        return productPricesList;
    }

    public void productsAreDisplayed(List<WebElement> list) {
        for (int i = 1; i < list.size(); i++) {
            element(list.get(i)).shouldBeVisible();
        }
    }

    public void checkPagesQty() {
        String lastPageStringValue = pagesQtyList.get(pagesQtyList.size() - 1).getAttribute("innerText");
        pagesQty = Integer.parseInt(lastPageStringValue);
    }

    public void compareTwoLists(List<Double> tempList1, List<Double> sortedList ) {

    }

    public void goToNextPage() {
//        Scrolling.ScrollToElementOnPage(nextButton);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#amshopby-page-container > div.category-products > div.pager-bottom > div > div.pages > ol > li:last-child > a")));
//        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        element(nextButton).click();
//        element(firstProduct).waitUntilVisible();
//        wait.until(driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete"));


//        waitABit(4000);
//                return element(firstProduct).isPresent();

    }


    public List<Double> prepareAndGetPriceValues(List<WebElement> currentProductPricesList) {
        ArrayList<Double> tempPricesList = new ArrayList<>(currentProductPricesList.size());

        for(int i = 0; i < currentProductPricesList.size(); i++) {
            tempPricesList.add(Double.parseDouble(currentProductPricesList.get(i)
                    .getAttribute("innerText").replaceAll("[^\\d.]+", "")));
        }
        return tempPricesList;
    }

    public List<String> prepareTitleValues(List<WebElement> currentProductPricesList) {
        ArrayList<String> tempTitleList = new ArrayList<>(currentProductPricesList.size());

        for(int i = 0; i < currentProductPricesList.size(); i++) {
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

        Collections.sort(PreparedSorting, Collections.reverseOrder());

        return PreparedSorting.equals(PagePriceSorting);
    }

    public boolean checkAToZSort(List<WebElement> currentProductPricesList) {

        List<String> PageTitleSorting = prepareTitleValues(currentProductPricesList);
        List<String> PreparedSorting = prepareTitleValues(currentProductPricesList);

        Collections.sort(PreparedSorting);

        return PreparedSorting.equals(PageTitleSorting);
    }



}
