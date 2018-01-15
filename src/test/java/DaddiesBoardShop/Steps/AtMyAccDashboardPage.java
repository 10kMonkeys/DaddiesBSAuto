package DaddiesBoardShop.Steps;

import DaddiesBoardShop.Pages.MyAccDashboardPage;
import DaddiesBoardShop.Pages.MyAccountNavigationMenu;
import net.thucydides.core.annotations.Step;

public class AtMyAccDashboardPage {

    MyAccDashboardPage onPage;
    MyAccountNavigationMenu inMyAccNavigationMenu;

    @Step
    public void checkJustRegCustomerData() {
        onPage.checkJustRegCustomer();
    }

    @Step
    public void checkRegCustomerData() {
        onPage.checkRegCustomer();
    }

    @Step
    public void checkMyAccNavigationMenuIsDisplayed() {
        inMyAccNavigationMenu.myAccNavigationMenuIsDisplayed();
    }
}
