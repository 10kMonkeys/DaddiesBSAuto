package DaddiesBoardShop.Tests.MyTests;

import DaddiesBoardShop.Application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
@WithTag(type = "My", name = "Test")
public class HorizontalScrollTest extends Application {


    public void horizScrollToMountTitle() {
        user.atLongboardsPage.openLongboardsPage();
//        user.atLongboardsPage.getHorizonScrollMountainTitle();
    }
}
