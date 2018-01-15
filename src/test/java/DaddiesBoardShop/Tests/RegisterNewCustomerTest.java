package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class RegisterNewCustomerTest extends Application {

    @Test
    public void registerNewCustomer() {
        atCreateAccountPage.openPage();
        inApplicationHeader.checkUserIsLogOut();
        atCreateAccountPage.registerNewCustomer();
        atMyAccDashboardPage.checkJustRegCustomerData();

    }
}
