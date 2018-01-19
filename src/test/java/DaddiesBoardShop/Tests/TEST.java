package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class TEST extends Application{

    @Test
    public void testmethod() {
        user.atLongboardsPage.openLongboardsPage();
        user.atLongboardsPage.checkPageNavigation();

    }
}
