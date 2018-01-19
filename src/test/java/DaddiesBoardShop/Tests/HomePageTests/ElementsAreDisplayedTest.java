package DaddiesBoardShop.Tests.HomePageTests;

import DaddiesBoardShop.Application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "Test", name = "HomePage")
public class ElementsAreDisplayedTest extends Application {

    @Test
    public void checkAllElemsAreDisplayed() {
        user.atHomePage.openPage();
        user.atHomePage.checkElementsAreDisplayed();
    }
}
