package DaddiesBoardShop.tests.longboardsPageTests;

import DaddiesBoardShop.application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class ProductDetailsTest extends Application {

    @Test
    public void checkDetailsSections() {
        user.atLongboardsPage.openLongboardsPage();
        user.inProductSection.detailsAreShownCorrectlyByDefault();
        user.inProductSection.detailsAreShownCorrectlyUnderCusros();
    }
}
