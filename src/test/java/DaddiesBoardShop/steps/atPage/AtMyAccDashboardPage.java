package DaddiesBoardShop.steps.atPage;

import DaddiesBoardShop.helper.UsersProperties;
import DaddiesBoardShop.pages.page.MyAccDashboardPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AtMyAccDashboardPage {

    MyAccDashboardPage onPage;

    @Step
    public void checkFinishRegMessage() {
        Assert.assertTrue(onPage.finishRegMessageIsDisplayed());
    }

    @Step
    public AtMyAccDashboardPage checkJustRegHelloMessage() {
        Assert.assertEquals("Hello, " + UsersProperties.INSTANCE.getProperty("NewUserFirstName")
                + " " + UsersProperties.INSTANCE.getProperty("NewUserLastName")
                + "!", onPage.getHelloCustomerMessageText());
        return this;
    }

    @Step
    public AtMyAccDashboardPage checkJustRegCustomerData() {
        Assert.assertTrue(onPage.getCustomerDataText()
                .contains(UsersProperties.INSTANCE.getProperty("NewUserFirstName")));

        Assert.assertTrue(onPage.getCustomerDataText()
                .contains(UsersProperties.INSTANCE.getProperty("NewUserLastName")));

        Assert.assertTrue(onPage.getCustomerDataText()
                .contains(UsersProperties.INSTANCE.getProperty("NewUserEmail")));
        return this;
    }

    @Step
    public void checkFinishRegMessageIsNotShown() {
        Assert.assertFalse(onPage.finishRegMessageIsDisplayed());
    }

    @Step
    public AtMyAccDashboardPage checkRegCustomerHelloMessage() {
        Assert.assertEquals("Hello, " + UsersProperties.INSTANCE.getProperty("UserFirstName")
                + " " + UsersProperties.INSTANCE.getProperty("UserLastName")
                + "!", onPage.getHelloCustomerMessageText());
        return this;
    }

    @Step
    public AtMyAccDashboardPage checkRegCustomerData() {
        Assert.assertTrue(onPage.getCustomerDataText()
                .contains(UsersProperties.INSTANCE.getProperty("UserFirstName")));

        Assert.assertTrue(onPage.getCustomerDataText()
                .contains(UsersProperties.INSTANCE.getProperty("UserLastName")));

        Assert.assertTrue(onPage.getCustomerDataText()
                .contains(UsersProperties.INSTANCE.getProperty("UserEmail")));
        return this;
    }
}
