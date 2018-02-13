package DaddiesBoardShop.tests.homePageTests;

import DaddiesBoardShop.application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "Test", name = "Test")
public class ElementsAreDisplayedTest extends Application {

    @Test
    public void checkAllElemsAreDisplayed() {
        user.atHomePage.openPage();
        user.atHomePage.checkElementsAreDisplayed();
    }
}
