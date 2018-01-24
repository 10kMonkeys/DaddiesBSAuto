package DaddiesBoardShop.Steps.AtPage;

import DaddiesBoardShop.Pages.Page.MyAccDashboardPage;
import DaddiesBoardShop.Pages.SectionAndMenu.MyAccountNavigationMenu;
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
