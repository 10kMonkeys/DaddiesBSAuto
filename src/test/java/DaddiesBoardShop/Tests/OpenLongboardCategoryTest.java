package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class OpenLongboardCategoryTest extends Application {

    @Test
    public void checkLongCategoryOpening() {
        atHomePage.openLongboardCategory();
    }
}
