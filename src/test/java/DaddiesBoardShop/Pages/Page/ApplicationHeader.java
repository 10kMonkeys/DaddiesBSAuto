package DaddiesBoardShop.Pages.Page;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ApplicationHeader extends PageObject {

    LoginOrCreateAccPage loginOrCreateAccPage;

    @FindBy(css = "img.account-icon-top-nav")
    public WebElement accountIcon;

    @FindBy(css = "ul.dropdown-menu li:first-child")
    public WebElement loginOrLogOutElem;

    public void userIsLogedOutVerification() {
        accountIcon.click();

        if ("Login".equals(loginOrLogOutElem.getText())) {
        } else {
            loginOrLogOutElem.click();
        }
    }

    public void userIsLogedInVerification() {
        accountIcon.click();

        if ("Logout".equals(loginOrLogOutElem.getText())) {
        } else {
            loginOrLogOutElem.click();
            loginOrCreateAccPage.logInUser();
        }
    }
}
