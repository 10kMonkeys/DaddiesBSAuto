package DaddiesBoardShop.Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SortBySection extends PageObject {

    @FindBy(css = "div.sort-by")
    public List<WebElement> sortByTitle;

    public void getSortByListElement() {
        
    }

}
