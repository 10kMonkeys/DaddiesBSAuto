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

    public static void windowScroll(int horizPixels, int vertPixels) {
        javascriptExecutor.executeScript("window.scrollBy(" + horizPixels + ", "+ vertPixels+ ")", "");
    }

    public static void tableDragAndDropScroll(WebElement element, int horizPixels, int vertPixels) {
        action.dragAndDropBy(element, horizPixels, vertPixels).build().perform();
    }
}
