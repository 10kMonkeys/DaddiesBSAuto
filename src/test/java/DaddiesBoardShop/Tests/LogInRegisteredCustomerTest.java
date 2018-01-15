package DaddiesBoardShop.Tests;

import DaddiesBoardShop.Application.Application;
import org.junit.Test;

public class LogInRegisteredCustomerTest extends Application {

    @Test
    public void logInRegisteredCustomer(){
        atLoginOrCreateAccPage.openPage();
        inApplicationHeader.checkUserIsLogOut();
        atLoginOrCreateAccPage.logInRegisteredCustomer();
        atMyAccDashboardPage.checkRegCustomerData();
    }
}
