package DaddiesBoardShop.Tests.HomePageTests;

import DaddiesBoardShop.application.TestRunner;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "Test", name = "Test")
public class ElementsAreDisplayedTest extends TestRunner {

    @Test
    public void checkAllElemsAreDisplayed() {
        user.atHomePage.openPage();
        user.atHomePage.checkElementsAreDisplayed();
    }
}
