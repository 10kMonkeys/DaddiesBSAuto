package DaddiesBoardShop.Tests.HomePageTests;

import DaddiesBoardShop.Application.Application;
import DaddiesBoardShop.Pages.Page.BasePage;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "Test", name = "Test")
public class TextDataAreCorrectTest extends BaseTest{

    @Test
    public void checkAllDataAreCorrect() {
        user.atHomePage.openPage();
        user.atHomePage.checkAllElementsTextData();
    }
}
