package DaddiesBoardShop.Tests.HomePageTests;

import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "Test", name = "Test")
public class ElementsAreDisplayedTest extends BaseTest {

    @Test
    public void checkAllElemsAreDisplayed() {
        user.atHomePage.openPage();
        user.atHomePage.checkElementsAreDisplayed();
    }
}
