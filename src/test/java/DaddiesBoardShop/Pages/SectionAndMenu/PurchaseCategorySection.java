package DaddiesBoardShop.Pages.SectionAndMenu;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PurchaseCategorySection extends PageObject {



    @FindBy(css = "div#Category_title")
    public WebElement categoriesTitle;

    @FindBy(css = "div#Category_content div.jspDrag")
    public WebElement sectionScroll;

    @FindBy(css = "li.amshopby-advanced li")
    public List<WebElement> categoriesList;

    @FindBy(css = "li.amshopby-advanced li.has-child li")
    public List<WebElement> subcategories;

    @FindBy(css = "li.has-child.expanded")
    public WebElement collapsedSubcategories;

    @FindBy(css = "li.has-child.expanded.active")
    public WebElement expandedSubcategories;

    @FindBy(css = "#narrow-by-list .amshopby-advanced .amshopby-cat.has-child .button:after")
    public WebElement icon;

    public List<WebElement> getCategoriesList() {
        return categoriesList;
    }

    public String getCategoriesTitleText() {
        return categoriesTitle.getText();
    }

    public WebElement getOneCategory(int category) {
        return categoriesList.get(category);
    }

    public void clickOnCategory(WebElement element) {
        element.click();
    }

    public boolean categoriesTitleIsDisplayed() {
        return categoriesTitle.isDisplayed();
    }

    public boolean checkQtyOfCotegories(String[] expectedCategories, List<WebElement> actualCategories) {
        return expectedCategories.length == actualCategories.size();
    }

    public void compareActualAndExpectedCategories(String[] expectedCategories, List<WebElement> actualCategories) {
            for (int i = 0; i < expectedCategories.length; i++) {
                Assert.assertEquals(expectedCategories[i], actualCategories.get(i).getAttribute("innerText"));
            }
    }
}
