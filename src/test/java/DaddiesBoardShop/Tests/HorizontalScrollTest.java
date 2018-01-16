package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class HorizontalScrollTest extends Application {

    @Test
    public void horizScrollToMountTitle() {
        atLongboardsPage.openLongboardsPage();
        atLongboardsPage.getHorizonScrollMountainTitle();
    }
}
