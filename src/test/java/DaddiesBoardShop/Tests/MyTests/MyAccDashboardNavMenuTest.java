package DaddiesBoardShop.Tests.MyTests;

import DaddiesBoardShop.Application.Application;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class MyAccDashboardNavMenuTest extends Application {


    public void checkMyNavigationMenu() {
        user.atLoginOrCreateAccPage.openPage();
        user.atLoginOrCreateAccPage.logInRegisteredCustomer();
        user.atMyAccDashboardPage.checkMyAccNavigationMenuIsDisplayed();
    }
}
