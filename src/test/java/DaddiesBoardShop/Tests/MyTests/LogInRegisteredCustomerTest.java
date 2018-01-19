package DaddiesBoardShop.Tests.MyTests;

import DaddiesBoardShop.Application.Application;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class LogInRegisteredCustomerTest extends Application {

    @Test
    public void logInRegisteredCustomer(){
        user.atLoginOrCreateAccPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
        user.atLoginOrCreateAccPage.logInRegisteredCustomer();
        user.atMyAccDashboardPage.checkRegCustomerData();
    }
}
