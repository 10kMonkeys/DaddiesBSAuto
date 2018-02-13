package DaddiesBoardShop.Application;

import DaddiesBoardShop.steps.AtPage.AtSearchResultPage;
import DaddiesBoardShop.steps.AtPage.*;
import DaddiesBoardShop.steps.InSectionAndMenu.InApplicationHeader;
import DaddiesBoardShop.steps.InDialogs.InCartDialog;
import DaddiesBoardShop.steps.InSectionAndMenu.InMyAccNavigationMenu;
import DaddiesBoardShop.steps.InSectionAndMenu.InPurchaseCategorySection;
import DaddiesBoardShop.steps.InSectionAndMenu.InProductSection;
import DaddiesBoardShop.steps.InSectionAndMenu.InPurchaseSortBySection;
import net.thucydides.core.annotations.Steps;

public class User {

    @Steps
    public AtCreateAccountPage atCreateAccountPage;

    @Steps
    public AtLoginOrCreateAccPage atLoginOrCreateAccPage;

    @Steps
    public AtMyAccDashboardPage atMyAccDashboardPage;

    @Steps
    public AtHomePage atHomePage;

    @Steps
    public InApplicationHeader inApplicationHeader;

    @Steps
    public AtLongboardsPage atLongboardsPage;

    @Steps
    public InPurchaseCategorySection inLongboardsCategorySection;

    @Steps
    public InProductSection inProductSection;

    @Steps
    public InPurchaseSortBySection inPurchaseSortBySection;

    @Steps
    public InMyAccNavigationMenu inMyAccNavigationMenu;

    @Steps
    public AtSearchResultPage atSearchResultPage;

    @Steps
    public AtPurchasePage atPurchasePage;

    @Steps
    public InCartDialog inCartDialog;
}
