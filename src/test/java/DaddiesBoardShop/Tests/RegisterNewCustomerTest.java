package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class RegisterNewCustomerTest extends Application {

    @Test
    public void registerNewCustomer() {
        user.atHomePage.openPage();
        user.inApplicationHeader.checkUserIsLogIn();
        user.atCreateAccountPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
        user.atCreateAccountPage.openPage();
        user.atCreateAccountPage.registerNewCustomer();
        user.atMyAccDashboardPage.checkJustRegCustomerData();
    }
}
