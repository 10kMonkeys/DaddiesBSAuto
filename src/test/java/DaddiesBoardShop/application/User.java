package DaddiesBoardShop.application;

import DaddiesBoardShop.steps.atPage.AtSearchResultPage;
import DaddiesBoardShop.steps.atPage.*;
import DaddiesBoardShop.steps.inSectionAndMenu.InApplicationHeader;
import DaddiesBoardShop.steps.inDialogs.InCartDialog;
import DaddiesBoardShop.steps.inSectionAndMenu.InMyAccNavigationMenu;
import DaddiesBoardShop.steps.inSectionAndMenu.InPurchaseCategorySection;
import DaddiesBoardShop.steps.inSectionAndMenu.InProductSection;
import DaddiesBoardShop.steps.inSectionAndMenu.InPurchaseSortBySection;
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
