package DaddiesBoardShop.Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class JSExecuter {

    static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();

    public static void ScrollToElementOnPage(WebElement element) {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }
}
