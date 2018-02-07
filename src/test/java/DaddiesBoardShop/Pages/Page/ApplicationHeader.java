package DaddiesBoardShop.Pages.Page;

import DaddiesBoardShop.Pages.BasePage;
import DaddiesBoardShop.Steps.AtPage.AtLoginOrCreateAccPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationHeader extends BasePage {

    AtLoginOrCreateAccPage atLoginOrCreateAccPage;

    @FindBy(css = "img.account-icon-top-nav")
    private WebElement accountIcon;

    @FindBy(css = "ul.dropdown-menu li:first-child")
    private WebElement loginOrLogOutElem;

    @FindBy(css = "input#search")
    private WebElement searchField;

    @FindBy(css = "button[title='Go']")
    private WebElement goButton;

    public ApplicationHeader(WebDriver driver) {
        super(driver);
    }

    public void userIsLoggedOutVerification() {
        accountIcon.click();

        if ("Login".equals(loginOrLogOutElem.getText())) {
        } else {
            loginOrLogOutElem.click();
        }
    }

    public void userIsLoggedInVerification() {
        accountIcon.click();

        if ("Logout".equals(loginOrLogOutElem.getText())) {
        } else {
            loginOrLogOutElem.click();
            atLoginOrCreateAccPage.logInRegisteredCustomer();
        }
    }

    public void typeSearchRequest(String requestText) {
        element(searchField).sendKeys(requestText);
    }

    public void clickOnGoButton() {
        element(goButton).click();
    }
}
