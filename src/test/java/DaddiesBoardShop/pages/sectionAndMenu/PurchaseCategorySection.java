package DaddiesBoardShop.pages.sectionAndMenu;

import DaddiesBoardShop.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class PurchaseCategorySection extends BasePage {

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

    @FindBy(css = "li.amshopby-advanced > ol > li:nth-child(2) a")
    public WebElement decksOnlyCategory;

    public PurchaseCategorySection(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getCategoriesList() {
        return categoriesList;
    }

    public String getCategoriesTitleText() {
        return categoriesTitle.getText();
    }

    public WebElement getOneCategory(int category) {
        return categoriesList.get(category);
    }

    public void clickOnDecksOnlyCategory() {
        element(decksOnlyCategory).click();
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
