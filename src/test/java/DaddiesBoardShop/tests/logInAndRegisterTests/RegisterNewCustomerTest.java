package DaddiesBoardShop.tests.logInAndRegisterTests;

import DaddiesBoardShop.application.TestRunner;
import DaddiesBoardShop.model.NewCustomer;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Test;

@WithTag(type = "My", name = "Test")
public class RegisterNewCustomerTest extends TestRunner {

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
