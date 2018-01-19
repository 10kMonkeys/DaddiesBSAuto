package DaddiesBoardShop.Pages;

import DaddiesBoardShop.Helper.Scroll;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.List;

@DefaultUrl("https://www.daddiesboardshop.com/")
public class HomePage extends PageObject {

    @FindBy(css = "div.homepage-row div.homepage-banner img")
    public WebElement homePageBanner;

    @FindBy(css = "div.homepage-row div.homepage-deals img")
    public WebElement homePageDealsPicture;

    @FindBy(css = "div.home-brands a img")
    public List<WebElement> homePageBrandsList;

    @FindBy(css = "img[alt='Longboards']")
    public WebElement longboardsCategory;

    @FindBy(css = "div.section.list h3")
    public List<WebElement> sectionTitlesList;

    @FindBy(css = "ul.categories_list_new img")
    public List<WebElement> partnerPicsList;

    @FindBy(css = "ul.categories_list_new span.ttl")
    public List<WebElement> partnerTitlesList;

    @FindBy(css = "ul.categories_list img")
    public List<WebElement> popularCategoriesPicsList;

    @FindBy(css = "ul.categories_list span.ttl")
    public List<WebElement> popularCategoriesTitlesList;

    @FindBy(css = "div.home-bottom-content img")
    public List<WebElement> bottomSectionFlagPicsList;

    @FindBy(css = "div.home-about-daddies")
    public WebElement aboutDaddiesSection;

    @FindBy(css = "div.home-team-riders img")
    public WebElement teamRidersSection;

    @FindBy(css = "div.home-about-daddies a")
    public WebElement checkItLink;

    public void openHomePage() {
        open();
    }

    public boolean homePageBannerIsDisplayed() {
        return homePageBanner.isDisplayed();
    }

    public boolean homePageDealsPictureIsDisplayed() {
        return homePageDealsPicture.isDisplayed();
    }

    public boolean aboutDaddiesSectionIsDisplayed() {
        return aboutDaddiesSection.isDisplayed();
    }

    public boolean teamRidersSectionIsDisplayed() {
        return teamRidersSection.isDisplayed();
    }

    public boolean checkItLinkIsDisplayed() {
        return checkItLink.isDisplayed();
    }

    public boolean homePageBrandsListIsDisplayed() {
        return listOfElementsIsDisplayed1(homePageBrandsList, 10);
    }

    public boolean partnerPicsListIsDisplayed() {
        return listOfElementsIsDisplayed1(partnerPicsList, 4);
    }

    public boolean popularCategoriesPicsListIsDisplayed() {
        return listOfElementsIsDisplayed1(popularCategoriesPicsList, 6);
    }

    public boolean bottomSectionFlagPicsListIsDisplayed() {
        return listOfElementsIsDisplayed1(bottomSectionFlagPicsList, 2);
    }

    public boolean sectionTitlesListIsDisplayed() {
        return listOfElementsIsDisplayed1(sectionTitlesList, 2);
    }

    public boolean partnerTitlesListIsDisplayed() {
        return listOfElementsIsDisplayed1(partnerTitlesList, 4);
    }

    public boolean popularCategoriesTitlesListIsDisplayed() {
        return listOfElementsIsDisplayed1(popularCategoriesTitlesList, 6);
    }

    public String getSectionTitlesListText(int title) {
        return sectionTitlesList.get(title).getAttribute("textContent");
    }

    public String getPartnerTitlesListText(int title) {
        return partnerTitlesList.get(title).getAttribute("textContent");
    }

    public String getPopularCategoriesTitlesListText(int title) {
        return popularCategoriesTitlesList.get(title).getAttribute("textContent");
    }

    private boolean listOfElementsIsDisplayed1(List<WebElement> list, int listSize) {
        if (list.size() == listSize) {
            for (int i = 0; i < list.size(); i++) {
                if (!list.get(i).isDisplayed()) {
                    return false;
                }
            }
            return true;
        }
        System.out.println("*************************************List size is not expected*************************************");
        return false;
    }

    //REMOVE AFTER PROJECT UPDATE
    @Step
    public void openLongboardsCategory() {
        openHomePage();
        Scroll.ScrollToElementOnPage(longboardsCategory);
        longboardsCategory.click();
    }
}
