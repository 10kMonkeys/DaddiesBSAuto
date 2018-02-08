package DaddiesBoardShop.Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.WhenPageOpens;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class BasePage extends PageObject {

    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(getDriver(), 5);
    }
}
