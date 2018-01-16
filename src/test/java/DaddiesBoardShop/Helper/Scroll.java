package DaddiesBoardShop.Helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class Scroll {

    static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
    static Actions action = new Actions(getDriver());

    public static void ScrollToElementOnPage(WebElement element) {
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }

    public static void windowScrollRight(int pixels) {
        javascriptExecutor.executeScript("window.scrollBy(" + pixels + ",0)", "");
    }


    public static void tableHorizontalScroll(WebElement element, int horizPixels, int vertPixels) {
        action.dragAndDropBy(element, horizPixels, vertPixels).build().perform();
    }



}
