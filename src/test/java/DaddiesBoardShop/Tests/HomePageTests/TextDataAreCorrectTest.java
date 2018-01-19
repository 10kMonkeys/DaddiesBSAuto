package DaddiesBoardShop.Tests.HomePageTests;

import DaddiesBoardShop.Application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "Test", name = "HomePage")
public class TextDataAreCorrectTest extends Application{

    @Test
    public void checkAllDataAreCorrect() {
        user.atHomePage.openPage();
        user.atHomePage.checkAllElementTextData();
    }
}
