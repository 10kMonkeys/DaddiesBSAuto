package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class LongBrandListTest extends Application{

    @Test
    public void checkLongBrandList() {
        atLongboardsPage.openLongboardsPage();
        atLongboardsPage.getLongBrandList();
    }
}
