package DaddiesBoardShop.pages.page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends PageObject {

    private int counter = 0;

    @FindBy(css = "div.category-products div.item")
    private List<WebElement> searchResults;

    @FindBy(css = "div.products-grid > :nth-child(1)")
    private WebElement serchResult;

    public boolean findPurchaseInResult(String purchase) {
        while (counter < searchResults.size()) {
            if (searchResults.get(counter).getAttribute("innerText").contains(purchase)) {
                counter++;
                return true;
            } else {
                counter++;
            }
        }
        return false;
    }

    public void clickOnPurchase() {
        element(By.cssSelector("div.products-grid > :nth-child(" + counter + ")")).click();
    }
}
