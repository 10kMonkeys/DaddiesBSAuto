package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class MyAccDashboardNavMenuTest extends Application {

    @Test
    public void checkMyNavigationMenu() {
        atLoginOrCreateAccPage.openPage();
        atLoginOrCreateAccPage.logInRegisteredCustomer();
        atMyAccDashboardPage.checkMyAccNavigationMenuIsDisplayed();
    }
}
