package DaddiesBoardShop.Tests.LogInAndRegisterTests;

import DaddiesBoardShop.Application.Application;
import DaddiesBoardShop.Model.NewCustomer;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class RegisterNewCustomerTest extends Application {

    @Before
    public void checkUserIsLogOut() {
        NewCustomer nc = new NewCustomer();

        user.atCreateAccountPage.openPage();
        user.inApplicationHeader.checkUserIsLogOut();
    }


    @Test
    public void registerNewCustomer() {
        user.atCreateAccountPage.openPage();
        user.atCreateAccountPage.enterFirstName()
                .enterLastName()
                .enterEmailAddress()
                .enterPassword()
                .enterConfirmedPassword()
                .clickSubmitButton();
        user.atMyAccDashboardPage.checkJustRegHelloMessage()
                .checkJustRegCustomerData()
                .checkFinishRegMessage();
    }
}
