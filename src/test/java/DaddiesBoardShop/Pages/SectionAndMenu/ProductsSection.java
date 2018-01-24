package DaddiesBoardShop.Pages.SectionAndMenu;


import DaddiesBoardShop.Helper.Scrolling;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ProductsSection extends PageObject {

//    @FindBy(xpath = "//*[contains(@class,'products-grid')]/div")
//    private List<WebElement> currentProductList;

    @FindBy(xpath = "//a[contains(@title,'Next')]")
    private WebElement nextPageArrow;

    @FindBy(xpath = "//a[contains(@title,'Previous')]")
    private WebElement previousPageArrow;

    @FindBy(xpath = "//div[contains(@class,'pages')]//a[not(@title)]")
    private List<WebElement> pagesQty;

//    public List<WebElement> getCurrentProductList() {
//        return currentProductList;
//    }

    public void productsAreDisplayed(List<WebElement> list) {
        for (int i = 1; i < list.size(); i++) {
            element(list.get(i)).shouldBeVisible();
        }
    }

    public int checkPagesQty() {
        String lastPageStringValue = pagesQty.get(pagesQty.size() - 1).getAttribute("innerText");
        int lastPagage = Integer.parseInt(lastPageStringValue);
        return lastPagage;
    }

    public void goToNextPage() {
            //ПЕРЕНЕСТИ ЦИКЛ!
            for(int i = 0; i < checkPagesQty(); i++) {
                Scrolling.windowScroll(0,10000);
                WebElement next = getDriver().findElement(By.xpath("//a[contains(@title,'Next')]"));
                next.click();
//                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@class,'products-grid')]/div[1]")));
//                waitABit(5000);
        }
    }

    public void checkPriceHighToLowSort(/*List<WebElement> elements*/) {
        waitABit(5000);
        List<WebElement> currentProductList = getDriver().findElements(By.xpath("//*[contains(@class,'products-grid')]/div"));
        for (int i = 0; i < 60; i++) {
            System.out.println(currentProductList.get(i).getText());
        }


    }


}
