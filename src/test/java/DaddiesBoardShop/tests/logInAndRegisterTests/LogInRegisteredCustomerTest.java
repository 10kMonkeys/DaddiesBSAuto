package DaddiesBoardShop.tests.logInAndRegisterTests;

import DaddiesBoardShop.application.Application;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class LogInRegisteredCustomerTest extends Application {

    @Before
    public void checkUserIsLogOut() {
        user.atCreateAccountPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
    }

    @Test
    public void logInRegisteredCustomer(){
        user.atLoginOrCreateAccPage.openPage();
        user.atLoginOrCreateAccPage.logInRegisteredCustomer();
        user.atMyAccDashboardPage.checkRegCustomerData()
                .checkRegCustomerHelloMessage()
                .checkFinishRegMessageIsNotShown();
    }
}
