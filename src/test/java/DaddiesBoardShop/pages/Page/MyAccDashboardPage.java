package DaddiesBoardShop.pages.Page;

import DaddiesBoardShop.pages.BasePage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.daddiesboardshop.com/customer/account/")
public class MyAccDashboardPage extends BasePage {

    public MyAccDashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "li.success-msg")
    public WebElement finishRegMessage;

    @FindBy(css = "div.welcome-msg h2.sub-title")
    public WebElement helloRegCustomerMessage;

    @FindBy(css = "p.box-content")
    public WebElement customerData;

    public void openMyAccDashboardPage() {
        open();
    }

    public boolean finishRegMessageIsDisplayed() {
        try {
            return element(finishRegMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public String getHelloCustomerMessageText() {
        return element(helloRegCustomerMessage).getText();
    }

    public String getCustomerDataText() {
        return element(customerData).getText();
    }
}

